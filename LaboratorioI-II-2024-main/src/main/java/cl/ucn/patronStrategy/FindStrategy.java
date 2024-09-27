package cl.ucn.patronStrategy;

import cl.ucn.modelo.Usuario;

public abstract class FindStrategy {
    abstract Usuario find(Buscar buscar);
}
