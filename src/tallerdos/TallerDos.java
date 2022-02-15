/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jair Ortiz
 */
public class TallerDos extends CreateShips  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        CreateShips cr=new CreateShips(); // creo un objeto para ejecutar la creacion de la lista 
        int option;
        
        Ships s1 = new Ships(1,"Lanzadores","Saturno V","Queroseno y mas","EE.UU"); // creo las naves predeterminadas
        Ships s2 = new Ships(2,"Lanzadores","Ariane V","Solido + N(liq.)+O(liq.)","Europa");
        Ships s3 = new Ships(3,"Tripulada","Soho","MMH**+NO","Europa");
        Ships s4 = new Ships(4,"Tripulada","Progreso M","N2O4+UDMH","EE.UU");
        Ships s5 = new Ships(5,"No Tripulada","Vostok","NO+Amina","Rusia");
        Ships s6 = new Ships(6,"No Tripulada","Shenzou","N2O4+MMH","China");
        
        ArrayList<Ships> s = new ArrayList<Ships>(); // Con este metodo ubicamos las naves dentro de un Array 
        String search;
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        do{ // creo las opciones del menu para mostrar las naves 
            
            System.out.println("--------------------------------------------");
            System.out.println("Seleccione una de las siguientes opciones: ");
            System.out.println("1. Crear una nave");
            System.out.println("2. listar naves");
            System.out.println("3. Salir");
 
            try { // metodo para manejar errores 
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) { // dependiendo de la opcion seleccionada se ejecuta su respectiva accion 
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        cr.CreateShips(s);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        s.add(s1);
                        s.add(s2);
                        s.add(s3);
                        s.add(s4);
                        s.add(s5);
                        s.add(s6);
                        for (Ships elemento:s){
                            System.out.println(elemento);
                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }while (!salir);
    }
    
}