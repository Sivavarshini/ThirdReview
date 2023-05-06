package com.Athletics.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Athletics.demo.model.loginModel;
@Repository
public interface loginRepository extends JpaRepository<loginModel, Integer> {
	loginModel findByUsername(String username);

}
