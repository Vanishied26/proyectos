package Superheroes;
import java.util.Scanner;
import java.util.Arrays;

public class Juego {

    // Arreglo polimorfico - Puede contener Superheroes y Villanos
    private static Personaje[] personajes = new Personaje[0];
    private static String jugador;
    private static int contrasenia;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== JUEGO DE SUPERHEROES Y VILLANOS ===");
        System.out.println("=======================================\n");

        // Registro del jugador
        System.out.println("Ingresa tu nombre de jugador");
        System.out.print("-> ");
        jugador = sc.nextLine();

        System.out.println("Define una contrasenia");
        System.out.print("-> ");
        contrasenia = sc.nextInt();
        sc.nextLine();

        System.out.println("\nBienvenido al menu, " + jugador);
        System.out.println("=======================================\n");

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            System.out.println("---------------------------------------\n");

            switch (opcion) {
                case 1:
                    agregarPersonaje();
                    break;
                case 2:
                    mostrarPersonajes();
                    break;
                case 3:
                    usarPoder();
                    break;
                case 4:
                    recargarEnergia();
                    break;
                case 5:
                    combateAleatorio();
                    break;
                case 6:
                    System.out.println("Gracias por jugar, " + jugador);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            System.out.println("---------------------------------------\n");

        } while (opcion != 6);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1.- Agregar personaje (Heroe o Villano)");
        System.out.println("2.- Mostrar personajes");
        System.out.println("3.- Usar poder");
        System.out.println("4.- Recargar energia");
        System.out.println("5.- Combate aleatorio");
        System.out.println("6.- Salir");
        System.out.print("-> ");
    }

    private static void agregarPersonaje() {
        System.out.println("=== AGREGAR PERSONAJE ===");

        System.out.println("Que tipo de personaje quieres crear?");
        System.out.println("1.- Superheroe");
        System.out.println("2.- Villano");
        System.out.print("-> ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nombre del personaje:");
        System.out.print("-> ");
        String nombre = sc.nextLine();

        // 🔴 CORREGIDO (era String)
        System.out.println("Nivel de poder:");
        System.out.print("-> ");
        String poder = sc.nextLine();

        System.out.println("Identidad Secreta:");
        System.out.print("-> ");
        String identidad = sc.nextLine();

        System.out.println("Ciudad:");
        System.out.print("-> ");
        String ciudad = sc.nextLine();

        System.out.println("Nivel de energia (maximo 100):");
        System.out.print("-> ");
        int energia = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {

            Superheroe nuevo = new Superheroe(nombre, identidad, ciudad, poder, energia);

            personajes = Arrays.copyOf(personajes, personajes.length + 1);
            personajes[personajes.length - 1] = nuevo;

            System.out.println("Superheroe agregado correctamente");

        } else if (tipo == 2) {

            System.out.println("Cual es su plan malvado?");
            System.out.print("-> ");
            String plan = sc.nextLine();

            Villano nuevo = new Villano(nombre, identidad, ciudad, poder, energia, plan);

            personajes = Arrays.copyOf(personajes, personajes.length + 1);
            personajes[personajes.length - 1] = nuevo;

            System.out.println("Villano agregado correctamente");

        } else {
            System.out.println("Tipo de personaje no valido");
        }
    }

    private static void mostrarPersonajes() {

        if (personajes.length == 0) {
            System.out.println("No hay personajes registrados");
            return;
        }

        System.out.println("=== PERSONAJES REGISTRADOS ===\n");

        for (int i = 0; i < personajes.length; i++) {
            System.out.println("Personaje " + (i + 1) + ":");
            System.out.println("Tipo: " + personajes[i].getTipo());
            personajes[i].mostrarInfo();
            System.out.println();
        }
    }

    private static void usarPoder() {

        if (personajes.length == 0) {
            System.out.println("No hay personajes registrados");
            return;
        }

        System.out.println("=== USAR PODER ===");

        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ".- " + personajes[i].getNombre());
        }

        System.out.print("-> ");
        int seleccion = sc.nextInt();
        sc.nextLine();

        if (seleccion >= 1 && seleccion <= personajes.length) {

            Personaje elegido = personajes[seleccion - 1];

            System.out.println("Nivel de poder:");
            int nivel = sc.nextInt();
            sc.nextLine();

            if (nivel == 1) {
                elegido.usarPoder();
            } else if (nivel == 2) {
                if (elegido instanceof Superheroe) {
                    ((Superheroe) elegido).usarPoder(50);
                } else {
                    ((Villano) elegido).usarPoder(50);
                }
            } else if (nivel == 3) {
                System.out.println("Frase:");
                String frase = sc.nextLine();

                if (elegido instanceof Superheroe) {
                    ((Superheroe) elegido).usarPoder(100, frase);
                } else {
                    ((Villano) elegido).usarPoder(100, frase);
                }
            }

            elegido.decirFrase();
        }
    }

    private static void recargarEnergia() {

        if (personajes.length == 0) {
            System.out.println("No hay personajes registrados");
            return;
        }

        for (int i = 0; i < personajes.length; i++) {
            System.out.println((i + 1) + ".- " + personajes[i].getNombre());
        }

        int seleccion = sc.nextInt();
        sc.nextLine();

        System.out.println("Energia a recargar:");
        int energia = sc.nextInt();
        sc.nextLine();

        personajes[seleccion - 1].recargarEnergia(energia);
    }

    private static void combateAleatorio() {

        if (personajes.length < 2) {
            System.out.println("Necesitas al menos 2 personajes");
            return;
        }

        int i1 = (int)(Math.random() * personajes.length);
        int i2;

        do {
            i2 = (int)(Math.random() * personajes.length);
        } while (i1 == i2);

        Personaje p1 = personajes[i1];
        Personaje p2 = personajes[i2];

        System.out.println(p1.getNombre() + " VS " + p2.getNombre());

        p1.usarPoder();
        p2.usarPoder();
    }
}
