package org.acme.utils;

import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.modelmapper.ModelMapper;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioMapper {
    public Usuario usuarioTypeToEntity(UsuarioTypeInput usuarioTypeInput) {
        Usuario usuario = new Usuario();
        usuario.setTbl_name(usuarioTypeInput.getTblName());
        usuario.setTbl_lastname(usuarioTypeInput.getTblLastname());
        usuario.setTbl_createat(usuarioTypeInput.getTblCreateat());
        return usuario;
    }
}
