import java.util.Scanner;

public class RetoTres {
    public static void main(String[] args) {
        int ganador = (int) (Math.random() * (10)) + 1;
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Vas a adivinar un número del 1 al 10: Escribe el número: ");
        do {
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 10) {

                if (ganador == numero) {
                    System.out.println("Felicidades!, adivinaste el número ganador: " + ganador);
                } else if (numero > ganador) {
                    System.out.println("El número que elegiste es mayor al ganador, sigue intentando");
                } else if (numero < ganador) {
                    System.out.println("El número que elegiste es menor al ganador, sigue intentando");
                }
            } else {
                System.out.println("Participación no válida, ingresa un número del 1 al 10");
            }
        } while (ganador != numero);
    }
}
