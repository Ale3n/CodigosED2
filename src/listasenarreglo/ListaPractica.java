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
    private int cantElem;
    private int max;
    private int[] elem;

    public ListaPractica(int max) {
        this.max = max;
        this.cantElem = 0;
        this.elem = new int[max];
    }

    @Override
    public String toString() {//><
        String s = "[";
        int i = 0;
        while(i<cantElem)
        {
            s = s + elem[i];
            if(i<cantElem-1) s += ",";
            i++;
        }
        return s + "]";
        
    }

    
    
    
}
