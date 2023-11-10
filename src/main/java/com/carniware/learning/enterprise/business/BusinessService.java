package com.carniware.learning.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carniware.learning.enterprise.data.DataService;

@Component
public class BusinessService {
    @Autowired
    private DataService service;

    public long calculateSum() {
        List<Integer> data = service.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}