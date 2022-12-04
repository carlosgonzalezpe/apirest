package com.example.apirest.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.Modelos.ModeloAticulo;
import com.example.apirest.Repositorios.RepositorioArticulo;

@RestController
@RequestMapping("/articulos")
public class ControladorArticulo {
    @Autowired
    RepositorioArticulo repositorioArticulo;

    @GetMapping()
    public List<ModeloAticulo> getAllArticulos(){
        return repositorioArticulo.findAll();
    }

    @PostMapping()
    public ModeloAticulo savModeloAticulo(@RequestBody ModeloAticulo arAticulo){
        return repositorioArticulo.save(arAticulo); //metodo seva de mongo inserta(crea) o actualiza un registro existenxia o envio de un id
    }

    @DeleteMapping("/{id}")
    public void deletepacienteByid(@PathVariable("id") String id){
        repositorioArticulo.deleteById(id);
    }
    
    

}
