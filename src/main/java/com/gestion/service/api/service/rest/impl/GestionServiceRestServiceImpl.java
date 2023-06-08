package com.gestion.service.api.service.rest.impl;

import com.gestion.service.api.api.GestionRestService;
import com.gestion.service.api.logic.api.GestionService;
import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;

import javax.inject.Inject;

public class GestionServiceRestServiceImpl implements GestionRestService {

    @Override
    public MessageTo getMessageByCode(Integer code) {
        return gestionService.getMessageByCode(code);
    }

    @Override
    public AdherentTo getAdherentById(Long id) {
        return gestionService.getAdherentById(id);
    }

    @Inject
    GestionService gestionService;

    @Override
    public MessageTo getMessage() {
        return gestionService.getMessage();
    }

}
