package org.acme.dao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entity.Usuario;

@ApplicationScoped
public class UsuarioDao implements PanacheRepository<Usuario>{
}
