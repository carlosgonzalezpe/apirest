package com.example.apirest.Modelos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("aticulos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModeloAticulo {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double vunitario;
    private List<Object>tallas;


   


}
