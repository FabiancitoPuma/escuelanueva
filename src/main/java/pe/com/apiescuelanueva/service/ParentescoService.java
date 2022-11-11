package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;

public interface ParentescoService {
    List<ParentescoEntity> findAll();
    List<ParentescoEntity> findAllCustom();
    Optional<ParentescoEntity> findById(Long id);
    ParentescoEntity add(ParentescoEntity p);
    ParentescoEntity update(ParentescoEntity p);
    ParentescoEntity delete(ParentescoEntity p);
}
