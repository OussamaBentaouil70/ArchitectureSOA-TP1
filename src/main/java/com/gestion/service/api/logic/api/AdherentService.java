package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;

import java.util.List;

public interface AdherentService {



    AdherentTo getAdherentById(int id);
    List<AdherentTo> getAll();





}
