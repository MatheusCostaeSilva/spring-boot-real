package com.cst.school.services;

import com.cst.school.models.AlunoModel;
import com.cst.school.repositories.AlunoRepositore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private static final Logger log = LoggerFactory.getLogger(AlunoService.class);
    @Autowired
    private AlunoRepositore alunoRepositore;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepositore.save(alunoModel);
    }

    public List<AlunoModel> buscarTodosAlunos(){
        return alunoRepositore.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepositore.deleteById(id);

    }

    public Optional< AlunoModel> buscarId(Long id){
        return alunoRepositore.findById(id);
    }

    public AlunoModel atualizarAluno(Long id, AlunoModel alunoModel){
        AlunoModel newAluno = alunoRepositore.findById(id).get();
        newAluno.setNome(alunoModel.getNome());
        return alunoRepositore.save(newAluno);
    }


}
