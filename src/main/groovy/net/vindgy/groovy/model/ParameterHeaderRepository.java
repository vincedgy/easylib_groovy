package net.vindgy.groovy.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Vincent on 21/03/2016.
 */

@RepositoryRestResource(path = "paramHeaders")
public interface ParameterHeaderRepository
        extends JpaRepository<ParameterHeader, ParameterHeaderPK> {
}

