package me.nuncan.hiringmodel.datasources.MongoDB;

import me.nuncan.hiringmodel.entity.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface CustomerService {

    Flux<Customer> findAllByName(String name);
}