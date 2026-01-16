/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenarreglo;

/**
 *
 * @author Tower
 */
public class ListaPractica {
    private int countElem;
    private int max;
    private int[] elem;

    public ListaPractica(int max) {
        this.max = max;
        this.countElem = 0;
        this.elem = new int[max];
    }

    @Override
    public String toString() {//><
        String s = "[";
        int i = 0;
        while(i<countElem)
        {
            s = s + elem[i];
            if(i<countElem-1) s += ",";
            i++;
        }
        return s + "]";
        
    }
    public void insertarIesimo(int x, int i) {//1
        for (int k = countElem - 1; k >= i; k--) {
            elem[k + 1] = elem[k];
        }
        elem[i] = x;
        countElem++;
    }
    
    
    public void eliminarIesimo(int i) {//2
        for (int k = i + 1; k < countElem; k++) {
            elem[k - 1] = elem[k];
        }
        countElem--;
    }
    
    
    public void eliminarTodo(int x) {//3 eliminarTodo( x ) : Método que elimina todos los elementos x de la lista L1.
        int i = 0;
        while (i < countElem) {
            if (elem[i] == x) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }
    public void eliminarPrim(int n) {//4 eliminarPrim( n ) : Método que eliminar los primeros n-elementos de la lista L1.
        for (int i = 0; i < n && countElem > 0; i++) {
            eliminarPrim();
        }
    }

    // 16
    public void eliminarUlt(int n) {//5eliminarUlt( n ) : Método que elimina los n-últimos elementos de la lista L1.
        for (int i = 0; i < n && countElem > 0; i++) {
            eliminarUlt();
        }
    }
     public void eliminarPrim() {// Método que elimina el elemento de la primer posición.
        eliminarIesimo(0);
    }

    // 9
    public void eliminarUlt() {// Método que elimina el último elemento de la lista L1.
        eliminarIesimo(countElem - 1);
    }

    
    
    
}
