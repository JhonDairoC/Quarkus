package org.acme.utils;

import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.modelmapper.ModelMapper;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuarioMapper {
//---------------------Mapeo para pasar un usuarioTypeInput a la entidad Usuario---------------------
    public Usuario usuarioTypeToEntity(UsuarioTypeInput usuarioTypeInput) {
        return new ModelMapper().map(usuarioTypeInput, Usuario.class);
    }
//---------------------Mapeo para pasar una entidad Usuario a UsuarioTypeResponse---------------------
    public UsuarioTypeResponse usuarioEntityToType(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioTypeResponse.class);
    }
//---------------------Mapeo para listar todos los usuarios-------------------------------------
    public List<UsuarioTypeResponse> usuariosTypeListEntityToTypeResponse(List<Usuario> usuarios){
        List<UsuarioTypeResponse> responses = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            UsuarioTypeResponse response = new ModelMapper().map(usuario, UsuarioTypeResponse.class);
            responses.add(response);
        }

        return responses;
    }
}
