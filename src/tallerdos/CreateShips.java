/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdos;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author jairOrtiz
 */
public class CreateShips implements ICreateShips{
    public List<Ships> s = new ArrayList<Ships>(); // Con este metodo ubicamos las canciones dentro de un Array 
    String search;
    Scanner sca = new Scanner (System.in);
    private String Type, Name, Fuel, Country; //Atributos
    private int id;
 
    public void CreateShips(ArrayList<Ships> Introduce){ // creo el metodo para crear naves 
        
        System.out.println("Ingrese una Id: ");
        id = sca.nextInt();
        System.out.println("Ingrese el tipo de nave(Lanzadera-Tripulada-Notripulada): ");
        Type = sca.next();
        System.out.println("Ingrese un Nombre: ");
        Name = sca.next();
        System.out.println("Ingrese el Conbustible que emplea: ");
        Fuel = sca.next();
        System.out.println("Ingrese el pais que la emplea: ");
        Country = sca.next();
        
        Introduce.add(new Ships(id, Type, Name, Fuel, Country));
    }
    @Override
    public void CreateShips() { // guarda los datos de creacion en un array
        CreateShips((ArrayList<Ships>) s);
    }
}
