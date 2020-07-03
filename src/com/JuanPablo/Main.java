package com.JuanPablo;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        System.out.println("digite numero de elementos del arbol:");
        int n = tecla.nextInt();
        int d;
        for (int i = 0; i < n ; i++) {
            System.out.println("digite data del elemento # "+(i+1)+" del arbol:");
             d = tecla.nextInt();
            arbol.agregarNodo(d);
        }

        arbol.inOrderI(arbol.getRaiz());
        System.out.println("\n");
        System.out.println(arbol.getRaiz());
        /*
        System.out.println("\n");
        arbol.preOrder(arbol.getRaiz());
        arbol.preOrderI(arbol.getRaiz());
        System.out.println("\n");
        arbol.postOrderI(arbol.getRaiz());
        System.out.println("\n");*/
       int cont=0;
        /*int e = Integer.parseInt(JOptionPane.showInputDialog(null,"digite numero a encontrar: "));*/
       /* while(cont<3){
            System.out.println("digite un numero: ");
            int e = tecla.nextInt();
            System.out.println(arbol.buscarNodo(e));
            cont++;
        }
        cont=0;*/
        while(cont<2){
            System.out.println("digite un numero: ");
            int e = tecla.nextInt();
            arbol.eliminarNodoHoja(e);
            cont++;
        }
        System.out.println("\n");
        arbol.inOrder(arbol.getRaiz());

    }

}
