package cl.ucn.main;

import cl.ucn.modelo.Usuario;
import cl.ucn.patronStrategy.Buscar;
import jakarta.persistence.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("multimediaApp");
        EntityManager em = emf.createEntityManager();

        // Parte 1
        int rut = 89830291;
        Buscar buscar = new Buscar(rut,em);


        try {
            Usuario usuario = buscar.user();
            if(usuario != null) System.out.println("El usuario: " + usuario.getRut() + " existe!");

        }catch (NoResultException e){
            System.out.println("El usuario no existe!");
        }

        // Parte 2
        String jpql = "SELECT u from Usuario u";
        TypedQuery<Usuario> query1 = em.createQuery(jpql, Usuario.class);
        List<Usuario> usuarios = query1.getResultList();
        for (Usuario usuario : usuarios){

            System.out.println("Rut: " + usuario.getRut() + " Permiso: " + usuario.isTienePermiso() + " Archivo: " +
                    usuario.getRecursosMultimedia().getNombre() + " Protegido: " + usuario.getRecursosMultimedia().isProtegido());

        }

        em.close();

    }
}
