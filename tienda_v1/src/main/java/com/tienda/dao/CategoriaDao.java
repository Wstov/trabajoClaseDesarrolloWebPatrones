
package com.tienda.dao;

import com.tienda.domain.CategoriaDomain;
import org.springframework.data.jpa.repository.JpaRepository;

//Un servicio para guardar la informacion de categoria
public interface CategoriaDao extends JpaRepository<CategoriaDomain, Long>{
    
}
