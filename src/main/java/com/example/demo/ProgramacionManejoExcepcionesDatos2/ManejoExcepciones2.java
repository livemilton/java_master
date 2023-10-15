package com.example.demo.ProgramacionManejoExcepcionesDatos2;

import com.example.demo.PorgramacionManejoExcepciones2.AccesoDatosEx;
import com.example.demo.PorgramacionManejoExcepciones2.LecturaDatosEx;

public class ManejoExcepciones2 {
    public static void main(String[] args) {

        // Clase de prueba excepciones 2
        // Crear el objeto
        AccesoDatos datos = new ImplementacionMySql();

        // Usar el metodo del objeto simularError
        datos.simularError(true);

        // crear un metodo para modificar el comportamiento
        ejecutar(datos, "listar");

        // Simular error con implementacion oracle
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(true);
        ejecutar(datos2, "insertar");

    }

    // Metdo con las acciones y validacions

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error Lectura");
                ex.printStackTrace();
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso a datos");
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace();
            } finally {
                System.out.println("Procesar finally es opional, pero siempre se va a ejecutar");
            }

        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace();
            } finally {
                System.out.println("Procesar finally es opcional");
            }
        } else {
            System.out.println("No se proporciono ninguna accion conocida");
        }

    }
}
