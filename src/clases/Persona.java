/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/*
clase que representa una persona, puede realizar un registro 
*/
public class Persona {
    private String cedula;//cedula de la persona
    private int  edad;//edad de la persona
    private String nombre;//nombre de la persona

    public Persona(String cedula, int edad, String nombre) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
