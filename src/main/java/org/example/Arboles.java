package org.example;

public class Arboles {
    private int altura;
    private int edad;
    private String nombre;
    private boolean fruto;

    //constructor vacio
    public Arboles(){

    }

    public Arboles(int altura, int edad, String nombre, boolean fruto) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.fruto = fruto;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFruto() {
        return fruto;
    }

    public void setFruto(boolean fruto) {
        this.fruto = fruto;
    }

    //metodos
public String creciendo(){
        return "estoy creciendo";
}

public String agua(){
        return "necesito agua";

}

    @Override
    public String toString() {
        return "Arboles{" +
                "altura=" + altura +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", fruto=" + fruto +
                '}';
    }
}
