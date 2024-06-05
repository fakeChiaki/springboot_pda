package com.example.demo.models;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Rival {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rival;
    private String nombre;
    Set<Nacionalidad> id_nacionalidad;
    Set<Especie> id_especie;

}
