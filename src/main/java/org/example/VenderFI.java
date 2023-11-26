package org.example;

public class VenderFI implements Pedido {

    private FI fundoImobiliario;

    public VenderFI(FI fundoImobiliario) {
        this.fundoImobiliario = fundoImobiliario;
    }

    public void executar() {
        this.fundoImobiliario.vender();
    }

    public void cancelar() {
        this.fundoImobiliario.comprar();
    }
}