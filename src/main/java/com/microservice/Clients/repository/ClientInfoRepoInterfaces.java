package com.microservice.Clients.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.Clients.model.Client;

@Repository
public interface ClientInfoRepoInterfaces extends ReactiveMongoRepository<Client, String> {

}
