package com.example.demo.ProgramacionEjemploClasesAbstractas;

public abstract class FiguraGeometrica {

    // Modificador de acceso abstract que significa que no se pueden crear
    // instancias de esta clase de FIgura geometrica

    // Atributo de la clase
    protected String tipoFigura;

    // Constructor de la clase abstracta
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // metodo abstracto
    // NO incluyen ningun codigo
    // La clase padre no defino el comportamiento
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
    }

}
