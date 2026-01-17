/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenarreglo;

/**
 *
 * @author Tower
 */
public class Lista {
    private int cantElem;
    private int max;
    private int[] elem;

    /* ================= CONSTRUCTORES ================= */

    public Lista(int max) {
        this.max = max;
        this.cantElem = 0;
        this.elem = new int[max];
    }

    /* ================= toString ================= */

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < cantElem; i++) {
            s += elem[i];
            if (i < cantElem - 1) s += ", ";
        }
        return s + "]";
    }

    /* ================= INSERTAR ================= */

    // 1
    public void insertarIesimo(int x, int i) {
        for (int k = cantElem - 1; k >= i; k--) {
            elem[k + 1] = elem[k];
        }
        elem[i] = x;
        cantElem++;
    }

    // 2
    public void insertarPrim(int x) {
        insertarIesimo(x, 0);
    }

    // 3
    public void insertarUlt(int x) {
        insertarIesimo(x, cantElem);
    }

    // 4
    public void insertarIesimo(Lista L2, int i) {
        for (int k = cantElem - 1; k >= i; k--) {
            elem[k + L2.cantElem] = elem[k];
        }
        for (int j = 0; j < L2.cantElem; j++) {
            elem[i + j] = L2.elem[j];
        }
        cantElem += L2.cantElem;
    }

    // 5
    public void insertarPrim(Lista L2) {
        insertarIesimo(L2, 0);
    }

    // 6
    public void insertarUlt(Lista L2) {
        insertarIesimo(L2, cantElem);
    }

    /* ================= ELIMINAR ================= */

    // 7
    public void eliminarIesimo(int i) {
        for (int k = i + 1; k < cantElem; k++) {
            elem[k - 1] = elem[k];
        }
        cantElem--;
    }

    // 8
    public void eliminarPrim() {
        eliminarIesimo(0);
    }

    // 9
    public void eliminarUlt() {
        eliminarIesimo(cantElem - 1);
    }

    // 10
    public void eliminarTodo(int x) {
        int i = 0;
        while (i < cantElem) {
            if (elem[i] == x) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }

    /* ================= UNICOS ================= */

    private int contarOcurrencias(int x) {
        int c = 0;
        for (int i = 0; i < cantElem; i++) {
            if (elem[i] == x) c++;
        }
        return c;
    }

    // 11
    public void eliminarUnicos() {
        int i = 0;
        while (i < cantElem) {
            if (contarOcurrencias(elem[i]) == 1) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }

    // 12
    public void eliminarTodo(Lista L2) {
        for (int i = 0; i < L2.cantElem; i++) {
            eliminarTodo(L2.elem[i]);
        }
    }

    /* ================= ROTACIONES ================= */

    // 13
    public void rotarIzqDer(int n) {
        for (int i = 0; i < n; i++) {
            int x = elem[0];
            eliminarPrim();
            insertarUlt(x);
        }
    }

    // 14
    public void rotarDerIzq(int n) {
        for (int i = 0; i < n; i++) {
            int x = elem[cantElem - 1];
            eliminarUlt();
            insertarPrim(x);
        }
    }

    /* ================= ELIMINAR POR CANTIDAD ================= */

    // 15
    public void eliminarPrim(int n) {//Método que eliminar los primeros n-elementos de la lista L1.
        for (int i = 0; i < n && cantElem > 0; i++) {
            eliminarPrim();
        }
    }

    // 16
    public void eliminarUlt(int n) {
        for (int i = 0; i < n && cantElem > 0; i++) {
            eliminarUlt();
        }
    }

    // 17 Método que elimina los n-elementos de la lista L1, desde la posición i.
    public void eliminarIesimo(int i, int n) {
        for (int k = 0; k < n && i < cantElem; k++) {
            eliminarIesimo(i);
        }
    }

    // 18
    public void eliminarExtremos(int n) {
        eliminarPrim(n);
        eliminarUlt(n);
    }

    // 19
    public void eliminarVeces(int k) {
        int i = 0;
        while (i < cantElem) {
            if (contarOcurrencias(elem[i]) == k) {
                int x = elem[i];
                eliminarTodo(x);
            } else {
                i++;
            }
        }
    }

    // 20
    public void eliminarAlternos() {
        int i = 1; 
        while (i < cantElem) {
            eliminarIesimo(i);
            i++; 
        }
    }
    
    
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
    public void insertarLugarDesc(int x)//>< CODIGO 1 INSERTAR NUMERO 2
    {
        int k = cantElem - 1;
        while(k>=0 && x > elem[k])
        {
            elem[k+1] = elem[k];
            k = k-1;
        }
        elem[k+1] = x; cantElem++;
    }
    public void generarAsc(int n, int a,int b) //NUMERO 3
    {
        int c = 0;
        while (c < n)
        {
            int x = a +(int)(Math.random()*(b-a+1));
            insertarLugarAsc(x);
            c++;
        }
    }
    public void generarDesc(int n,int a ,int b)//4
    {
        int c =0;
        while(c<n){
            int x = a +(int)(Math.random()*(b-a+1));
            insertarLugarDesc(x);
            c++;
        }
    }
     public boolean mismoElem(Lista L1)//5
    {
        return this.estanTodos(L1)&& L1.estanTodos(this);
    }
    public boolean estanTodos(Lista L1)
    {
        int i = 0;
        while(i<L1.cantElem)
        {
            if (!this.seEncuentra(L1.elem[i]))
                return false;
            i = i+1;
        }
        return true;
    }
    public boolean seEncuentra(int x) {
    for (int i = 0; i < this.cantElem; i++) {
        if (this.elem[i] == x) {
            return true;
        }
    }
    return false;
    }
    
    public void generarAleatorios(int n,int a ,int b)//6
    {
        int c =0;
        while(c<n){
            int x = a +(int)(Math.random()*(b-a+1));
            insertarUlt(x);
            c++;
        }
    }
    public void generarDiferentes(int n,int a ,int b)//7
    {
        int c =0;
        while(c<n){
            int x = a +(int)(Math.random()*(b-a+1));
            if(frecuencia(x) == 0)
            {
                insertarUlt(x);
                c++;
            }
        }
    }
    public void pasarDigitos(int n)//8
    {
        while(n>0){
           int d = n % 10;
           insertarPrim(d);
           n = n/10;
        }
    }
    public void comunes(Lista L2, Lista L3)//9
    {
        int i = 0;
        while(i<L2.cantElem ){
            if (L3.frecuencia(L2.elem[i]) > 0 && frecuencia(L2.elem[i]) == 0) {
            insertarUlt(L2.elem[i]);
            }
        i++;
        }
    }
    
    
    public void intercalar(Lista L1, Lista L2)//>< CODIGO 2 10
    {
         int i = 0, j=0;
       while(i<L1.cantElem || j < L2.cantElem )
       {
           if(i<L1.cantElem)
           {
               this.insertarUlt(L1.elem[i]);
               i++;
           }
           if(j<L2.cantElem){
               this.insertarUlt(L2.elem[j]);
               j++;
           }
       }
    }
    
    
    public boolean ordenado() {//11
        boolean asc = true, desc = true;
        int i = 0;
        while (i < cantElem - 1) {
            if (elem[i] > elem[i + 1]) asc = false;
            if (elem[i] < elem[i + 1]) desc = false;
            i++;
        }
        return asc || desc;
    }
    
    public boolean iguales() {//12
        int i = 1;
        while (i < cantElem) {
            if (elem[i] != elem[0])
                return false;
            i++;
        }
        return true;
    }
    public boolean diferentes() {//13
        int i = 0;
        while (i < cantElem) {
            if (frecuencia(elem[i]) > 1)
                return false;
            i++;
        }
        return true;
    }
    
    public int frecuencia(int x)//14
    {
         int c = 0, i = 0;
         while(i <cantElem)
         {
             if(elem[i]==x)c++;
             i++;
         }
         return c;
    }
     
    public boolean mismaFrec() {//15
        int f = frecuencia(elem[0]);
        int i = 1;
        while (i < cantElem) {
            if (frecuencia(elem[i]) != f)
                return false;
            i++;
        }
        return true;
    }
    public boolean existeFrec(int n) {//16
        int i = 0;
        while (i < cantElem) {
            if (frecuencia(elem[i]) == n)
                return true;
            i++;
        }
        return false;

    }
    public boolean poker() {//17
        int i = 0;
        while (i < cantElem) {
            if (frecuencia(elem[i]) == cantElem - 1)
                return true;
            i++;
        }
        return false;
    }
    public boolean palindrome() {//18
        int i = 0;
        while (i < cantElem / 2) {
            if (elem[i] != elem[cantElem - 1 - i])
                return false;
            i++;
        }
        return true;
    }  
   
}

