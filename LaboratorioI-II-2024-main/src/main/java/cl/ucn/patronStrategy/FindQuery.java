package cl.ucn.patronStrategy;

import cl.ucn.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class FindQuery extends FindStrategy{
    private TypedQuery<Usuario> find(int rut, EntityManager em)
    {
        String jpql = "SELECT u from Usuario u WHERE u.rut = :rut";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setParameter("rut", rut);
        return query;
    }

    @Override
    Usuario find(Buscar buscar) {
        TypedQuery<Usuario> query = this.find(buscar.rut,buscar.em);
        try{
            Usuario usuario = query.getSingleResult();
            return usuario;
        }catch (Exception e)
        {
            System.out.println("No se encontro el usuario con el rut: "+buscar.getRut()+" En la base de datos sql");
        }
        return null;
    }
}
