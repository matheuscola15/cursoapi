package br.com.etec.matheus.cursoapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Cidade")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer idCidade;
    private String nomeCidade;
    private String uf;

    @OneToMany(mappedBy = "cidade")
    private List<Aluno> alunos = new ArrayList<>();

    public Integer getIdCidade() {
        return idCidade;
    }
    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return idCidade.equals(cidade.idCidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCidade);
    }
}
