package org.example.clientes;

import org.example.grupos.GrupoDos;
import org.example.grupos.GrupoTres;
import org.example.grupos.GrupoUno;

public abstract class Cliente {
    private String nombre;
    private String identificacion;
    private String edad;
    private String ciudad;
    private String grupo;
    private Double valorCompra;
    private Double valorDescuento;
    private Double valorCompraConDescuento;

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, String edad, String ciudad, String grupo, Double valorCompra, Double valorDescuento, Double valorCompraConDescuento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.ciudad = ciudad;
        this.grupo = grupo;
        this.valorCompra = valorCompra;
        this.valorDescuento = valorDescuento;
        this.valorCompraConDescuento = valorCompraConDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public Double getValorCompraConDescuento() {
        return valorCompraConDescuento;
    }

    public void setValorCompraConDescuento(Double valorCompraConDescuento) {
        this.valorCompraConDescuento = valorCompraConDescuento;
    }

    public abstract void descontar();
}
