import Classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telefono agenda = new Telefono();

        int selection;

        do {
            System.out.println("Introduzca una opcion");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Buscar Persona");
            System.out.println("3. Actualizar registro");
            System.out.println("4. Eliminar registro de Persona");
            System.out.println("5. Mostrar todas las personas registradas");
            System.out.println("6. Salir");
            selection = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (selection) {
                case 1:
                    Persona persona = new Persona();
                    agenda.registrarPersona(persona);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre de la persona a buscar:");
                    String nombre = scanner.nextLine();
                    persona = agenda.buscarPersona(nombre);
                    if (persona != null) {
                        System.out.println("Nombre: " + persona.getNombre() + ", Número: " + persona.getNumero());
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre de la persona a actualizar:");
                    nombre = scanner.nextLine();
                    System.out.println("Introduzca el nuevo número de teléfono:");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (agenda.actualizarPersona(nombre, numero)) {
                        System.out.println("Registro actualizado.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Introduzca el nombre de la persona a eliminar:");
                    nombre = scanner.nextLine();
                    if (agenda.eliminarPersona(nombre)) {
                        System.out.println("Registro eliminado.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Personas registradas:");
                    for (Persona p : agenda.mostrarPersonas()) {
                        System.out.println("Nombre: " + p.getNombre() + ", Número: " + p.getNumero());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (selection != 6);

        scanner.close();
    }
}
