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
    UsuarioServiceImpl usuarioService;
    @Inject
    UsuarioDao usuarioDao;
    @Inject
    UsuarioMapper usuarioMapper;
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA CREAR USUARIO----------------------------------------
    @Override
    public List<UsuarioTypeResponse> crearUsuario(UsuarioTypeInput usuarioTypeInput) {
        try {
            LOG.info("Termina Crear Usraio");
            return usuarioService.crearUsuario(usuarioTypeInput);
        }catch (ApplicationException e){
            LOG.error("Se identifico error en el servicio ");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA EDITAR USUARIO---------------------------------------
    @Override
    public List<UsuarioTypeResponse> editarUsuario(Integer idtblUser, UsuarioTypeInput usuarioTypeInput) {
        return usuarioService.editarUsuario(idtblUser, usuarioTypeInput);
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA OBTENER USUARIO----------------------------------
    @Override
    public List<UsuarioTypeResponse> listarUsuario(Integer idtblUser){
        LOG.info("Inicia listarUsuarioImpl");
        try {
            Usuario user = usuarioDao.findById(idtblUser.longValue());
            UsuarioTypeResponse response = usuarioMapper.usuarioEntityToType(user);
            LOG.info("Finaliza listar usuario por id");
            return  Collections.singletonList(response);
        }catch (ApplicationException e){
            LOG.error("Se presento un error al listar usuario por id"+ e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }
//------------------------------------------------------------------------------------------------
//-------------------------------METODO PARA ELIMINAR USUARIO-------------------------------------
    @Override
    public void eliminarUsuario(Integer idtblUser) {
        try {
            usuarioService.eliminarUsuario(idtblUser);
        }catch(ApplicationException e){
            LOG.error("Se presento un error al listar usuario por id"+ e.getMessage());
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }
//------------------------------------------------------------------------------------------------
//-------------------------------ETODO PARA LISTAR TODOS USUARIO----------------------------------
    @Override
    public List<UsuarioTypeResponse> listarTodosLosUsuario() {
        return usuarioService.listarTodosLosUsuario();
    }
}
