import java.util.Scanner;

public class ProcesamientoNumerosReales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        double sum = 0;
        double max, min, prom;
        int count = 0;

        System.out.print("Ingrese un numero: ");
        num = sc.nextDouble();

        if (num < 0) {
            System.out.println("NO SE INGRESARON NÚMEROS");
        } else {

            max = num;
            min = num;

            while (num >= 0) {
                sum += num;
                count++;

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }

                System.out.print("Ingrese un numero: ");
                num = sc.nextDouble();
            }

            prom = sum / count;

            System.out.println("Suma total: " + sum);
            System.out.println("Promedio: " + prom);
            System.out.println("Maximo: " + max);
            System.out.println("Minimo: " + min);
        }

        sc.close();
    }
}