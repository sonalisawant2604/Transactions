package com.bank.transactions.dao;

import com.bank.transactions.entity.DCApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DCApplicationRepository extends JpaRepository<DCApplication,Integer> {
}
