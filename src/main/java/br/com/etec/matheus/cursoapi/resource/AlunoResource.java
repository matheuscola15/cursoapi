package br.com.etec.matheus.cursoapi.resource;

import br.com.etec.matheus.cursoapi.model.Aluno;
import br.com.etec.matheus.cursoapi.model.Cidade;
import br.com.etec.matheus.cursoapi.repository.AlunoRepository;
import br.com.etec.matheus.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.matheus.cursoapi.repository.filter.CidadeFilter;
import br.com.etec.matheus.cursoapi.repository.projections.AlunoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/alunos")
@RestController

public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public Page<AlunoDto> pesquisar(AlunoFilter alunoFilter, Pageable pageable){
        return alunoRepository.Filtrar(alunoFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Aluno> listarTodosAlunos (){
        return alunoRepository.findAll();
    }



}
