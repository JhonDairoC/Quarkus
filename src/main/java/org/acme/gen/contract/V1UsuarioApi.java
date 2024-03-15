package org.acme.gen.contract;

import org.acme.gen.type.UsuarioTypeInput;
import org.acme.gen.type.UsuarioTypeResponse;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;




import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


@Path("/v1/es")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-15T16:06:06.917260200-05:00[America/Bogota]")
public interface V1UsuarioApi {

    @POST
    @Path("/crearUsuario")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<UsuarioTypeResponse> crearUsuario(@Valid UsuarioTypeInput usuarioTypeInput);

    @PUT
    @Path("/editarUsuario/{idtbl_user}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<UsuarioTypeResponse> editarUsuario(@PathParam("idtbl_user") @Min(1) Integer idtblUser,@Valid UsuarioTypeInput usuarioTypeInput);

    @DELETE
    @Path("/eliminarUsuario/{idtbl_user}")
    void eliminarUsuario(@PathParam("idtbl_user") @Min(1) Integer idtblUser);

    @GET
    @Path("/listadoUsuarios")
    @Produces({ "application/json" })
    List<UsuarioTypeResponse> listarTodosLosUsuario();

    @GET
    @Path("/listUsuario/{idtbl_user}")
    @Produces({ "application/json" })
    List<UsuarioTypeResponse> listarUsuario(@PathParam("idtbl_user") @Min(1) Integer idtblUser);
}
