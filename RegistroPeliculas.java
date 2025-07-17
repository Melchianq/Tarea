import java.util.*;

class Pelicula {
    private String titulo;
    private int anio;
    private String genero;

    public Pelicula(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public String toString() {
        return "Título: " + titulo + ", Año: " + anio + ", Género: " + genero;
    }
}

public class RegistroPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pelicula> peliculas = new ArrayList<>();

        System.out.println("=== Registro de Películas ===");

        while (true) {
            System.out.print("Ingrese título de la película (o 'fin' para terminar): ");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("fin")) break;

            System.out.print("Ingrese año de lanzamiento: ");
            int anio = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese género: ");
            String genero = scanner.nextLine();

            peliculas.add(new Pelicula(titulo, anio, genero));
            System.out.println("Película agregada.\n");
        }

        // Ordenar por año de lanzamiento (ascendente)
        peliculas.sort(Comparator.comparingInt(Pelicula::getAnio));

        // Mostrar resultados
        System.out.println("\n--- Lista de Películas Ordenadas por Año ---");
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }
}
