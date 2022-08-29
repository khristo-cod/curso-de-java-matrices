
package arreglos;

public class Arreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        edades[0] = 10;
        edades[1] = 12;
        edades[2] = 8;
        
        for (int i =0; i < edades.length; i++){
            System.out.println("elemento edades = " + i + ": " + edades[i]);
        }
    }
    
}
