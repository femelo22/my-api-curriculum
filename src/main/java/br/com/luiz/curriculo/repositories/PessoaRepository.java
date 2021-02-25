package br.com.luiz.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiz.curriculo.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
}
