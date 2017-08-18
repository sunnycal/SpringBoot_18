package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<User, Long>{

    Role findByRole(String role);

}


