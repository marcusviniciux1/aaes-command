package org.example;

import java.util.ArrayList;
import java.util.List;

public class Corretora {

    private List<Pedido> pedidos = new ArrayList<Pedido>();

    public void processarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.executar();
    }

    public void cancelarUltimoPedido() {
        if (pedidos.size() != 0) {
            Pedido pedido = this.pedidos.get(this.pedidos.size() - 1);
            pedido.cancelar();
            this.pedidos.remove(this.pedidos.size() - 1);
        }
    }
}