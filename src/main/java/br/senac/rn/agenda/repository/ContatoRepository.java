package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContatoRepository  extends JpaRepository<Contato, Long> {

}
