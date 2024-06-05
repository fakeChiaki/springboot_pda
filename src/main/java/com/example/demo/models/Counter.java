package com.example.demo.models;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Counter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_counter;
    private String nombre;
    private float porcentaje_victoria;
    private float porcentaje_derrota;
    Set<Nacionalidad> nacionalidad;
    Set<Especie> id_especie;
    
    
}
