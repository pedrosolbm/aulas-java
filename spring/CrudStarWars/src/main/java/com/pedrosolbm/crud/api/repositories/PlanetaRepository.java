package com.pedrosolbm.crud.api.repositories;

// importa o mongo repository para fazer a ligação da interface com a tabela no banco
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

// importa o arquivo java para poder utilizar o mesmo
import com.pedrosolbm.crud.api.documents.Planeta;

// gera a interface que vai referenciar Planeta
public interface PlanetaRepository extends MongoRepository<Planeta, String> {

    List<Planeta> findByNome(String nome);

}
