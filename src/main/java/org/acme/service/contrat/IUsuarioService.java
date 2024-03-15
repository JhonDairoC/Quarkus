package org.acme.service.contrat;

import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;

import java.util.List;

public interface IUsuarioService {
    List<UsuarioTypeResponse> crearUsuario(UsuarioTypeInput usuarioTypeInput);
}
