package br.com.etec.matheus.cursoapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Cidade {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nomeCidade;
    private String uf;

    





}
