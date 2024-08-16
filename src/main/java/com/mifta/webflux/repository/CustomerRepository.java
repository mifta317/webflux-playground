package com.mifta.webflux.repository;

import com.mifta.webflux.entity.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {


    Flux<Customer> findByEmailOrName(String email, String name);
}
