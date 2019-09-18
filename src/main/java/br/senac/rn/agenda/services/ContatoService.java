package br.senac.rn.agenda.services;


import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public List<Contato> findAll() {
        return repository.findAll();
    }

    public Contato save(Contato entity) {
        return repository.save(entity);
    }
}