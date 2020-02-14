/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.uf1.act17.pkg2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author xavierbabiba
 */
public class M3UF1Act172 {

    static Scanner keyboard = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
               case 1:
                    p1();
                    break;

                case 2:
                    p2();
                    break;

                case 3:
                    p3();
                    break;

                case 4:
                    p4();
                    break;

                case 5:
                    p5();
                    break;

                case 6:
                    p6();
                    break;

                case 7:
                    p7();
                    break;

                case 8:
                    p8();
                    break;
                    
                case 9:
                    p9();
                    break;
                    
                case 10:
                    p8();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

    

    

    private static void p1() {
        float monedaX;
        int euro = keyboard.nextInt();
        monedaX = Float.valueOf(euro);
        
        System.out.println(monedaX);
    }

    private static void p2() {
        double result;
        double boxEuro = keyboard.nextDouble();
        result = Double.valueOf(boxEuro * 1.1);
        //return = result;
    }

    private static void p3() {
    }

    private static void p4() {
        System.out.println("Euros: ");
        euros1 = keyboard.next();
        dolarsInt = functionSanty(euros);
        System.out.println(dolarsInt + "");
    }

    private static void p5() {

    }

    private static void p6() {

    }

    private static void p7() {

    }

    private static String p8() {
        System.out.println("Name? ");
        String name = keyboard.next();
        
        String nameBinary = functionStringToBinary(name);
        System.out.println(nameBinary);
        
        String result = "" ;
        
        char ch;
        
        for (int i = 0; i < txt.length(); i++) {
            ch = txt.charAt(i);
            result = Integer.toBinaryString(ch);
        }
        
        return result;
    }
    
    private static void p9() {
        char ch = ' ' ;
        ch = (char) number;
        return ch;
    }
    
    private static void p10() {
    }

    private static void userMenu() {
        System.out.println("Opción 1- (Números de 0 a 9):");
        System.out.println("Opción 2- (Números pares de 0 a 10):");
        System.out.println("Opción 3-(Números impares de 0 a 10)");
        System.out.println("Opción 4-(Números de 0 a N)");
        System.out.println("Opción 0- salir");
        System.out.print("\nOpcion ?: ");
    }
}
}
}
