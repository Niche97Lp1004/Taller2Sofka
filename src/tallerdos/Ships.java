/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdos;

/**
 *
 * @author JairOrtiz
 */
public class Ships {
    
    private String Type, Name, Fuel, Country; //Atributosd de la nave
    private int id;

    public Ships(int id,String Type, String Name, String Fuel, String Country) { // constructor 
        this.id = id;
        this.Type = Type;
        this.Name = Name;
        this.Fuel = Fuel;
        this.Country = Country;
    }

    @Override
    public String toString() { // metodo para imprimir la informacion de la naves en el orden deseado 
        return "Nave #"+ id + " Tipo=" + Type + " Nombre=" + Name + " Combustible=" + Fuel + " Pais=" + Country;
    }


}
