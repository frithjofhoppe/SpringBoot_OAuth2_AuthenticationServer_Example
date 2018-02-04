package com.authenticationserver.authenticationserver.repository;

import com.authenticationserver.authenticationserver.model.Role;
import com.authenticationserver.authenticationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}
