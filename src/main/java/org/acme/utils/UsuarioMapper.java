package org.acme.utils;

import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.modelmapper.ModelMapper;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class UsuarioMapper {
    public Usuario usuarioTypeToEntity(UsuarioTypeInput usuarioTypeInput) {
        return new ModelMapper().map(usuarioTypeInput, Usuario.class);
    }

    public List<UsuarioTypeResponse> usuarioEntityToTypeResponse(Usuario usuario) {
        return Collections.singletonList(new ModelMapper().map(usuario, UsuarioTypeResponse.class));
    }

    public UsuarioTypeInput usuarioEntityToType(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioTypeInput.class);
    }

    public List<UsuarioTypeResponse> usuariosTypeListEntityToTypeResponse(List<Usuario> usuarios){
        List<UsuarioTypeResponse> responses = new ArrayList<>(); // Create an empty list

        // Iterate through each Usuario in the original list
        for (Usuario usuario : usuarios) {
            UsuarioTypeResponse response = new ModelMapper().map(usuario, UsuarioTypeResponse.class);
            responses.add(response); // Add the mapped response to the new list
        }

        return responses;
    }
}
