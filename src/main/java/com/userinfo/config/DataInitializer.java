package com.userinfo.config;

import com.userinfo.model.User;
import com.userinfo.service.DataInitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class DataInitializer implements InitializingBean {

    @Autowired
    private DataInitializationService dataInitializationService;

    @Override
    public void afterPropertiesSet() throws Exception {
        dataInitializationService.initializeData();
    }
}
