package br.com.claytonbentes.gestao_vagas.models.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.claytonbentes.gestao_vagas.models.company.entities.JobEntity;
import br.com.claytonbentes.gestao_vagas.models.company.useCases.CreateJobUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {
    
    @Autowired
    private CreateJobUseCase createJobUseCase;

    @RequestMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity){
        return this.createJobUseCase.execute(jobEntity);
    }
}
