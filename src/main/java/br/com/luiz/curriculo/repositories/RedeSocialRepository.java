package br.com.luiz.curriculo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.curriculo.domain.RedesSociais;

@Repository
public interface RedeSocialRepository extends JpaRepository<RedesSociais, Integer>{

}
