package br.com.etec.matheus.cursoapi.repository;

import br.com.etec.matheus.cursoapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
