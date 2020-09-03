package joao.springframework.microbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import joao.springframework.microbrewery.services.BeerService;
import joao.springframework.microbrewery.web.model.BeerDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(BeerController.class)

public class BeerControllerTest {

    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    BeerDto validBeer;

    @BeforeEach
    public void setUp() {
        validBeer = BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer Test")
                .beerStyle("Style Test")
                .upc(123456789L)
                .build();
    }

    @Test
    public void getBeer() {

    }

    @Test
    void handlePost() {
    }

    @Test
    void handleUpdate() {
    }
}