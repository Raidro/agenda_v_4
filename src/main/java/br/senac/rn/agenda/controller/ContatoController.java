package br.senac.rn.agenda.controller;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contatos")
public class ContatoController {


    @Autowired
    private ContatoService service;


    @GetMapping
    public String listaTodos(Model model){ //lista todos
        Contato contato = new Contato();
        model.addAttribute("contato", contato);
        List<Contato>contatos = service.listaTodos();
        model.addAttribute("contatos",contatos);
        return "contatos";
    }

    @PostMapping
    public String salva(Contato contato){ //salva
        service.salva(contato);
        return "redirect:/contatos";
    }

    @GetMapping("/{id}/remove") // o @DeleteMapping é so para casa eu esteja usando uma API
    public String removerPorId(@PathVariable("id") Long id){ // deleta por id
        service.removePorId(id);
        return "redirect:/contatos";
    }

    @GetMapping("/{id}/edita")
    public String edita(@PathVariable("id") Long id, Model model){
        Contato contato = service.listaPorId(id);
        model.addAttribute("contato", contato);
        List<Contato> contatos = service.listaTodos();
        model.addAttribute("contatos", contatos);
        return "contatos";
    }


}
