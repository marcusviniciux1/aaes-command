package org.example;

public class ComprarFI implements Pedido {

    private FI fundoImobiliario;

    public ComprarFI(FI fundoImobiliario) {
        this.fundoImobiliario = fundoImobiliario;
    }

    public void executar() {
        this.fundoImobiliario.comprar();
    }

    public void cancelar() {
        this.fundoImobiliario.vender();
    }
}