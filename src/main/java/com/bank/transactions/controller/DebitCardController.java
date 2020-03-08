package com.bank.transactions.controller;

import com.bank.transactions.entity.DCApplication;
import com.bank.transactions.service.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebitCardController {

     @Autowired
     private DebitCardService debitCardService;
    @PostMapping("/postCustomer")
    public  void addCustomer(@RequestBody DCApplication dcApplication)
    {

        debitCardService.addCustomer(dcApplication);
    }
}
