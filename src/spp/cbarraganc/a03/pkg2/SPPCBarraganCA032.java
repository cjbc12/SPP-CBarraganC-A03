/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppcbarraganca03.pkg1;
import java.util.*;

/**
 *
 * @author Barra
 */
public class SPPCBarraganCA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("Bienvenido al calculo de raíz cuadrada");
    
    int a;
     a= SolicitarNumero();
     mostrar(a);
    }
    public static int SolicitarNumero(){
        int a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Numero Entero");
        a=teclado.nextInt();
        return a;
    }
    public static void mostrar (int a){
        double r;
        r= Math.sqrt(a);
        System.out.println("La Raiz es " + r);
        System.out.println("Se utilizo (Math.sqrt)");
    }
}

    
