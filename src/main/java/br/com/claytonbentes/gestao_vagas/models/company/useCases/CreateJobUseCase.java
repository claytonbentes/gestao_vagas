package br.com.claytonbentes.gestao_vagas.models.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.claytonbentes.gestao_vagas.models.company.entities.JobEntity;
import br.com.claytonbentes.gestao_vagas.models.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }
}
