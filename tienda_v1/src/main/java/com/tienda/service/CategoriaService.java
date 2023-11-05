/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.CategoriaDomain;
import java.util.List;

/**
 *
 * @author Wstov
 */
public interface CategoriaService {

    // Se declara el metodo para optener un arrylist de objetos categoria que bienen de la tabla CategoriaDomain
    public List<CategoriaDomain> getCategorias(boolean activos);

    // Metodos para el CRUD
    // Se obtiene un Categoria, a partir del id de un categoria
    public CategoriaDomain getCategoria(CategoriaDomain categoria);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(CategoriaDomain categoria);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(CategoriaDomain categoria);

}
