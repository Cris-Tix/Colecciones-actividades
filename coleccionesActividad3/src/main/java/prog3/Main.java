package prog3;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto(1, "Jabon");
        Producto prod2 = new Producto(2, "Detergente");
        Producto prod3 = new Producto(3,"Talco");
        Producto prod4 = new Producto(1, "Fideos");
        Producto prod5 = new Producto(4, "Arroz");
        Producto prod6 = new Producto(5, "Azucar");
        Producto prod7 = new Producto(3, "Cereal");
        Producto prod8 = new Producto(1, "Aceite");
        Producto prod9 = new Producto(1, "Dulce de leche");
        Producto prod10 = new Producto(2, "Avena");
        //No se agregar los productos con codigo duplicado
        System.out.println("---PRODUCTOS---");
        Set<Producto> listaProductos = new HashSet<>();
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
        listaProductos.add(prod4);
        listaProductos.add(prod5);
        listaProductos.add(prod6);
        listaProductos.add(prod7);
        listaProductos.add(prod8);
        listaProductos.add(prod9);
        listaProductos.add(prod10);
        for (Producto x: listaProductos){
            System.out.println(x);
        }
    }
}