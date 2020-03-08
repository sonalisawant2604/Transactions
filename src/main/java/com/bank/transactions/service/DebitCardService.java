package com.bank.transactions.service;

import com.bank.transactions.dao.DCApplicationRepository;
import com.bank.transactions.entity.DCApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebitCardService {

    @Autowired
    private DCApplicationRepository dcApplicationRepository;

    public void addCustomer(DCApplication dcApplication) {
        dcApplicationRepository.save(dcApplication);
    }
}
