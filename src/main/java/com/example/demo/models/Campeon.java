package com.example.demo.models;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class Campeon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_campeon;
    private String tipo_ataque;
    private String vida_base;
    private Boolean mana_bool;
    private Boolean energia_bool;
    private float velocidad_ataque_base;
    private Long velocidad_movimiento_base;
    private String nombre;

    @OneToOne
    Set<Nacionalidad> id_nacionalidad;

    @OneToOne
    Set<Especie> id_especie;

    @ManyToOne
    Set<Counter> id_counter;

    @ManyToOne
    Set<Rival> id_rival;
    
}
