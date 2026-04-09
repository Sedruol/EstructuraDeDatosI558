import java.util.Scanner;

public class RegistroTemperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Variables
        int days = 0;
        int errors = 0;
        double tempMax, tempMin;
        double sumMax = 0;
        double sumMin = 0;
        double promMax, promMin, percErrors;

        // Lectura de temperaturas
        System.out.print("Ingrese temperatura maxima: ");
        tempMax = sc.nextDouble();

        System.out.print("Ingrese temperatura minima: ");
        tempMin = sc.nextDouble();

        while (tempMax != 0 || tempMin != 0) {

            days++;

            if (tempMax == 9 || tempMin == 9) {
                errors++;
            }

            sumMax += tempMax;
            sumMin += tempMin;

            // Lectura de temperaturas
            System.out.print("Ingrese temperatura maxima: ");
            tempMax = sc.nextDouble();

            System.out.print("Ingrese temperatura minima: ");
            tempMin = sc.nextDouble();
        }

        if (days > 0) {
            promMax = sumMax / days;
            promMin = sumMin / days;
            percErrors = (errors * 100.0) / days;
        } else {
            promMax = 0;
            promMin = 0;
            percErrors = 0;
        }

        // Resultados
        System.out.println("Resultados:");
        System.out.println("Total de dias registrados: " + days);
        System.out.println("Promedio temperatura maxima: " + promMax);
        System.out.println("Promedio temperatura minima: " + promMin);
        System.out.println("Errores detectados: " + errors);
        System.out.println("Porcentaje de errores: " + percErrors + "%");

        sc.close();
    }
}