package com.gestion.service.api.logic.api;

import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;

public interface GestionService {

    MessageTo getMessage();
    MessageTo getMessageByCode(Integer code);

    AdherentTo getAdherentById(Long id);
}
