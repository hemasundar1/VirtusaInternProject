package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Customer;
import com.example.demo.model.LoanApplicantModel;
@Repository
public interface Customer_repository extends JpaRepository<Customer,Integer>  {
	//public Customer findById(int id);
}