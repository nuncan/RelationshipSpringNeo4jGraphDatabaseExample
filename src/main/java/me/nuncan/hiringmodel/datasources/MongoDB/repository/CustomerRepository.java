package me.nuncan.hiringmodel.datasources.MongoDB.repository;

import me.nuncan.hiringmodel.entity.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {

    Flux<Customer> findAllByName(String name);
}
