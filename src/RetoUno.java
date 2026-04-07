import java.util.Scanner;

public class RetoUno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Ingrese el número de participantes, sólo uno será el ganador, mucha suerte: ");
        int participantes = input.nextInt();

        if (participantes <= 0) {
            System.out.println("El número de participantes debe ser mayor a cero.");
        } else {
            int ganador = (int) (Math.random() * (participantes)) + 1;
            System.out.println("El ganador es el participante número: " + ganador + ". Felicidades!!");
        }
    }
}
