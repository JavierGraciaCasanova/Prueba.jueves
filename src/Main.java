import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int filas=10;
        int columnas=10;
        Random alea=new Random();
        int MatrizNum [][] =new int[filas][columnas];
        String MatrizUsua [][]=new String[filas][columnas];

        //Introducimos números aleatorios en tablero
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j <columnas; j++) {
                MatrizNum[i][j]= alea.nextInt(10,99);
            }
        }
        //Rellenamos tablero con "X"
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j <columnas; j++) {
                MatrizUsua[i][j]="X";
            }
        }
        System.out.println("Tablero 10x10");

        for (int i = 0; i <filas; i++) {
            for (int j = 0; j <columnas; j++) {
                System.out.print(MatrizNum[i][j]+" ");
            }
            System.out.println();
        }

    }
}