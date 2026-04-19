package org.example;
public class NodoArbol<T> {
    T dato;
    NodoArbol<T> izq;
    NodoArbol<T> der;

    public NodoArbol(T dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
}