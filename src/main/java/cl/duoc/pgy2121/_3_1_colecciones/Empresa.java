/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._3_1_colecciones;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Cetecom
 */
public class Empresa {
    
    private List<Empleado> listaEmpleados;
    
    public Empresa(){
        listaEmpleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado emp){
        return listaEmpleados.add(emp);
         
    }
    
    public boolean buscarEmpleado(String rut){
        for(Empleado emp: listaEmpleados){
            if(emp.getRut().equals(rut)){
                return true;
            }
        }
        return false;
    }
    
    public void listarEmpleados(){
        for(Empleado emp: listaEmpleados){
            System.out.println(emp.toString());
        }
    }
    
    public boolean eliminaEmpleado(String rut){
        for(Empleado emp: listaEmpleados){
            if(emp.getRut().equals(rut)){
                System.out.println("Se elimina empleado "+emp.getNombreEmpleado());
                listaEmpleados.remove(emp);
                return true;
            }
        }
        System.out.println("No se ha encontrado empleado ");
        return false;
    }
}
