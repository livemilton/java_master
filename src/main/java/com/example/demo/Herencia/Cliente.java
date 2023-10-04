package com.example.demo.Herencia;

import java.util.Date;

public class Cliente extends Persona {

    private int idClient;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date fechaRegistro, boolean vip) {

        this.idClient = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    // no se va a utilizar unicamente en el constructor
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    // no se va a utilizar unicamente en el constructor para aumentar el contador
    public static void setContadorClientes(int contadorClientes) {
        Cliente.contadorClientes = contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente [idClient=" + idClient + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip
                + "]";
    }

}
