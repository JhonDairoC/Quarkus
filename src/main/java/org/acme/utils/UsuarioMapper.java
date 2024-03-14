package org.acme.utils;

import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.modelmapper.ModelMapper;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UsuarioMapper {
    public Usuario usuarioTypeToEntity(UsuarioTypeInput usuarioTypeInput) {
        return new ModelMapper().map(usuarioTypeInput, Usuario.class);
    }

    public UsuarioTypeResponse usuarioEntityToTypeResponse(UsuarioTypeInput usuarioTypeInput) {
        return new ModelMapper().map(usuarioTypeInput, UsuarioTypeResponse.class);
    }

    public UsuarioTypeInput clienteEntityToType(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioTypeInput.class);
    }

    public UsuarioTypeResponse usuarioTypeListToEntity(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioTypeResponse.class);
    }
}
