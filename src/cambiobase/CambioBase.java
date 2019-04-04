/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiobase;

import java.util.*;
import java.lang.Math;
import static java.lang.Math.pow;

/**
 *
 * @author JAVIER
 */
public class CambioBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

// transforma un decimal a una base n
    public static String decTobase(int dec, int base) {
        //crea string y rellena con numeros del 1 al 9 y letras del alfabeto
        String[] letras = new String[36];
        rellenar(letras);

        int resto;
        String transformada = "";
        while (dec > 0) {
            resto = dec % base;
            //System.out.println(dec);
            dec = dec / base;
            if (resto <= 9) {
                transformada = resto + transformada;
            } else {
                transformada = letras[resto] + transformada;

            }
        }

        return transformada;

    }
    //transforma un numero en base n a decimal

    public static void rellenar(String[] letras) {

        letras[0] = "0";
        letras[1] = "1";
        letras[2] = "2";
        letras[3] = "3";
        letras[4] = "4";
        letras[5] = "5";
        letras[6] = "6";
        letras[7] = "7";
        letras[8] = "8";
        letras[9] = "9";
        letras[10] = "A";
        letras[11] = "B";
        letras[12] = "C";
        letras[13] = "D";
        letras[14] = "E";
        letras[15] = "F";
        letras[16] = "G";
        letras[17] = "H";
        letras[18] = "I";
        letras[19] = "J";
        letras[20] = "K";
        letras[21] = "L";
        letras[22] = "M";
        letras[23] = "N";
        letras[24] = "O";
        letras[25] = "P";
        letras[26] = "Q";
        letras[27] = "R";
        letras[28] = "S";
        letras[29] = "T";
        letras[30] = "U";
        letras[31] = "V";
        letras[32] = "W";
        letras[33] = "X";
        letras[34] = "Y";
        letras[35] = "Z";

    }

    public static int baseTodec(String numero, int n) {
        int decimal = 0;
        int largo = numero.length();
        String[] letras = new String[36];
        rellenar(letras);

        for (int i = 0; i < largo; i++) {
            char variable = numero.charAt(largo - i - 1);
            for (int j = 0; j < 36; j++) {
                if (letras[j].equals("" + variable) & j < 10) {
                    int entero = Integer.parseInt("" + variable);
                    decimal = (int) (decimal + (entero * pow((double) n, (double) i)));

                } else if (letras[j].equals("" + variable) & j >= 10) {

                    decimal = (int) (decimal + (j * pow((double) n, (double) i)));
                }

            }

        }
        return decimal;

    }
    
    public static String baseTobase(String inicial,int b1, int b2){
        int decimal=baseTodec(inicial, b1);
        String Final = decTobase(decimal, b2);
        
        return Final;
        
        
    }

}
