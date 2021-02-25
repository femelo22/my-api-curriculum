package br.com.luiz.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.curriculo.domain.ExperienciaProfissional;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaProfissional, Integer>{

}
