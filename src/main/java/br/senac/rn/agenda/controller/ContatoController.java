package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class ContatoController {


    @Autowired
    private ContatoService service;

    @GetMapping("/contato")
    public String helloWorld(){
        return "index";
    }


}
