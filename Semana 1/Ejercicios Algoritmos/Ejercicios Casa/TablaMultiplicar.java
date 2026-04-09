import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese el valor N para la tabla: ");
        n = sc.nextInt();

        // Encabezado de columnas
        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        // Tabla de multiplicar
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i); // Encabezado de fila
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}