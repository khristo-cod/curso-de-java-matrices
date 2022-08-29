
package arreglos;

import domain.Persona;

public class TestArreglosObjet {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona ("Juan");
        personas[1] = new Persona ("Karla");
        
        System.out.println("persona 0= " + personas[0]);
        System.out.println("persona 1= " + personas[1]);
    }
}
