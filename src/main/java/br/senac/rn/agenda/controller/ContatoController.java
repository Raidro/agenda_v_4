package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ContatoController {


    @Autowired
    private ContatoService service;

    public String helloWorld(){
        return "index";
    }


}
