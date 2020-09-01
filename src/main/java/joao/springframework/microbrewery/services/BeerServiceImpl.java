package joao.springframework.microbrewery.services;

import joao.springframework.microbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Tropicalia")
                .beerStyle("IPA")
                .build();
    }
}
