package org.acme.service.contrat;

import org.acme.gen.type.UsuarioTypeInput;

public interface IUsuarioService {
    UsuarioTypeInput crearUsuario(UsuarioTypeInput usuarioTypeInput);
}
