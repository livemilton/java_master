package com.example.demo.ProgramacionManejoExcepcionesDatos2;

import com.example.demo.PorgramacionManejoExcepciones2.AccesoDatosEx;
import com.example.demo.PorgramacionManejoExcepciones2.EscrituraDatosEx;

public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {

        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de Datos");
        } else {
            System.out.println("Insertar desde Oracle");

        }

    }

    @Override
    public void listar() throws AccesoDatosEx {

        if (simularError) {
            throw new EscrituraDatosEx("Error de lectura de Datos");
        } else {

            System.out.println("Listar desde Oracle");
        }

    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;

    }

    // metodo getter y setter

    public boolean isSimularError() {
        return simularError;
    }

    public void setSimularError(boolean simularError) {
        this.simularError = simularError;
    }

}
