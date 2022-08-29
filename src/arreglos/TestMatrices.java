
package arreglos;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 8;
        edades [1][1] = 4;
        edades [2][0] = 5;
        edades [2][1] = 3;
        
        for (int ren = 0 ; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }
        
        String frutas [][] = {{"naranja", "limon"},{"fresa", "zarzamora"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                System.out.println("frutas "+ ren + "-" + col + ": " + frutas[ren][col]);
            }
        }  
    }
}
