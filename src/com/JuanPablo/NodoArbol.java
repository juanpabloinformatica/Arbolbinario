package com.JuanPablo;

public class NodoArbol {
    int data;
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;
    NodoArbol(int data){
        this.data=data;
        hijoIzquierdo=null;
        hijoDerecho=null;
    }
    public String toString (){
        return "el numero encontrado "+this.data;
    }


}
