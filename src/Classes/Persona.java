package Classes;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private long numero;
    Scanner seleccion = new Scanner(System.in);

    public Persona(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public Persona() {
        System.out.print("Introduce el Nombre: ");
        nombre = seleccion.nextLine();
        System.out.print("Introduce el Numero deseado: ");
        numero = seleccion.nextLong();
        seleccion.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
