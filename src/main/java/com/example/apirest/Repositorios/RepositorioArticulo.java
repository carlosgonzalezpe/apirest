package com.example.apirest.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest.Modelos.ModeloAticulo;

@Repository
public interface RepositorioArticulo extends MongoRepository <ModeloAticulo,String> {
    


    
}
