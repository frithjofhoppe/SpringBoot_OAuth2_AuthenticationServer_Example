package com.authenticationserver.authenticationserver.service;

import com.authenticationserver.authenticationserver.model.Client;
import com.authenticationserver.authenticationserver.model.ClientDetail;
import com.authenticationserver.authenticationserver.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailService implements ClientDetailsService{
    @Autowired
    ClientRepository clientRepository;

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        Client c = clientRepository.getClientByClientIdName(s);
        if(c == null){
            throw new ClientRegistrationException("Client not foud");
        }
        return new ClientDetail(c);
    }
}
