package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorretoraTest {

    Corretora corretora;
    FI fundoImobiliario;

    @BeforeEach
    void setUp() {
        corretora = new Corretora();
        fundoImobiliario = new FI("FI A", 100.0);
    }

    @Test
    void deveComprarFundoImobiliario() {
        Pedido comprarFI = new ComprarFI(fundoImobiliario);
        corretora.processarPedido(comprarFI);

        assertEquals("Fundo Imobiliário comprado", fundoImobiliario.getSituacao());
    }

    @Test
    void deveVenderFundoImobiliario() {
        Pedido venderFI = new VenderFI(fundoImobiliario);
        corretora.processarPedido(venderFI);

        assertEquals("Fundo Imobiliário vendido", fundoImobiliario.getSituacao());
    }

    @Test
    void deveCancelarVendaFundoImobiliario() {
        Pedido comprarFI = new ComprarFI(fundoImobiliario);
        Pedido venderFI = new VenderFI(fundoImobiliario);

        corretora.processarPedido(comprarFI);
        corretora.processarPedido(venderFI);

        corretora.cancelarUltimoPedido();

        assertEquals("Fundo Imobiliário comprado", fundoImobiliario.getSituacao());
    }

}