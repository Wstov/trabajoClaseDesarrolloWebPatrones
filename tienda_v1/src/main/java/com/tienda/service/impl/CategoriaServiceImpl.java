
package com.tienda.service.impl;

// Aca se remueven todas las que no estan activas

import com.tienda.dao.CategoriaDao;
import com.tienda.service.CategoriaService;
import com.tienda.domain.CategoriaDomain;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    // La anotacion autowired crea un unico objeto mientras se ejecuta la app
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<CategoriaDomain> getCategorias(boolean activos) {

        var lista = categoriaDao.findAll();

        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

        @Override
    @Transactional(readOnly = true)
    public CategoriaDomain getCategoria(CategoriaDomain categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(CategoriaDomain categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(CategoriaDomain categoria) {
        categoriaDao.delete(categoria);
    }
  
}
