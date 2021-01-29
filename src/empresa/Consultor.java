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
public class Consultor extends Trabajador{
    private double horas,
            precioHora;

    public Consultor(double precioHora, String nombre, int NSS) {
        super(nombre, NSS);
        this.precioHora = precioHora;
    }

    public Consultor(double precioHora, String nombre, String direccion, String puesto, int movil, LocalDate fechaContratacion, int NSS) {
        super(nombre, direccion, puesto, movil, fechaContratacion, NSS);
        this.precioHora = precioHora;
    }

    public double getHoras() {
        return horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    @Override
    public double calcularPaga() {
        return horas * precioHora;
    }
    
}
