package org.example;

import org.example.grupos.GrupoUno;
import org.example.grupos.GrupoDos;
import org.example.grupos.GrupoTres;

public class Main {
    public static void main(String[] args) {

                GrupoUno cliente1 = new GrupoUno("Diego", "123456", "30", "Medellin", "Grupo1", 1000000.0, 0.0, 0.0);
                GrupoDos cliente2 = new GrupoDos("Maria", "654321", "25", "Bogota", "Grupo2", 500000.0, 0.0, 0.0);
                GrupoTres cliente3 = new GrupoTres("Juan", "112233", "20", "Cali", "Grupo3", 200000.0, 0.0, 0.0);

                cliente1.descontar();
                cliente2.descontar();
                cliente3.descontar();

//             System.out.println(cliente1.getNombre() + " - Total a pagar con descuento: " + cliente1.getValorCompraConDescuento());
//             System.out.println(cliente2.getNombre() + " - Total a pagar con descuento: " + cliente2.getValorCompraConDescuento());
//             System.out.println(cliente3.getNombre() + " - Total a pagar con descuento: " + cliente3.getValorCompraConDescuento());
            }
}
