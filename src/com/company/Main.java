package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // CREAR ARRAY
        int array [] = new int [11];
        int puntoInicial = 4;

        // LOOP
        for (int i = 1; i <= array.length; i++){
            int index = (int)Math.pow(i, 2) % array.length;
            int nuevoIndex;
            // CASE #1 [EXCEDEMOS CUANDO RETROCEDEMOS]
            if (i % 2 == 0 && puntoInicial - index < 0){
                nuevoIndex = array.length + puntoInicial - index;
            }
            // CASO #2 [EXCEDEMOS CUANDO AVANZAMOS]
            else if (i % 2 != 0 && puntoInicial + index >= array.length){
                nuevoIndex = puntoInicial + index - array.length;
            }
            // CASO #3 [BASICO]
            else{
                nuevoIndex = i % 2 != 0 ? puntoInicial + index : puntoInicial - index;
            }
            array[nuevoIndex] = (int) Math.pow(i, 2);
            System.out.println(Arrays.toString(array));
        }


    }
}
