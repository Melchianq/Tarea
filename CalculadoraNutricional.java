import java.util.*;

public class CalculadoraNutricional {

    // Valores nutricionales por gramo 
    static final double CALORIAS_POR_GRAMO = 1.0; // kcal
    static final double PROTEINA_POR_GRAMO = 1.0; // g
    static final double GRASA_POR_GRAMO = 1.0;    // g
    static final double CARBO_POR_GRAMO = 1.0;    // g

    static double totalCalorias = 0;
    static double totalProteinas = 0;
    static double totalGrasas = 0;
    static double totalCarbohidratos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora de Nutrientes ===");

        while (true) {
            System.out.print("Ingrese cantidad en gramos (0 para terminar): ");
            double gramos = scanner.nextDouble();
            if (gramos == 0) break;

            System.out.print("Ingrese tipo (caloria, proteina, grasa, carbohidrato): ");
            String tipo = scanner.next().toLowerCase();

            switch (tipo) {
                case "caloria":
                    totalCalorias += gramos * CALORIAS_POR_GRAMO;
                    break;
                case "proteina":
                    totalProteinas += gramos * PROTEINA_POR_GRAMO;
                    break;
                case "grasa":
                    totalGrasas += gramos * GRASA_POR_GRAMO;
                    break;
                case "carbohidrato":
                    totalCarbohidratos += gramos * CARBO_POR_GRAMO;
                    break;
                default:
                    System.out.println("Tipo no válido.");
            }
        }

        // Mostrar resultados
        System.out.println("\n--- Resultado Nutricional ---");
        System.out.println("Total Calorías: " + totalCalorias + " kcal");
        System.out.println("Total Proteínas: " + totalProteinas + " g");
        System.out.println("Total Grasas: " + totalGrasas + " g");
        System.out.println("Total Carbohidratos: " + totalCarbohidratos + " g");

        // Validación de si es aceptable o no 
        boolean aceptable =
            totalCalorias >= 500 && totalCalorias <= 800 &&
            totalProteinas >= 50 && totalProteinas <= 70 &&
            totalGrasas >= 20 && totalGrasas <= 35 &&
            totalCarbohidratos >= 150 && totalCarbohidratos <= 300;

        System.out.println("Valor nutricional: " + (aceptable ? "ACEPTABLE" : "NO ACEPTABLE"));
    }
}
