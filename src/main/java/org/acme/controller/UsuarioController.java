package org.acme.controller;

import jakarta.inject.Inject;
import org.acme.dao.UsuarioDao;
import org.acme.entity.Usuario;
import org.acme.gen.contract.V1UsuarioApi;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.acme.service.implemt.UsuarioServiceImpl;
import org.acme.utils.ApplicationException;
import org.acme.utils.UsuarioMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collections;
import java.util.List;
import static org.acme.constant.Constant.ERROR_SERVICIO;

public class UsuarioController implements V1UsuarioApi {
    private  static  final Logger LOG = LoggerFactory.getLogger(UsuarioController.class);
    @Inject
    UsuarioServiceImpl usuarioServiceImpl;
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA CREAR USUARIO----------------------------------------
    @Override
    public List<UsuarioTypeResponse> crearUsuario(UsuarioTypeInput usuarioTypeInput) {
        LOG.info("Termino el proceso Crear ususario");
        return usuarioServiceImpl.crearUsuario(usuarioTypeInput);
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA EDITAR USUARIO---------------------------------------
    @Override
    public List<UsuarioTypeResponse> editarUsuario(Integer idtblUser, UsuarioTypeInput usuarioTypeInput) {
        LOG.info("Termino el proceso Editar usuario");
        return usuarioServiceImpl.editarUsuario(idtblUser, usuarioTypeInput);
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA OBTENER USUARIO----------------------------------
    @Override
    public List<UsuarioTypeResponse> listarUsuario(Integer idtblUser){
        LOG.info("Inicia listarUsuarioImpl");
        return usuarioServiceImpl.listarUsuario(idtblUser);
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA ELIMINAR USUARIO-------------------------------------
    @Override
    public void eliminarUsuario(Integer idtblUser) {
        usuarioServiceImpl.eliminarUsuario(idtblUser);
    }
//------------------------------------------------------------------------------------------------
//-------------------------------ETODO PARA LISTAR TODOS USUARIO----------------------------------
    @Override
    public List<UsuarioTypeResponse> listarTodosLosUsuario() {
        return usuarioServiceImpl.listarTodosLosUsuario();
    }
}
