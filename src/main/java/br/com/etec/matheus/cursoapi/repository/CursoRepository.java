package br.com.etec.matheus.cursoapi.repository;

import br.com.etec.matheus.cursoapi.model.Curso;
import br.com.etec.matheus.cursoapi.repository.curso.CursoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository <Curso, Integer>, CursoRepositoryQuery {
}
