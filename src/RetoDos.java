import java.util.Scanner;

public class RetoDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra o frase");
        String palabra = sc.nextLine();

        String palMin = palabra.toLowerCase();
        String palMinNo = palMin.replaceAll("\\s", "");

        String palEvaluada = new StringBuilder(palMinNo).reverse().toString();

        if (palMinNo.equals(palEvaluada)) {
            System.out.println("La palabra o frase es un palíndromo");
        } else {
            System.out.println("La palabra o frase no es un palíndromo");
        }
    }
}
