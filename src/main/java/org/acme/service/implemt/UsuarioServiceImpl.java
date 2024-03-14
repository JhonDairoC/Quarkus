package org.acme.service.implemt;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.controller.UsuarioController;
import org.acme.dao.UsuarioDao;
import org.acme.entity.Usuario;
import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;
import org.acme.service.contrat.IUsuarioService;
import org.acme.utils.ApplicationException;
import org.acme.utils.UsuarioMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


import static org.acme.constant.Constant.ERROR_SERVICIO;

@ApplicationScoped //Comvierte la clase en BIN
public class UsuarioServiceImpl implements IUsuarioService {
    private static final Logger LOG = LoggerFactory.getLogger(UsuarioController.class);
    @Inject
    UsuarioMapper usuarioMapper;
    @Inject
    UsuarioDao usuarioDao;

    @Transactional
    public UsuarioTypeInput crearUsuario(UsuarioTypeInput usuarioTypeInput) {
        LOG.info("Inicia crearUsuarioImpl");
        UsuarioTypeInput usuarioTypeResponses;
        try {
            Usuario usuario = usuarioMapper.usuarioTypeToEntity(usuarioTypeInput);
            usuarioDao.persist(usuario);
            usuarioTypeResponses = usuarioMapper.clienteEntityToType(usuario);
            LOG.info("Persis usuario");
            return usuarioTypeResponses;
        }catch (ApplicationException e){
            LOG.error("Error al crear usuario");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
        }
    }

   @Transactional
    public void eliminarUsuario(Integer idtblUser){
       LOG.info("Inicia eliminacion de usuario");
       try {
           Long id = Long.valueOf(idtblUser);
           usuarioDao.deleteById(id);
           LOG.info("Termina eliminar usuario");
       }catch(ApplicationException e){
           LOG.error("Se presento un error al listar usuario por id"+ e.getMessage());
           throw new ApplicationException(ERROR_SERVICIO + e.getMessage());
       }
   }
}
