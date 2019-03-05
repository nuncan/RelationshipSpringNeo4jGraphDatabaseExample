package me.nuncan.hiringmodel.datasources.MongoDB.implementation;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import me.nuncan.hiringmodel.datasources.MongoDB.CustomerService;
import me.nuncan.hiringmodel.datasources.MongoDB.repository.CustomerRepository;
import me.nuncan.hiringmodel.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Slf4j
@Service
@Generated
public class CustomerRepositoryImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Flux<Customer> findAllByName(String name) throws RuntimeException {
        return customerRepository.findAllByName(name);
    }
}
