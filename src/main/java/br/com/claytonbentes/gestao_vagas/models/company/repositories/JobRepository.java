package br.com.claytonbentes.gestao_vagas.models.company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.claytonbentes.gestao_vagas.models.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID>{
    
}
