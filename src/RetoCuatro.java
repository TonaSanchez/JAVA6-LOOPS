import java.util.Scanner;

public class RetoCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad del cliente: ");
        int edadCliente = input.nextInt();
        System.out.println("Ingrese el sueldo mensual del cliente: ");
        int ingresoMensual = input.nextInt();
        double cobro = 0;
        int prima = 0;


        if (edadCliente >= 70) {
            prima = 500;

        } else if (edadCliente >= 50 && edadCliente <= 69) {
            prima = 400;

        } else if (edadCliente >= 30 && edadCliente <= 49) {
            prima = 250;

        } else if (edadCliente <= 29) {
            prima = 100;
        }

        if (ingresoMensual >= 300) {
            cobro = prima * 1.10;
        } else {
            cobro = prima * 1.05;
        }

        System.out.println("La prima que debes pagar con base en tu sueldo es: " + cobro);

    }
}

