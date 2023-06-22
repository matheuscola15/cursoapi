package br.com.etec.matheus.cursoapi.repository.aluno;

import br.com.etec.matheus.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.matheus.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AlunoRepositoryQuery {

    public Page<AlunoDto> Filtrar(AlunoFilter alunoFilter, Pageable pageable);

}
