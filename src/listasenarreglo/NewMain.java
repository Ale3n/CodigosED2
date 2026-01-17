/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenarreglo;

/**
 *
 * @author Tower
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista2 l = new Lista2(100);
       l.insertarIesimo(1, 0);
       l.insertarIesimo(2, 1);
       l.insertarIesimo(3, 2);
       l.insertarIesimo(4, 3);
       l.insertarIesimo(5, 4);
       l.insertarIesimo(6, 5);
        System.out.println(l.toString());
       l.eliminarIesimo(0);
        l.eliminarIesimo(0);
         l.eliminarIesimo(0);
       System.out.println(l.toString());
        
       Lista2 l2 = new Lista2(100);
       l2.insertarIesimo(7, 0);
       l2.insertarIesimo(8, 1);
       l2.insertarIesimo(9, 2);
       l2.insertarIesimo(10, 3);
       l2.insertarIesimo(11, 4);
       l2.insertarIesimo(12, 5);
        System.out.println(l2.toString());
       l.insertarIesimo(l2, 2);
       System.out.println(l.toString());
       
        Lista2 l3 = new Lista2(100);
       
       l3.insertarIesimo(1, 0);
       l3.insertarIesimo(2, 1);
       l3.insertarIesimo(1, 2);
        System.out.println(l3.palindrome());
       
        
         Lista2 l4 = new Lista2(100);
       
       //l4.insertarLugarAsc(1);
       l4.insertarLugarAsc(6);
       l4.insertarLugarAsc(6);
       l4.insertarLugarAsc(6);
       l4.insertarLugarAsc(6);
       l4.insertarLugarAsc(2);
        l4.insertarLugarAsc(4);
         l4.insertarLugarAsc(7);
          l4.insertarLugarAsc(9);
           l4.insertarLugarAsc(10);
           l4.insertarLugarAsc(19);
           l4.insertarLugarAsc(16);
           
        System.out.println(l4.toString());
        System.out.println(l4.frecuencia(6));
        System.out.println(l4.iguales());
        
        
        l4.eliminarTodo(6);
        System.out.println("eliminarTodo(6);"+ l4.toString());
        l4.eliminarPrim(3);
        System.out.println(l4.toString());
        l4.eliminarAlternos();
        System.out.println(l4.toString());
        l4.eliminarUnicos();
        System.out.println(l4.toString());
         l4.insertarLugarAsc(4);
         l4.insertarLugarAsc(7);
          l4.insertarLugarAsc(9);
           l4.insertarLugarAsc(10);
           l4.insertarLugarAsc(19);
           l4.insertarLugarAsc(16);
            System.out.println(l4.toString());
        l4.eliminarIesimo(1, 2);
        System.out.println(l4.toString());
    }
    
}
