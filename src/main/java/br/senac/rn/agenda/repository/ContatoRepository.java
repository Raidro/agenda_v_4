package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository  extends JpaRepository<Contato, Long> {


}
