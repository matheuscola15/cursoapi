package br.com.etec.matheus.cursoapi.repository;

import br.com.etec.matheus.cursoapi.model.Aluno;
import br.com.etec.matheus.cursoapi.repository.aluno.AlunoRepositoryQuery;
import br.com.etec.matheus.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.matheus.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>, AlunoRepositoryQuery {
}
