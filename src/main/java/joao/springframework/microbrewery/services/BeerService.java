package joao.springframework.microbrewery.services;

import joao.springframework.microbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
