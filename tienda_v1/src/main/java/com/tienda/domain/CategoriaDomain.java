/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")


public class CategoriaDomain implements Serializable {
    
    
    private static final long serialVersionUID = 1L; //Autoincremento de la primay key
    
    @Id  //Id de la tabla categoria para que el auto incremento sepa donde tiene que aumentarlo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") // tiene que ser igual al id_ de la tabla del query o la BD
    private long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public CategoriaDomain() {
    }

    public CategoriaDomain(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
}
