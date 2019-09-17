package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(AgendaApplication.class, args);

	}

	@Autowired
	ContatoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Contato mateus = new Contato();

		mateus.setNome("Mateus Sátiro");
		mateus.setFone("19192-2323");

		Contato felipe = new Contato();

		felipe.setFone("Felipe Vasco");
		felipe.setFone("15158-9595");

		repository.save(mateus);
		repository.save(felipe);


	}
}
