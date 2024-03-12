package org.acme.controller;

import io.quarkus.runtime.Application;
import jakarta.inject.Inject;
import org.acme.gen.contract.V1UsuarioApi;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.acme.service.implemt.UsuarioServiceImpl;
import org.acme.utils.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import static org.acme.constant.Constant.ERROR_SERVICIO;

public class UsuarioController implements V1UsuarioApi {
    private  static  final Logger LOG = LoggerFactory.getLogger(UsuarioController.class);
    @Inject
    UsuarioServiceImpl usuarioService;

    @Override
    public List<UsuarioTypeResponse> crearUsuario(UsuarioTypeInput usuarioTypeInput) {
        try {
            Object usuariolType = usuarioService.crearUsuario(usuarioTypeInput);
            LOG.info("Termina Crear Usraio");
            return (List<UsuarioTypeResponse>) usuariolType;
        }catch (ApplicationException e){
            //LOG.error("Se identifico error en el servicio ");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }

    }
    @Override
    public List<UsuarioTypeResponse> listarUsuario(Integer idtblUser) {
        return null;
    }
}
