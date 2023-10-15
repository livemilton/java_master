package com.example.demo.ProgramacionEjemploJavaBeans;

public class ManejoJavaBeans {
    public static void main(String[] args) {

        PersonaBean bean = new PersonaBean();
        bean.setNombre("juan");
        bean.setEdad(28);

        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());

        PersonaBean bean2 = new PersonaBean("karla", 33);
        System.out.println(bean2);
    }
}
