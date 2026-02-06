package testmockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.Repositorio.RepositorioUsuarios;
import com.example.ServicioLogin.ServicioLogin;

public class ServicioLoginTest {
    @Test
    public void comprobarSiElUsuarioExiste(){
        RepositorioUsuarios repositorioMockito = Mockito.mock(RepositorioUsuarios.class);

        when(repositorioMockito.existeUsuario("nigga")).thenReturn(true);

        ServicioLogin servicio = new ServicioLogin(repositorioMockito);

        boolean resultado = servicio.login("nigga");

        verify(repositorioMockito).existeUsuario("nigga");

    }
}
