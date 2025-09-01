package prog3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Curso cur1 = new Curso("Matematica", "Cristian");
        Curso cur2 = new Curso("Algebra", "Micaela");
        Curso cur3 = new Curso("Natacion", "Broly");
        Curso cur4 = new Curso("Logica", "Panlulu");
        Curso cur5 = new Curso("Base de datos", "Simba");
        Curso cur6 = new Curso("Programacion 1", "Romina");
        Curso cur7 = new Curso("Programacion 2", "Juan");
        Curso cur8 = new Curso("Programacion 3", "Alexis");
        Map<String, Curso> listaMap = new HashMap<>();//Creo HashMap y le agrego los cursos debajo
        listaMap.put("1",cur1);
        listaMap.put("2",cur2);
        listaMap.put("3",cur3);
        listaMap.put("4",cur4);
        listaMap.put("5",cur5);
        listaMap.put("6",cur6);
        listaMap.put("6",cur7);//Sobreescribo para demostrar que se mantiene la Key pero cambia el valor
        listaMap.put("6", cur8);//Lo mismo que arriba
        System.out.println("-----------------");
        Curso cursoPorClave = listaMap.get("6");//asigno un curso por clave para mostrarlo por pantalla
        System.out.println("Curso recuperado con clave 6: " + cursoPorClave);
        System.out.println("-----------------");
        for (Map.Entry<String, Curso> e: listaMap.entrySet()){
            System.out.println("Clave:"+ e.getKey() + " Valor:" + e.getValue());
        }
    }
}