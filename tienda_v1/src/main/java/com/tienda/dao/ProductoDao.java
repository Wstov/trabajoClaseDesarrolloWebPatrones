
package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//Un servicio para guardar la informacion de producto
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
