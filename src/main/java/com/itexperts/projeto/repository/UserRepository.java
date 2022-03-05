package com.itexperts.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itexperts.projeto.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
