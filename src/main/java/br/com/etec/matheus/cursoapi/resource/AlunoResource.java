package br.com.etec.matheus.cursoapi.resource;

import br.com.etec.matheus.cursoapi.model.Aluno;
import br.com.etec.matheus.cursoapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/alunos")
@RestController

public class AlunoResource {

    @Autowired
    private AlunoRepository alunoRepository;
    @GetMapping("/todos")
    public List<Aluno> listarTodosAlunos (){
        return alunoRepository.findAll();

    }
}
