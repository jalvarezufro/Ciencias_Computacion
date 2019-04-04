/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static java.lang.Math.pow;

/**
 *
 * @author JAVIER
 */
public class ejercicio4 {

    public static void main(String[] args) {

    }

    public static String decTobin(int dec) {
        //crea string y rellena con numeros del 1 al 9 y letras del alfabeto

        int resto;
        String transformada = "";
        while (dec > 0) {
            resto = dec % 2;
            //System.out.println(dec);
            dec = dec / 2;

            transformada = resto + transformada;

        }

        return transformada;

    }

    public static int binTodec(String numero) {
        int decimal = 0;
        int largo = numero.length();

        for (int i = 0; i < largo; i++) {
            char variable = numero.charAt(largo - i - 1);

            int entero = Integer.parseInt("" + variable);
            decimal = (int) (decimal + (entero * pow((double) 2, (double) i)));

        }
        return decimal;
    }

}
