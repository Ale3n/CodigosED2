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

    private int countElem;
    private int max;
    private int[] elem;

    /* ================= CONSTRUCTORES ================= */

    public Lista() {
        this.max = 100;
        this.countElem = 0;
        this.elem = new int[max];
    }

    public Lista(int max) {
        this.max = max;
        this.countElem = 0;
        this.elem = new int[max];
    }

    /* ================= toString ================= */

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < countElem; i++) {
            s += elem[i];
            if (i < countElem - 1) s += ", ";
        }
        return s + "]";
    }

    /* ================= INSERTAR ================= */

    // 1
    public void insertarIesimo(int x, int i) {
        for (int k = countElem - 1; k >= i; k--) {
            elem[k + 1] = elem[k];
        }
        elem[i] = x;
        countElem++;
    }

    // 2
    public void insertarPrim(int x) {
        insertarIesimo(x, 0);
    }

    // 3
    public void insertarUlt(int x) {
        insertarIesimo(x, countElem);
    }

    // 4
    public void insertarIesimo(Lista L2, int i) {
        for (int k = countElem - 1; k >= i; k--) {
            elem[k + L2.countElem] = elem[k];
        }
        for (int j = 0; j < L2.countElem; j++) {
            elem[i + j] = L2.elem[j];
        }
        countElem += L2.countElem;
    }

    // 5
    public void insertarPrim(Lista L2) {
        insertarIesimo(L2, 0);
    }

    // 6
    public void insertarUlt(Lista L2) {
        insertarIesimo(L2, countElem);
    }

    /* ================= ELIMINAR ================= */

    // 7
    public void eliminarIesimo(int i) {
        for (int k = i + 1; k < countElem; k++) {
            elem[k - 1] = elem[k];
        }
        countElem--;
    }

    // 8
    public void eliminarPrim() {
        eliminarIesimo(0);
    }

    // 9
    public void eliminarUlt() {
        eliminarIesimo(countElem - 1);
    }

    // 10
    public void eliminarTodo(int x) {
        int i = 0;
        while (i < countElem) {
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
        for (int i = 0; i < countElem; i++) {
            if (elem[i] == x) c++;
        }
        return c;
    }

    // 11
    public void eliminarUnicos() {
        int i = 0;
        while (i < countElem) {
            if (contarOcurrencias(elem[i]) == 1) {
                eliminarIesimo(i);
            } else {
                i++;
            }
        }
    }

    // 12
    public void eliminarTodo(Lista L2) {
        for (int i = 0; i < L2.countElem; i++) {
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
            int x = elem[countElem - 1];
            eliminarUlt();
            insertarPrim(x);
        }
    }

    /* ================= ELIMINAR POR CANTIDAD ================= */

    // 15
    public void eliminarPrim(int n) {
        for (int i = 0; i < n && countElem > 0; i++) {
            eliminarPrim();
        }
    }

    // 16
    public void eliminarUlt(int n) {
        for (int i = 0; i < n && countElem > 0; i++) {
            eliminarUlt();
        }
    }

    // 17
    public void eliminarIesimo(int i, int n) {
        for (int k = 0; k < n && i < countElem; k++) {
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
        while (i < countElem) {
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
        while (i < countElem) {
            eliminarIesimo(i);
        }
    }
}

