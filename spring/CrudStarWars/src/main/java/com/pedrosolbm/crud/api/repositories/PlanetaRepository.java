package com.pedrosolbm.crud.api.repositories;

// importa o mongo repository para fazer a ligação da interface com a tabela no banco
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pedrosolbm.crud.api.models.Planeta;

import java.util.List;

// gera a interface que vai referenciar Planeta
public interface PlanetaRepository extends MongoRepository<Planeta, String> {

    List<Planeta> findByNome(String nome);

}
