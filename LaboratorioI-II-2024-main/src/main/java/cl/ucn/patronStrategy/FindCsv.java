package cl.ucn.patronStrategy;

import cl.ucn.modelo.Usuario;
import cl.ucn.util.Util;

import java.util.List;

public class FindCsv extends FindStrategy{

    @Override
    Usuario find(Buscar buscar) {
        Util util = new Util();
        List<Usuario> usuarios = util.loadCsv();
        for(Usuario usuario:usuarios)
        {
            if(usuario.getRut()==buscar.getRut())
            {
                System.out.println("El usuario "+usuario.getNombre()+", se encontro en la base de datos csv.");
                return usuario;
            }
        }
        return null;
    }
}
