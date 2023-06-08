package com.gestion.service.api.logic.impl;

import com.gestion.service.api.logic.api.AdherentService;
import com.gestion.service.api.to.AdherentTo;

import java.util.List;

public class AdhrentServiceImpl implements AdherentService {

    AdherentService adherentService;
    @Override
    public AdherentTo getAdherentById(int id) {
        return adherentService.getAdherentById(id);
    }

    @Override
    public List<AdherentTo> getAll() {
        return adherentService.getAll();
    }
}
