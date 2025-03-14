package com.programming.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.adminservice.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	    Admin findByUsernameAndPassword(String username, String password);
}
