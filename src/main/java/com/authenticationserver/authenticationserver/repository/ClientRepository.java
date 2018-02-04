package com.authenticationserver.authenticationserver.repository;

import com.authenticationserver.authenticationserver.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client getClientByClientIdName(String id);
}
