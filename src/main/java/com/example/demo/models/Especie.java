package com.example.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


enum nombre {
    Bicho,
    Planta,
    Fuego,
    Agua,
    Electrico,
    Hielo,
    Lucha,
    Veneno,
    Tierra,
    Volador,
    Psiquico,
    Roca,
    Fantasma,
    Dragon,
    Siniestro,
    Acero,
    Hada
}

@Entity
@Data

public class Especie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_especie;

}
