package br.com.claytonbentes.gestao_vagas.models.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.claytonbentes.gestao_vagas.exceptions.UserFoundException;
import br.com.claytonbentes.gestao_vagas.models.candidate.CandidateEntity;
import br.com.claytonbentes.gestao_vagas.models.candidate.CandidateRepository;

@Service
public class CreateCandidateUseCase {
  @Autowired
  private CandidateRepository candidateRepository;

  public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(),
        candidateEntity.getEmail()).ifPresent(user -> {
          throw new UserFoundException();
        });

    return this.candidateRepository.save(candidateEntity);
  }
}