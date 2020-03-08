package com.bank.transactions.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DCApplication {
    @Id
    private  int appId;
    private  int custId;
   private  int accId;
    private  String appDate;
    private  String appStatus;
    private String createdDate;
    private  String status;
}
