import java.util.Scanner;

public class ProcesarArticulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String code = "";
        int count = 0;
        double price = 0.0;
        int countA = 0, countB = 0;
        double impA = 0, impB = 0;

        // Lectura inicial del código
        System.out.print("Ingrese codigo de articulo (A, B o X para terminar): ");
        code = sc.next().toUpperCase();

        while (!code.equals("X")) {

            if (code.equals("A")) {
                System.out.print("Ingrese cantidad: ");
                count = sc.nextInt();

                System.out.print("Ingrese precio: ");
                price = sc.nextDouble();

                countA += count;
                impA += price * count;

            } else if (code.equals("B")) {
                System.out.print("Ingrese cantidad: ");
                count = sc.nextInt();

                System.out.print("Ingrese precio: ");
                price = sc.nextDouble();

                countB += count;
                impB += price * count;
            }

            // Leer siguiente código
            System.out.print("Ingrese codigo de articulo (A, B o X para terminar): ");
            code = sc.next().toUpperCase();
        }

        // Resultados
        System.out.println("Resultados:");
        System.out.println("Total articulos A: " + countA);
        System.out.println("Importe total A: " + impA);
        System.out.println("Total articulos B: " + countB);
        System.out.println("Importe total B: " + impB);

        sc.close();
    }
}