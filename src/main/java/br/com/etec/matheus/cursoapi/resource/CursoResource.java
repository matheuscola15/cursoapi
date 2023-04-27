package br.com.etec.matheus.cursoapi.resource;

import br.com.etec.matheus.cursoapi.model.Curso;
import br.com.etec.matheus.cursoapi.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/cursos")
@RestController
public class CursoResource {
    @Autowired
    private CursoRepository cursoRepository;


    @GetMapping("/todos")
    public List<Curso> listarTodosCursos() {
        return cursoRepository.findAll();
    }

}
