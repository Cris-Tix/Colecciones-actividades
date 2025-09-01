package prog3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno("Pedro", 10);
        Alumno alu2 = new Alumno("Cristian",8.5);
        Alumno alu3 = new Alumno("Micaela", 9.5);
        Alumno alu4 = new Alumno("Juan", 6);
        Alumno alu5 = new Alumno("Romina", 7);
        System.out.println("---Notas de los alumnos---");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alu1);
        listaAlumnos.add(alu2);
        listaAlumnos.add(alu3);
        listaAlumnos.add(alu4);
        listaAlumnos.add(alu5);
        for(Alumno a: listaAlumnos){
            System.out.println(a);
        }
    }
}