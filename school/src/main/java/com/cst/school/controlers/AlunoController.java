package com.cst.school.controlers;

import com.cst.school.models.AlunoModel;
import com.cst.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }
    @GetMapping
    public List<AlunoModel> buscarTodosAlunos(){
        return alunoService.buscarTodosAlunos();
    }
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);

    }

    @PutMapping("/{id}")
    public AlunoModel atualizarEstudante(Long id, @RequestBody AlunoModel alunoModel){
        return alunoService.atualizarAluno(id, alunoModel);
    }
    @GetMapping("/{id}")
    public Optional<AlunoModel> buscarId(@PathVariable Long id){
        return alunoService.buscarId(id);
    }

}
