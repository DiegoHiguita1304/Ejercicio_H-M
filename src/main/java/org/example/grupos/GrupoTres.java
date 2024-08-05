package org.example.grupos;

import org.example.clientes.Cliente;

public class GrupoTres extends Cliente {

    public GrupoTres() {
    }
    @Override
    public void descontar() {
        if (getValorCompra() < 200000) {
            System.out.println("----------------------------------------");
            System.out.println("Cliente: " + getNombre() + "\n" + "Grupo: " + getGrupo());
            System.out.println("El monto es menor al valor establecido, no aplica ningún descuento. El monto mínimo es de 200000 para poder aplicar el descuento del 2.5%.");
            System.out.println("Valor de compra: " + getValorCompra());
            System.out.println("\n");
        } else {
            double descuento = getValorCompra() * 0.025;
            setValorDescuento(descuento);
            double valorConDescuento = getValorCompra() - descuento;
            setValorCompraConDescuento(valorConDescuento);
            System.out.println("----------------------------------------");
            System.out.println("Cliente: " + getNombre() + "\n"  +"Grupo: " + getGrupo());
            System.out.println("Valor de compra original: " + getValorCompra());
            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Valor final después del descuento: " + valorConDescuento);
            System.out.println("\n");
        }
    }


    public GrupoTres(String nombre, String identificacion, String edad, String ciudad, String grupo, Double valorCompra, Double valorDescuento, Double valorCompraConDescuento) {
        super(nombre, identificacion, edad, ciudad, grupo, valorCompra, valorDescuento, valorCompraConDescuento);
    }
}




