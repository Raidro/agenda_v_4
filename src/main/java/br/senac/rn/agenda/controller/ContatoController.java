package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ContatoController {


    @Autowired
    private ContatoService service;

    @GetMapping("/ ")
    public String helloWorld(){
        return "index";
    }

    @GetMapping("/contatos")
    public String listaTodos(Model model){
        List<Contato>contatos = service.listaTodos();
        model.addAttribute("contatos",contatos);
        return "contatos";
    }


}
