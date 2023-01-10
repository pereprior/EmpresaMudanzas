/*
* @author Pere Prior
*/

import java.awt.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner inputValue;
    public static int eleccion;

    public static void main(String[] args) {

        menu();
    }

    public static String leerCadena(String mensaje) throws InputMismatchException {
        System.out.println(mensaje);

        inputValue = new Scanner(System.in);

        return inputValue.nextLine();

    }

    public static int leerEntero(String mensaje) {
        inputValue = new Scanner(System.in);
        System.out.println(mensaje);
        try {

            return inputValue.nextInt();

        } catch (InputMismatchException e) {

            return -1;
        }

    }

    public static void crearBultos() {

        Bultos hola =new Bultos();

        eleccion = leerEntero("Introduce su numero de identificacion:");
        hola.setId(eleccion);

        eleccion = leerEntero("Introduce su volumen ()");
        hola.setVolumen(eleccion);

        eleccion = leerEntero("Introduce su peso (kg):");
        hola.setPeso(eleccion);

        String esFragil = leerCadena("Es un bulto fragil? (s/n)");
        if (esFragil == "s") {
            hola.setEsFragil();
        }

    }


    //Menus

    public static void menu() {

        do {

            inputValue = new Scanner(System.in);
            eleccion = leerEntero("<1. Gestion de camiones> <3. Proforma de mudanza> <0. Salir>");

            switch (eleccion) {

                case 1:
                    menuBultos();
                    break;

                case 2:
                    menuCamiones();
                    break;

                case 3:
                    System.out.println(Math.random()*10000);
                    break;

                default:
                    System.out.println("Opcion incorrecta!");
                    break;

                case 0:
                    System.out.println("Finalizando Programa...");
                    break;
            }

        } while (eleccion != 0);

    }

    public static void menuBultos() {

        do {

            inputValue = new Scanner(System.in);
            eleccion = leerEntero("<1. Crear nuevo bulto> <2. Modificar bulto> <3. Eliminar bulto> <4. Visualizar bultos> <0. Volver al inicio>");

            switch (eleccion) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opcion incorrecta!");
                    break;

                case 0:
                    break;
            }

        } while (eleccion != 0);

        menu();

    }

    public static void menuCamiones() {

        do {

            inputValue = new Scanner(System.in);
            eleccion = leerEntero("<1. Añadir nuevo camion> <2. Modificar datos camion> <3. Eliminar camion> <4. Visualizar camiones> <0. Volver al menu>");

            switch (eleccion) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opcion incorrecta!");
                    break;

                case 0:
                    break;
            }

        } while (eleccion != 0);

        menu();

    }

}