/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._3_1_colecciones;
import java.util.Scanner;
/**
 *
 * @author Cetecom
 */
public class TestEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ingreso= "";
        Puesto pueston = new Puesto(1,"Gerente");
        Puesto puestito = new Puesto(2,"Ejecutivo");
        
        Empleado empleado1 = new Empleado("1-9","Jhon",'M',10,40,pueston);
        Empleado empleado2 = new Empleado("2-7","Juanita",'F',2,25,puestito);

        //Inicialización de metodo para crear la colección
        Empresa empresa = new Empresa();
        
     
        //Se añade empleado 1
        if(empresa.buscarEmpleado(empleado1.getRut())== false){
            empresa.agregar(empleado1);
            System.out.println("Se agregó empleado: "+empleado1.getNombreEmpleado());
        }else{
            System.out.println("El empleado "+empleado1.getNombreEmpleado()+ " existe");
        }
        //Se añade empleado 2
        if(empresa.buscarEmpleado(empleado2.getRut())== false){
            empresa.agregar(empleado2);
            System.out.println("Se agregó empleado: "+empleado2.getNombreEmpleado());
        }else{
            System.out.println("El empleado "+empleado2.getNombreEmpleado()+ " existe");
        }
        
        //Mostramos la lista de empleados
        empresa.listarEmpleados();
        //Eliminamos el empleado con el rut
        System.out.println("Ingrese rut para eliminar: ");
        ingreso = teclado.next();
        empresa.eliminaEmpleado(ingreso);
        //Mostramos la lista con un empleado menos
        empresa.listarEmpleados();
        
    }
    
}
