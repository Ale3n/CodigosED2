/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenarreglo;

/**
 *
 * @author Tower
 */
public class Lista2 {
    private int max;
    private int cantElem;
    private int[] elem;
    
    public Lista2(int max)
    {
        this.max = max;
        this.cantElem = 0;
        this.elem = new int[max];
    }

    @Override
    public String toString() {
        String s = "[";
        int i = 0;
        while(i<cantElem)
        {
            s = s + elem[i];
            if(i <cantElem-1) s = s + ",";
            i++;
        }
        return s = s + "]";
    }
    
    public void insertarIesimo(int x, int i)
    {
        for(int k = cantElem-1; k>=i;k--)
        {
            elem[k +1] = elem[k];
        }
        elem[i] = x;
        cantElem++;
    }
    
    public void eliminarIesimo(int i)
    {
         for(int k = i +1; k<cantElem;k++)
        {
            elem[k-1] = elem[k];
        }
        cantElem--;
    }
    //--------------------------------------------------------------------------
    public void insertarIesimo(Lista2 L2, int i) {////// Método que insertar la Lista L2, a partir de la posición i, de la Lista L1.
        for (int k = cantElem - 1; k >= i; k--) {
            elem[k + L2.cantElem] = elem[k];
        }
        for (int j = 0; j < L2.cantElem; j++) {
            elem[i + j] = L2.elem[j];
        }
        cantElem += L2.cantElem;
    }
    /////////////////////////////////////////////////////////////
     public boolean palindrome() {//18
        int i = 0;
        while (i < cantElem / 2) {
            if (elem[i] != elem[cantElem - 1 - i])
                return false;
            i++;
        }
        return true;
    }  
    ////////////////////////////////////////////////////////////
    public void insertarLugarAsc(int x)//>< CODIGO 1 NUMNERO 1
    {
        int k = cantElem - 1;
        while(k>=0 && x < elem[k])
        {
            elem[k+1] = elem[k];
            k = k-1;
        }
        elem[k+1] = x; cantElem++;
    }
    /////////////////////////////////////////////////////////
    public int frecuencia(int x)//14  Método que devuelve la cantidad de veces que aparece el elemento x en la Lista L1.
    {
         int c = 0, i = 0;
         while(i <cantElem)
         {
             if(elem[i]==x)c++;
             i++;
         }
         return c;
    }
    /////////////////////////////////////////////////////
    public boolean iguales() {//12  Método lógico que devuelve True, si todos los elementos de la lista L1, son iguales.
        int i = 1;
        while (i < cantElem) {
            if (elem[i] != elem[0])
                return false;
            i++;
        }
        return true;
    }
    //-----------------------------------------------------------
    
    // 10
    public void eliminarTodo(int x) {//Método que elimina todos los elementos x de la lista L1.
        int i = 0;
        while (i < cantElem) {
            if (elem[i] == x) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }
    ////////////////////////////////////////////////////
    public void eliminarPrim(int n) {//Método que eliminar los primeros n-elementos de la lista L1.
        for (int i = 0; i < n && cantElem > 0; i++) {
            eliminarPrim();
        }
    }
    public void eliminarPrim() {
        eliminarIesimo(0);
    }
    //////////////////////////////////////////////7
     public void eliminarAlternos() {
        int i = 1; 
        while (i < cantElem) {
            eliminarIesimo(i);
            i++; 
        }
    }
     ///////////////////////////////////////////////
    /*private int contarOcurrencias(int x) {
        int c = 0;
        for (int i = 0; i < cantElem; i++) {
            if (elem[i] == x) c++;
        }
        return c;
    }*/

    // 11
    public void eliminarUnicos() {
        int i = 0;
        while (i < cantElem) {
            if (frecuencia(elem[i]) == 1) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }
    ////////////////////////////////////////////////////
     public void eliminarIesimo(int i, int n) { // // 17 Método que elimina los n-elementos de la lista L1, desde la posición i.
        for (int k = 0; k < n && i < cantElem; k++) {
            eliminarIesimo(i);
        }
    }
    
    
}
