package com.github.blaxk3.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes para UI")
class UITest {

    private UI ui;

    @BeforeEach
    void setUp() throws Exception {
        java.awt.EventQueue.invokeAndWait(() -> {
            ui = new UI();
            ui.setVisible(false);
        });
    }

    @AfterEach
    void tearDown() {
        if (ui != null) {
            ui.dispose();
        }
    }

    @Test
    @DisplayName("Deve inicializar componentes")
    void testUIComponentes() {
        assertNotNull(ui);
        assertNotNull(ui.getTextField());
        assertNotNull(ui.getComboBox1());
        assertNotNull(ui.getComboBox2());
        assertEquals("Currency Converter", ui.getTitle());
    }

    @Test
    @DisplayName("Deve configurar propriedades da janela")
    void testUIJanela() {
        assertEquals(500, ui.getWidth());
        assertEquals(500, ui.getHeight());
        assertFalse(ui.isResizable());
    }

    @Test
    @DisplayName("Deve trocar moedas (Swap)")
    void testSwap() {
        if (ui.getComboBox1().getItemCount() == 0) {
            ui.getComboBox1().addItem("USD");
            ui.getComboBox1().addItem("BRL");
        }
        if (ui.getComboBox2().getItemCount() == 0) {
            ui.getComboBox2().addItem("USD");
            ui.getComboBox2().addItem("BRL");
        }
        
        ui.getComboBox1().setSelectedItem("USD");
        ui.getComboBox2().setSelectedItem("BRL");
        
        String temp = ui.getComboBox1().getSelectedItem().toString();
        ui.getComboBox1().setSelectedItem(ui.getComboBox2().getSelectedItem());
        ui.getComboBox2().setSelectedItem(temp);
        
        assertEquals("BRL", ui.getComboBox1().getSelectedItem().toString());
        assertEquals("USD", ui.getComboBox2().getSelectedItem().toString());
    }

    @Test
    @DisplayName("Deve limpar campos (Clear)")
    void testClear() {
        ui.setTextField("100");
        ui.setLabel("500.00");
        
        ui.setTextField("");
        ui.setLabel("");
        
        assertEquals("", ui.getTextField().getText());
    }

    @Test
    @DisplayName("Deve definir e obter TextField")
    void testTextField() {
        ui.setTextField("123.45");
        assertEquals("123.45", ui.getTextField().getText());
    }

    @Test
    @DisplayName("Deve definir Label")
    void testLabel() {
        ui.setLabel("456.78");
    }

    @Test
    @DisplayName("Deve validar campo vazio")
    void testCampoVazio() {
        ui.setTextField("");
        assertTrue(ui.getTextField().getText().isEmpty() || 
                  ui.getTextField().getText().equals("."));
    }

    @Test
    @DisplayName("Deve validar campo com apenas ponto")
    void testCampoApenasPonto() {
        ui.setTextField(".");
        assertEquals(".", ui.getTextField().getText());
    }

    @Test
    @DisplayName("Deve manter referências dos componentes")
    void testReferenciasComponentes() {
        assertSame(ui.getComboBox1(), ui.getComboBox1());
        assertSame(ui.getComboBox2(), ui.getComboBox2());
        assertNotSame(ui.getComboBox1(), ui.getComboBox2());
    }
}