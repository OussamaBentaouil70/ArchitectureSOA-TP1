package com.gestion.service.api.logic.impl;

import com.gestion.service.api.dataaccess.dao.AdhrentDao;
import com.gestion.service.api.dataaccess.entities.Adherent;
import com.gestion.service.api.logic.api.GestionService;
import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class GestionServiceImpl implements GestionService {

    private static final Logger logger = LoggerFactory.getLogger(GestionServiceImpl.class);

    @Inject
    DozerBeanMapper dozer;

    @Inject
    AdhrentDao adhrentDao;



    @Override
    public MessageTo getMessage() {
        MessageTo message = new MessageTo();
        message.setMessage("Test KO");
        message.setCode(400);
        return message;
    }

    @Override
    public MessageTo getMessageByCode(Integer code) {
        MessageTo message = new MessageTo();
        if(message.getCode().equals(code)){
            return message;
        } else {
            return null;
        }
    }

    @Override
    public AdherentTo getAdherentById(Long id) {
        AdherentTo adherentTo = new AdherentTo();
        Adherent adherent = null;
        adherent =  adhrentDao.getAdherentById(id);
        dozer.map(adherent, adherentTo);
        return  adherentTo;
    }
}
