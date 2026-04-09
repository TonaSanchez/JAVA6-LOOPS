import java.util.Scanner;

public class RetoCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite su usuario: ");
        String usuario = input.nextLine();
        System.out.print("Digite su contraseña: ");
        String contraseña = input.nextLine();

//Falta implementar validaciones // cuando un usuario por ejemplo quiere retirar dinero y este ya es cero.

        int opcion;
        double saldo = 10000;

        do {
            System.out.println("=============");
            System.out.println("Bienvenido " + usuario + "\nLe ofrecemos los siguientes servicios:");
            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Ingresar saldo");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Consultar últimos movimientos");
            System.out.println("5.- Convertir divisas");
            System.out.println("6.- Salir, presione 0");
            opcion = input.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Tu saldo es de: " + saldo);
                    break;

                case 2:
                    System.out.println("¿Cuánto deseas ingresar?");
                    double ingresa = input.nextDouble();
                    saldo = saldo + ingresa;
                    System.out.println("Tu saldo ahora es de: " + saldo);
                    break;


                case 3:
                    System.out.println("¿Cuánto vas a retirar?");
                    double retira = input.nextDouble();
                    saldo = saldo - retira;
                    System.out.println("Tu saldo ahora es de: " + saldo);
                    break;


                case 4:
                    System.out.println("Tus últimos movimientos son: ");
                    System.out.println("Imprime el array donde se miran todos los movimientos");
                    break;

                case 5:
                    String a = "Ingrese el dinero a convertir";
                    System.out.println("¿Qué conversión necesitas?");
                    System.out.println("Ingresa una opción");
                    System.out.println("1.- MXN a USD");
                    System.out.println("2.- MXN a EUR");
                    System.out.println("3.- USD a EUR");
                    int conversionOption = input.nextInt();
                    double moneda = 0;
                    double conversion = 0;

                    switch (conversionOption) {
                        case 1:
                            System.out.println(a);
                            moneda = input.nextDouble();
                            conversion = moneda * 0.057;

                            System.out.println("Sus " + moneda + " MXN " + " ahora son " + conversion + " USD.");
                            break;

                        case 2:
                            System.out.println(a);
                            moneda = input.nextDouble();
                            conversion = moneda * 0.049;

                            System.out.println("Sus " + moneda + " MXN " + " ahora son " + conversion + " EUR.");
                            break;

                        case 3:
                            System.out.println(a);
                            moneda = input.nextDouble();
                            conversion = moneda * 0.86;

                            System.out.println("Sus " + moneda + " USD " + " ahora son " + conversion + " EUR.");
                            break;

                    } break;

                case 0:
                    System.out.println("Gracias por usar nuestro servicio.");
                    break;


            }


        } while (opcion != 0);


    }
}
