/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author cosca
 */
public abstract class Trabajador {

    private String nombre,
            direccion,
            puesto;
    private int movil,
            NSS;
    private LocalDate fechaContratacion;

    public Trabajador(String nombre, int NSS) {
        this.nombre = nombre;
        this.NSS = NSS;
    }

    public Trabajador(String nombre, String direccion, String puesto, int movil, LocalDate fechaContratacion,
            int NSS) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puesto = puesto;
        this.movil = movil;
        this.fechaContratacion = fechaContratacion;
        this.NSS = NSS;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getMovil() {
        return movil;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public int getNSS() {
        return NSS;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", puesto=" + puesto + ", NSS=" + NSS + '}';
    }

    public abstract double calcularPaga();

}
