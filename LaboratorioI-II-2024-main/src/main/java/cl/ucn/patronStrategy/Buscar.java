package cl.ucn.patronStrategy;

import cl.ucn.modelo.Usuario;
import jakarta.persistence.EntityManager;

public class Buscar {
    //Atributos
    int rut;
    EntityManager em;

    FindStrategy strategy;


    public Buscar(int rut, EntityManager em)
    {
       this.rut = rut;
       this.em=em;
       strategy = new FindQuery();
    }
    public int getRut()
    {
        return rut;
    }
    public EntityManager getEm()
    {
        return em;
    }
    //Metodos

    public Usuario user()
    {
        Usuario user= strategy.find(this);
        if(user==null){
            this.strategy = new FindCsv();
        }
        Usuario usuario= strategy.find(this);

        //Se vuelve a usar la estrategia inicial
        this.strategy = new FindQuery();
        return usuario;
    }

    public void setFindStrategy(FindStrategy strategy)
    {
        this.strategy = strategy;
    }
}
