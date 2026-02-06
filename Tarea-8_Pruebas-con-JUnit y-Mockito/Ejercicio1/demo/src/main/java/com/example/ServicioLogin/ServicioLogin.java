package com.example.ServicioLogin;

import com.example.Repositorio.RepositorioUsuarios;

public class ServicioLogin {
    private RepositorioUsuarios repositorioUsuarios;

    public ServicioLogin(RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    public boolean login(String username) {
        return repositorioUsuarios.existeUsuario(username);
    }
}
