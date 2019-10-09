package br.senac.rn.agenda.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "tb_contatos")
@Data
public class Contato {

    @Id
    @Column(name = "con_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "con_nome", nullable = false)
    private String nome;

    @Column(name = "con_fone", nullable = false)
    private String fone;

}
