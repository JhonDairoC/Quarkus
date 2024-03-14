package org.acme.utils;

import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.modelmapper.ModelMapper;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioMapper {
    public Usuario usuarioTypeToEntity(UsuarioTypeInput usuarioTypeInput) {
        return new ModelMapper().map(usuarioTypeInput, Usuario.class);
    }
}