package com.example.demo.ProgramacionManejoExcepcionesDatos2;

import com.example.demo.PorgramacionManejoExcepciones2.AccesoDatosEx;

public interface AccesoDatos {

    public static final int MAX_REGISTROS = 10;

    public abstract void insertar() throws AccesoDatosEx;

    public abstract void listar() throws AccesoDatosEx;

    public abstract void simularError(boolean simularError);
}
