/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
clase que represeta el listado de personas.
*/
public class Listado {
  private final List<Persona> listadoPersonas;   
  
    public Listado() {
        listadoPersonas = (List<Persona>) new ArrayList<Persona>();
    }

  public void setPersona(Persona P){
      listadoPersonas.add(P);
      
  }
  public int getSize(){
      return listadoPersonas.size();
  }
  public String getPersona(int i){
      Persona p = listadoPersonas.get(i);
      String s = p.getNombre();
      s+=  " " + p.getCedula();
      s+=  " " + p.getEdad();
      return s;
  }
    

    
}
