package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Adherent;
import com.gestion.service.api.to.AdherentTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdhrentDao extends JpaRepository<Adherent, Long> {
    @Query(value = "select a from Adherent a where a.id=:id"  )
    Adherent getAdherentById(Long id);


}
