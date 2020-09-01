package joao.springframework.microbrewery.services;

import joao.springframework.microbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
