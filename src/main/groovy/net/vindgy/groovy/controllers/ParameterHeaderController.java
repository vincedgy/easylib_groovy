package net.vindgy.groovy.controllers;


import net.vindgy.groovy.model.ParameterHeader;
import net.vindgy.groovy.model.ParameterHeaderPK;
import net.vindgy.groovy.model.ParameterHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vincent on 21/03/2016.
 */


@Controller

public class ParameterHeaderController {

    @Autowired
    ParameterHeaderRepository parameterHeaderRepository;

    @RequestMapping(value="/paramHeaders", method= RequestMethod.GET)
    public @ResponseBody List<ParameterHeader> getAllParameterHeaders() {
        return parameterHeaderRepository.findAll();
    }

    @RequestMapping(value="/paramHeaders/{id}", method= RequestMethod.GET)
    public @ResponseBody ParameterHeader getParameterHeaderById(@PathVariable Integer id) {
        return parameterHeaderRepository.findOne(new ParameterHeaderPK(id));
    }
}
