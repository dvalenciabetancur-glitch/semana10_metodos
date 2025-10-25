package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        int cantidadProductos = scanner.nextInt();
        System.out.println("Ingrese el precio por producto");
        double precioProducto = scanner.nextDouble();
        double totalSinDescuento = cantidadProductos * precioProducto;
        double descuento = 0.0;
        double totalConDescuento = 0.0;
        double descuentoAdicional = 0.0;
        if (cantidadProductos >= 5 && cantidadProductos < 10) {
            descuento = 0.10;
        } else if (cantidadProductos >= 10 && cantidadProductos < 20) {
            descuento = 0.15;
        } else if (cantidadProductos >= 20) {
            descuento = 0.20;
        }
        totalConDescuento = totalSinDescuento * (1 - descuento);
        if (totalConDescuento > 100000) {
            descuentoAdicional = totalConDescuento * 0.05;
        }
        if (descuentoAdicional > 0) {
            totalConDescuento -= descuentoAdicional;
            System.out.println("El valor total de la compra con descuento es: " + totalConDescuento);
        } else {
        }
        System.out.println("El valor total de la compra es: " + totalSinDescuento);
    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        boolean creditoViable = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuánto es el ingreso mensual?");
        double ingresoMensual = scanner.nextDouble();
        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el gasto mensual");
        int gastoMensual = scanner.nextInt();

        if (ingresoMensual >= 2000000 && edad >= 18 && edad <= 65 && gastoMensual < (ingresoMensual * 0.7)) {
            creditoViable = true;
            System.out.println("El crédito es viable");
        } else {
            System.out.println("El crédito no es viable de acuerdo con las políticas del banco");
        }

    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        final int tiempoBus = 20;
        final int tiempoMetro = 15;
        final int tiempoCaminata = 10;
        final double incrementoTrafico = 0.5;
        final double incrementoLluvia = 1.0;
        double tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminata;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Hay tráfico pesado? (S/N)");
        String traficoPesado = scanner.nextLine();
        boolean hayTrafico = traficoPesado.equalsIgnoreCase("S");
        System.out.println("¿Hay lluvia? (S/N)");
        String lluvia = scanner.nextLine();
        boolean estaLloviendo = lluvia.equalsIgnoreCase("S");

        if (hayTrafico && estaLloviendo) {
            tiempoTotal = tiempoBus * (1 + incrementoTrafico) + tiempoMetro + tiempoCaminata * (1 + incrementoLluvia);
        } else if (hayTrafico) {
            tiempoTotal = tiempoBus * (1 + incrementoTrafico) + tiempoMetro + tiempoCaminata;
        } else if (estaLloviendo) {
            tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminata * (1 + incrementoLluvia);
        } else {
            tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminata;

        }
        System.out.println("El tiempo que tarda es: " + tiempoTotal + " minutos.");
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        Scanner scanner = new Scanner(System.in);
        String[] vuelos = { "VUELO1", "VUELO2", "VUELO3", "VUELO4", "VUELO5" };

        int[] retrasos = { 0, 10, 20, 5, 25 };

        boolean[] cancelado = { false, false, false, true, false };

        System.out.println("¿Hay buen clima? (S/N)");
        String estadoClima = scanner.nextLine();
        boolean malClima = estadoClima.equalsIgnoreCase("N");

        if (malClima) {
            System.out.println("Todos los vuelos se retrasan 30 minutos.\n");
        } else {
            System.out.println("Hoy hace un buen clima\n");
        }

        for (int i = 0; i < vuelos.length; i++) {

            int retraso = retrasos[i];

            if (malClima) {
                retraso += 30;
            }

            System.out.println(vuelos[i] + ":");

            if (cancelado[i]) {
                System.out.println("Estado: CANCELADO");
            } else if (retraso > 15) {
                System.out.println("Estado: RETRASADO (" + retraso + " min)");
            } else {
                System.out.println("Estado: A TIEMPO");
            }

            System.out.println();
        }
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        Scanner scanner = new Scanner(System.in);

        int horasDisponibles = 8;
        int minutosDisponibles = horasDisponibles * 60;
        int minutosUsados = 0;
        int tiempoCentro = 30;
        int tiempoPeriferia = 45;
        int tiempoRural = 60;
        int entregasCentro = 0;
        int entregasPeriferia = 0;
        int entregasRural = 0;
        int entregasTotales = 0;

        System.out.print("¿Cuántas entregas tienes en la zona CENTRO? ");
        int pedidosCentro = scanner.nextInt();

        System.out.print("¿Cuántas entregas tienes en la zona PERIFERIA? ");
        int pedidosPeriferia = scanner.nextInt();

        System.out.print("¿Cuántas entregas tienes en la zona RURAL? ");
        int pedidosRural = scanner.nextInt();

        int pedidosTotales = pedidosCentro + pedidosPeriferia + pedidosRural;

        System.out.println("--- ZONA CENTRO ---");
        int i = 1;
        while (i <= pedidosCentro) {
            if (minutosUsados + tiempoCentro <= minutosDisponibles) {
                minutosUsados = minutosUsados + tiempoCentro;
                entregasCentro = entregasCentro + 1;
                entregasTotales = entregasTotales + 1;
                System.out.println("Entrega #" + entregasTotales + " - Centro (30 min) - Tiempo acumulado: "
                        + minutosUsados + " min");
            } else {
                System.out.println("No hay tiempo para mas entregas en Centro");
                break;
            }
            i = i + 1;
        }

        if (entregasCentro > 0) {
            System.out.println("Total entregas en Centro: " + entregasCentro);
        } else {
            System.out.println("No se pudieron hacer entregas en Centro");
        }

        System.out.println("--- ZONA PERIFERIA ---");
        int j = 1;
        while (j <= pedidosPeriferia) {
            if (minutosUsados + tiempoPeriferia <= minutosDisponibles) {
                minutosUsados = minutosUsados + tiempoPeriferia;
                entregasPeriferia = entregasPeriferia + 1;
                entregasTotales = entregasTotales + 1;
                System.out.println("Entrega #" + entregasTotales + " - Periferia (45 min) - Tiempo acumulado: "
                        + minutosUsados + " min");
            } else {
                System.out.println("No hay tiempo para mas entregas en Periferia");
                break;
            }
            j = j + 1;
        }

        if (entregasPeriferia > 0) {
            System.out.println("Total entregas en Periferia: " + entregasPeriferia);
        } else {
            System.out.println("No se pudieron hacer entregas en Periferia");
        }

        System.out.println("--- ZONA RURAL ---");
        int k = 1;
        while (k <= pedidosRural) {
            if (minutosUsados + tiempoRural <= minutosDisponibles) {
                minutosUsados = minutosUsados + tiempoRural;
                entregasRural = entregasRural + 1;
                entregasTotales = entregasTotales + 1;
                System.out.println("Entrega #" + entregasTotales + " - Rural (60 min) - Tiempo acumulado: "
                        + minutosUsados + " min");
            } else {
                System.out.println("No hay tiempo para mas entregas en Rural");
                break;
            }
            k = k + 1;
        }

        if (entregasRural > 0) {
            System.out.println("Total entregas en Rural: " + entregasRural);
        } else {
            System.out.println("No se pudieron hacer entregas en Rural");
        }

        int entregasNoCentro = pedidosCentro - entregasCentro;
        int entregasNoPeriferia = pedidosPeriferia - entregasPeriferia;
        int entregasNoRural = pedidosRural - entregasRural;
        int entregasNoRealizadas = entregasNoCentro + entregasNoPeriferia + entregasNoRural;

        int minutosRestantes = minutosDisponibles - minutosUsados;
        int horasUsadas = minutosUsados / 60;
        int minutosExtra = minutosUsados % 60;

        System.out.println("  Centro: " + entregasCentro + " de " + pedidosCentro);
        System.out.println("  Periferia: " + entregasPeriferia + " de " + pedidosPeriferia);
        System.out.println("  Rural: " + entregasRural + " de " + pedidosRural);
        System.out.println();
        System.out.println("  TOTAL: " + entregasTotales + " de " + pedidosTotales + " entregas");
        System.out.println();

        if (entregasNoRealizadas > 0) {
            System.out.println("ENTREGAS PENDIENTES: " + entregasNoRealizadas);
            System.out.println("  (Quedaron para mañana)");
            System.out.println();
        }

        System.out.println("TIEMPO UTILIZADO:");
        System.out.println("  " + horasUsadas + " horas y " + minutosExtra + " minutos");
        System.out.println("  (" + minutosUsados + " minutos en total)");
        System.out.println();

        System.out.println("TIEMPO RESTANTE:");
        System.out.println("  " + minutosRestantes + " minutos");
        System.out.println();

        if (minutosRestantes >= 60) {
            System.out.println("RECOMENDACION:");
            System.out.println("  ¡Tienes tiempo para 1 entrega rural mas!");
        } else if (minutosRestantes >= 45) {
            System.out.println("RECOMENDACION:");
            System.out.println("  ¡Tienes tiempo para 1 entrega en periferia mas!");
        } else if (minutosRestantes >= 30) {
            System.out.println("RECOMENDACION:");
            System.out.println("  ¡Tienes tiempo para 1 entrega en centro mas!");
        } else {
            System.out.println("RECOMENDACION:");
            System.out.println("  Buen trabajo! Has optimizado bien tu tiempo.");
        }

    }


    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int cardio = 10;
        int pesas = 8;
        int yoga = 5;
        int tiempoCardio = 30;
        int tiempoPesas = 40;
        int tiempoYoga = 20;
        int calCardio = cardio * tiempoCardio;
        int calPesas = pesas * tiempoPesas;
        int calYoga = yoga * tiempoYoga;
        int totalCalorias = calCardio + calPesas + calYoga;
        int puntos = 0;
        if (totalCalorias > 500) {
            puntos = 50;
        }

        System.out.println("Tiempo de ejercicio:");
        System.out.println("- Cardio: " + tiempoCardio + " min");
        System.out.println("- Pesas: " + tiempoPesas + " min");
        System.out.println("- Yoga: " + tiempoYoga + " min\n");

        System.out.println("Calorías quemadas:");
        System.out.println("- Cardio: " + calCardio + " cal");
        System.out.println("- Pesas: " + calPesas + " cal");
        System.out.println("- Yoga: " + calYoga + " cal\n");

        System.out.println("Total de calorías quemadas: " + totalCalorias + " cal");

        if (puntos > 0) {
            System.out.println("Has superado las 500 calorías y ganaste " + puntos + " puntos de bono.");
        } else {
            System.out.println("Cambia la rutina para quemar más de 500 calorías y ganar puntos de bono.");
        }
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        double[] temperatura = {37.5, 39.0, 38.7, 36.8, 37.9};
        int[] presionS = {120, 150, 135, 145, 130};
        int[] presionD = {80, 95, 85, 92, 88};
        int[] dolor = {5, 9, 7, 8, 4};

        for (int i = 0; i < 5; i++) {
            System.out.println("Paciente " + (i + 1) + ":");

            if (temperatura[i] > 38.5 || presionS[i] > 140 || presionD[i] > 90 || dolor[i] >= 8) {
                System.out.println("Clasificación: URGENTE");
            } else if (dolor[i] >= 6) {
                System.out.println("Clasificación: PRIORITARIO");
            } else {
                System.out.println("Clasificación: NORMAL");
            }
    }

     }   

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        double[] parciales = {3.8, 4.5, 3.0};
        double[] proyecto = {4.0, 3.2, 2.8};
        double[] participacion = {4.5, 3.5, 3.2};

        for (int i = 0; i < 3; i++) {
            double promedio = (parciales[i] * 0.3) + (proyecto[i] * 0.4) + (participacion[i] * 0.3);

            System.out.println("Estudiante " + (i + 1) + ": Promedio = " + promedio);

            if (promedio >= 4.0) {
                System.out.println("Resultado: APROBADO \n");
            } else if (promedio >= 3.5) {
                System.out.println("Resultado: SUPLETORIO \n");
            } else {
                System.out.println("Resultado: REPROBADO \n");
            }
        }
    }
    

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        int[] humedad = {25, 40, 55, 28, 45, 60, 35};
        int[] temperatura = {22, 27, 24, 30, 20, 26, 23};
        boolean[] lluvia = {false, false, true, false, false, false, true};

        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i + 1) + ":");

            if (lluvia[i]) {
                System.out.println("Riego desactivado por lluvia en las últimas 24 horas \n");
            } else if (humedad[i] < 30) {
                System.out.println("Riego activado por 60 minutos \n");
            } else if (temperatura[i] > 25 && humedad[i] < 50) {
                System.out.println("Riego activado por 30 minutos \n");
            } else {
                System.out.println("No se requiere riego \n");
            }
        }
    }
    

}
