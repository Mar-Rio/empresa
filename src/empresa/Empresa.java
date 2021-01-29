/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author cosca
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador t1 = new Consultor(22, "Pepe", 98765432);
        Trabajador t2 = new Empleado(20000, "Ana", 12121212);
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(t2);
        lista.add(t1);
        ((Consultor) t1).setHoras(200);
        ((Empleado) t2).setIRPF(55);
        String tipo,
                nombre;
        double sueldo,
                horasTrabajadas,
                                IRPF;
        
        for (Trabajador trabajador : lista) {
            tipo = trabajador.getClass().getSimpleName();
            nombre = trabajador.getNombre();
            sueldo = trabajador.calcularPaga();
           System.out.println(tipo + " " + nombre + ". Sueldo: " + sueldo);
            
            
        }
    }

}
