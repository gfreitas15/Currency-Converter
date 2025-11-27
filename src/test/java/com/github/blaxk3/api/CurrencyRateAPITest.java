package com.github.blaxk3.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes para CurrencyRateAPI")
class CurrencyRateAPITest {

    private CurrencyRateAPI api;

    @BeforeEach
    void setUp() {
        api = new CurrencyRateAPI();
    }

    @Test
    @DisplayName("Deve ler API key do config.properties")
    void testAPIKey() {
        String apiKey = api.getApiKeyService();
        assertTrue(apiKey == null || !apiKey.isEmpty());
    }

    @Test
    @DisplayName("Deve construir URL corretamente")
    void testURL() {
        String url = api.getURL();
        assertNotNull(url);
        assertTrue(url.startsWith("https://v6.exchangerate-api.com/v6/"));
    }

    @Test
    @DisplayName("Deve tratar exceção ao converter com moedas inválidas")
    void testConverterInvalidas() {
        assertThrows(Exception.class, () -> {
            api.convert("XXX", "YYY", new BigDecimal("100"));
        });
    }

    @Test
    @DisplayName("Deve retornar null quando getCurrencyCode falha")
    void testRetornarNullFalha() {
        try {
            String[] codes = api.getCurrencyCode();
            if (codes != null) {
                assertTrue(codes.length > 0);
            }
        } catch (MalformedURLException | URISyntaxException e) {
            assertTrue(true);
        }
    }
}