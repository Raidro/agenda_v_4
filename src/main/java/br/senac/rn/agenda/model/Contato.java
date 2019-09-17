package br.senac.rn.agenda.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "tb_contatos")
public class Contato {

    @Id

    private Long id;
    private String nome;
    private String fone;




}
