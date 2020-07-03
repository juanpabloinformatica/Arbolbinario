package com.JuanPablo;

import java.util.Stack;

public class ArbolBinario {
    NodoArbol raiz = null;

    void agregarNodo(int data) {
        NodoArbol nuevoNodo = new NodoArbol(data);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (nuevoNodo.data < auxiliar.data) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevoNodo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevoNodo;
                        return;
                    }
                }
            }
        }
    }

    NodoArbol getRaiz() {
        return raiz;
    }

    void inOrder(NodoArbol raiz) {
        if (raiz == null) {
            return;
        } else {
            inOrder(raiz.hijoIzquierdo);
            System.out.println(raiz.data);
            inOrder(raiz.hijoDerecho);
        }
    }

    void inOrderI(NodoArbol raiz) {
        Stack<NodoArbol> s = new Stack<NodoArbol>();
        while (true) {
            if (raiz == null) {
                if (s.isEmpty()) {
                    return;
                }
                raiz = s.pop();
                System.out.println(raiz.data);
                raiz = raiz.hijoDerecho;
            } else {
                s.push(raiz);
                raiz = raiz.hijoIzquierdo;

            }
        }

    }

    void preOrder(NodoArbol raiz) {
        if (raiz == null) {
            return;
        } else {
            System.out.println(raiz.data);
            preOrder(raiz.hijoIzquierdo);
            preOrder(raiz.hijoDerecho);
        }
    }

    /*void preOrderI(NodoArbol raiz){
          if(raiz==null){
              return;
          }else{
              Stack <NodoArbol>s = new Stack<NodoArbol>();
              s.push(raiz);
              while(!s.isEmpty()){
                  raiz=s.pop();
                  System.out.println(raiz.data);
                  if(raiz.hijoDerecho!=null){
                      s.push(raiz.hijoDerecho);
                  }
                  if(raiz.hijoIzquierdo!=null){
                      s.push(raiz.hijoIzquierdo);
                  }
              }
          }*/
    void preOrderI(NodoArbol raiz) {
        if (raiz == null) {
            return;
        } else {
            Stack<NodoArbol> s = new Stack<NodoArbol>();
            s.push(raiz);
            while (!s.isEmpty()) {
                raiz = s.pop();
                System.out.println(raiz.data);
                if (raiz.hijoDerecho != null) {
                    s.push(raiz.hijoDerecho);
                }
                if (raiz.hijoIzquierdo != null) {
                    s.push(raiz.hijoIzquierdo);
                }
            }
        }
    }

    /*void postOrder(NodoArbol raiz){
            if(raiz!=null){
                postOrder(raiz.hijoIzquierdo);
                postOrder(raiz.hijoDerecho);
                System.out.println(raiz.data);
            }else{
                return;
            }
    }*/
/*void postOrderI(NodoArbol raiz){
        if(raiz==null){
            return;
        }else{
            Stack <NodoArbol> s1 = new Stack<NodoArbol>();
            Stack <NodoArbol> s2 = new Stack<NodoArbol>();
            s1.push(raiz);
            while(!s1.isEmpty()){
                raiz=s1.pop();
                s2.push(raiz);
                if(raiz.hijoIzquierdo!=null){
                    s1.push(raiz.hijoIzquierdo);
                }
                if(raiz.hijoDerecho!=null){
                    s1.push(raiz.hijoDerecho);
                }
            }while(!s2.isEmpty()){
                raiz=s2.pop();
                System.out.println(raiz.data);
            }

        }
}*/
    void postOrder(NodoArbol raiz) {
        if (raiz == null) {
            return;
        } else {
            postOrder(raiz.hijoIzquierdo);
            postOrder(raiz.hijoDerecho);
            System.out.println(raiz.data);
        }
    }

    void postOrderI(NodoArbol raiz) {
        if (raiz == null) {
            return;
        } else {
            Stack<NodoArbol> s1 = new Stack<NodoArbol>();
            Stack<NodoArbol> s2 = new Stack<NodoArbol>();
            s1.push(raiz);
            while (!s1.isEmpty()) {
                raiz = s1.pop();
                s2.push(raiz);
                if (raiz.hijoIzquierdo != null) {
                    s1.push(raiz.hijoIzquierdo);
                }
                if (raiz.hijoDerecho != null) {
                    s1.push(raiz.hijoDerecho);
                }
            }
            while (!s2.isEmpty()) {
                System.out.println(s2.pop().data);
            }
        }
    }

    NodoArbol buscarNodo(int dato) {


            NodoArbol auxiliar = raiz;
            while (auxiliar.data != dato) {
                if (dato<auxiliar.data ) {
                    auxiliar = auxiliar.hijoIzquierdo;
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                }
                if(auxiliar==null){
                    return null;
                }
            }
            return auxiliar;


    }

    void eliminarNodoHoja(int dato) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = auxiliar;
        while (auxiliar.data != dato) {
            padre = auxiliar;
            if (dato < auxiliar.data) {
                auxiliar = auxiliar.hijoIzquierdo;
            } else {
                auxiliar = auxiliar.hijoDerecho;
            }
            if (auxiliar == null) {
               return;
            }
        }
        if(auxiliar!=null) {
            if (auxiliar.data == dato) {
                if (padre.hijoIzquierdo == auxiliar) {
                    padre.hijoIzquierdo = null;
                } else if (padre.hijoDerecho == auxiliar) {
                    padre.hijoDerecho = null;
                }

            }
          /*    if (auxiliar.data == dato) {
                if (padre.hijoIzquierdo.data == dato) {
                    padre.hijoIzquierdo = null;
                } else if (padre.hijoDerecho.data== dato) {
                    padre.hijoDerecho = null;
                }

            }*/
        }


    }
    void eliminar(int dato){
        NodoArbol auxiliar = raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.data!=dato){
            padre=auxiliar;
            if(dato<auxiliar.data){
                esHijoIzq=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if(auxiliar==null){
                return;
            }
        }
        if(auxiliar.hijoDerecho==null&&auxiliar.hijoIzquierdo==null){
            if(esHijoIzq){
                padre.hijoIzquierdo=null;
            }else{
                padre.hijoDerecho=null;
            }
        }
    }


}


