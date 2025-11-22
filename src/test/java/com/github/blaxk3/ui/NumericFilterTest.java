package com.github.blaxk3.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class NumericFilterTest {
    private UI.NumericFilter filter;
    private Method isValidMethod;

    @BeforeEach
    void setUp() throws Exception {
        filter = new UI.NumericFilter();
        isValidMethod = UI.NumericFilter.class
            .getDeclaredMethod("isValid", String.class);
        isValidMethod.setAccessible(true);
    }

    @Test
    @DisplayName("Aceitar numeros inteiros validos")
    void testeEntradaNumerosInteirosValidos() throws Exception {
        assertTrue((Boolean) isValidMethod.invoke(filter, "123"));
        assertTrue((Boolean) isValidMethod.invoke(filter, "0"));
        assertTrue((Boolean) isValidMethod.invoke(filter, "99999"));
    }

    @Test
    @DisplayName("Rejeitar numeros negativos")
    void testeEntradaNumerosNegativos() throws Exception {
        assertFalse((Boolean) isValidMethod.invoke(filter, "-123"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "-0"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "-99999"));
    }

    @Test
    @DisplayName("Aceitar numeros decimais validos")
    void testeEntradaNumerosDecimaisValidos() throws Exception {
        assertTrue((Boolean) isValidMethod.invoke(filter, "123.456"));
        assertTrue((Boolean) isValidMethod.invoke(filter, "0.000001"));
        assertTrue((Boolean) isValidMethod.invoke(filter, ".5"));
        assertTrue((Boolean) isValidMethod.invoke(filter, "0.9"));
    }

    @Test
    @DisplayName("Rejeitar numeros decimais com mais de um ponto decimal")
    void testeEntradaNumerosDecimaisMaisDeUmPonto() throws Exception {
        assertFalse((Boolean) isValidMethod.invoke(filter, "123.456.789"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "1.2.3"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "0.0.5.0"));
    }

    @Test
    @DisplayName("Rejeitar letras")
    void testeEntradaLetras() throws Exception {
        assertFalse((Boolean) isValidMethod.invoke(filter, "abc"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "123abc"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "abc123"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "abc123abc"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "123abc123"));
        assertFalse((Boolean) isValidMethod.invoke(filter, "a1b2c3"));
    }

    @Test
    @DisplayName("Aceitar string vazia")
    void testeEntradaStringVazia() throws Exception {
        assertTrue((Boolean) isValidMethod.invoke(filter, ""));
    }
}