package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoService {
    //funcion que te permita mostrar todos los datos
    List<DistritoEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<DistritoEntity> findAllCustom();
    //funcion para poder buscar por codigo
    Optional<DistritoEntity> findById(Long id);
    //funcion para registrar datos
    DistritoEntity add(DistritoEntity d);
    //funcion para actualizar datos
    DistritoEntity update(DistritoEntity d);
    //funcion para eliminar datos
    DistritoEntity delete(DistritoEntity d);
    
}
