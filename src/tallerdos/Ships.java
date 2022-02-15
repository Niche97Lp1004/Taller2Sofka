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

    public String getType() { // generacion de los metodos Get y Set de cada uno de los atributos 
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFuel() {
        return Fuel;
    }

    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
