/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._3_1_colecciones;

/**
 *
 * @author Cetecom
 */
public class Empleado {
    private String rut, nombreEmpleado;
    private char genero;//M o F
    private int anio, edad;
    private Puesto puesto;
    
    public Empleado(){
        puesto = new Puesto();
    }

    public Empleado(String rut, String nombreEmpleado, char genero, int anio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.anio = anio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString(){
        return "Empleado{ rut= "+rut+ ", nombreEmpleado=" + nombreEmpleado+ ",genero="+ genero +",anio="+anio+",edad="+edad +",puesto="+puesto+"}";
    }
}
