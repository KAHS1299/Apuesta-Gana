import java.util.Random;
import java.util.Scanner;
//Autor;Karen Audrey Hoya Salinas
//Apuesta & Gana
//22-08-2024

public class Apuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la cantidad de dinero con el que va a iniciar: ");
        double dinero = scanner.nextDouble();

        while (true) {
            System.out.println("Apuestas con: $" + dinero);
            System.out.println("Presiona ENTER para jugar");
            scanner.nextLine();
            scanner.nextLine();

            int numeroAleatorio = random.nextInt(3) + 1;
            System.out.println("El numero es: " + numeroAleatorio);
            switch (numeroAleatorio) {
                case 1:
                    dinero *= 2;
                    System.out.println("Ganaste, ahora tienes: $" + dinero);
                    break;
                case 2:
                    dinero /= 2;
                    System.out.println("Perdiste la mitad, ahora tienes: $" + dinero);
                    System.out.println("¿Quieres seguir jugando? si o no");
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("no")) {
                        System.out.println("Gracias por jugar!!.Has terminado con: $" + dinero);
                        return;
                    }
                    break;
                case 3:
                    System.out.println("¡Perdiste! Gracias por participar");
                    return;

            }
        }

    }
}
