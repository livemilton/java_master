package com.example.demo.ProgramacionManejoExcepcionesDatos2;

import com.example.demo.PorgramacionManejoExcepciones2.AccesoDatosEx;
import com.example.demo.PorgramacionManejoExcepciones2.EscrituraDatosEx;
import com.example.demo.PorgramacionManejoExcepciones2.LecturaDatosEx;

public class ImplementacionMySql implements AccesoDatos {

    // Atributo para simular el error con el metodo de acceso datos

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {

            System.out.println("Insertar desde MySql");
        }

    }

    @Override
    public void listar() throws AccesoDatosEx {

        if (simularError) {
            throw new LecturaDatosEx("Error de lectura de datos");
        } else {

            System.out.println("Insertar desde MySql");
        }

    }

    @Override
    public void simularError(boolean simularError) {

        this.simularError = simularError;
    }

    // metodos getter y setter
    public boolean isSimularError() {
        return simularError;
    }

    public void setSimularError(boolean simularError) {
        this.simularError = simularError;
    }

}
