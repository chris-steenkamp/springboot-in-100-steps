package com.carniware.learning.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carniware.learning.enterprise.business.BusinessService;

@Component
public class MyWebController {
    @Autowired
    private BusinessService service;

    public long returnValueFromService() {
        return service.calculateSum();
    }
}