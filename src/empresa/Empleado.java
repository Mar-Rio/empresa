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
public class Empleado extends Trabajador{
    private double sueldo,
            IRPF;

    public Empleado(double sueldo, String nombre, int NSS) {
        super(nombre, NSS);
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String direccion, String puesto, int movil, LocalDate fechaContratacion, int NSS) {
        super(nombre, direccion, puesto, movil, fechaContratacion, NSS);
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }
    
    @Override
    public double calcularPaga() {
        double sueldoNetoMensual = sueldo *  (100 - IRPF) / 100 ;
        return  sueldoNetoMensual / 12;
        
    }
}
