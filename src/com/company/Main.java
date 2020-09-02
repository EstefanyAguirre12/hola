package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int numero=0, anterior=1, resultado=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese La de : ");
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            resultado=numero+anterior;
            numero=anterior;
            anterior=resultado;
            System.out.println(numero);
        }
    }
}
