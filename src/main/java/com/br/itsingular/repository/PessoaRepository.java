package com.br.itsingular.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.br.itsingular.entity.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, Long> {
}
