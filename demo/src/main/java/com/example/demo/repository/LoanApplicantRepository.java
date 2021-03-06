package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.LoanApplicantModel;
@Repository
public interface LoanApplicantRepository extends CrudRepository<Customer, Integer> {

	LoanApplicantModel getById(int id);	

}
