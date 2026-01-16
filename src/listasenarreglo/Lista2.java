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

    public Lista2(int max) {
        this.max = max;
        this.cantElem = 0;
        this.elem = new int[max];
    }
    @Override
    public String toString()
    {
        String s = "[";
        int i = 0;
        while(i <cantElem )
        {
            s = s + elem[i];
            if(i<cantElem-1) s += ",";
            i++;
        }
        return s = s + "]";
    }
    
    public void insertarIesimo(int x, int i)
    {
        for(int k = cantElem-1;k <= i;k--)
        {
            elem[k +1] = elem[k];
        }
        elem[i] = x;
        cantElem++;
    }
    
    public void eliminarIesimo(int i)
    {
        for(int k = i+1; k<cantElem; k++ )
        {
            elem[k-1] = elem[k];
        }
        cantElem--;
    }
    public void eliminarTodo(int x)
    {
        int i = 0;
        while( i < cantElem)
        {
            if(elem[i] == x)
            {
                eliminarIesimo(i);
            }else{
                i++;
            }
        }
    }
    
    public void eliminarPrim()
    {
        eliminarIesimo(0);
    }
     public void eliminarPrim(int n)
    {
        for(int i = 0; i<n && cantElem > 0; i++)
        {
            eliminarPrim();
        }
    }
     
    public void eliminarUlt()
    {
        eliminarIesimo(cantElem-1);
    }    
    public void eliminarUlt(int n)
    {
        for(int i = 0; i<n && cantElem>0;i++)
        {
            eliminarUlt();
        }
    }    
    
    
    
    
    
}
