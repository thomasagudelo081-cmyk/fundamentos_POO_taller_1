/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author estuam
 */
public class Cancion {
        /**
 * Clase que representa una canción y sus acciones básicas.
 * Trabajo del Taller 2 de Programación.
 * 
 * @author Thomas Agudelo
 * @version 1.0
 */

    // Atributos
    String titulo;    // Nombre de la rola
    String artista;   // Cantante o banda
    int duracion;     // Duración total en segundos

    /**
     * Muestra en consola todos los datos guardados de la canción.
     */
    void mostrarInformacion() {
        System.out.println("=== Detalle de la Canción ===");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion + " segundos");
    }

    /**
     * Imprime un mensaje simulando que la canción se está reproduciendo.
     */
    void reproducir() {
        System.out.println("Sonando ahora: " + titulo + " - " + artista);
    }

    // --- RETOS OPCIONALES (PARTE C) ---

    /**
     * Reproduce la canción desde un segundo específico.
     * 
     * @param segundo Segundo de inicio para la reproducción
     */
    void reproducirDesde(int segundo) {
        System.out.println("Adelantando '" + titulo + "' al segundo " + segundo + "...");
    }

    /**
     * Pasa la duración de segundos a minutos.
     * 
     * @return Duración en minutos como un valor double
     */
    double obtenerDuracionEnMinutos() {
        return duracion / 60.0;
    }

    /**
     * Método main para probar que los objetos funcionen de forma independiente.
     */
    public static void main(String[] args) {
        // Primera canción
        Cancion c1 = new Cancion();
        c1.titulo = "Starboy";
        c1.artista = "The Weeknd";
        c1.duracion = 230;

        // Segunda canción
        Cancion c2 = new Cancion();
        c2.titulo = "Feather";
        c2.artista = "Sabrina Carpenter";
        c2.duracion = 185;

        // Probamos los métodos de la primera
        c1.mostrarInformacion();
        c1.reproducir();
        c1.reproducirDesde(45);
        System.out.println("Duración en mins: " + String.format("%.2f", c1.obtenerDuracionEnMinutos()) + " min\n");

        // Probamos la segunda para comprobar independencia
        c2.mostrarInformacion();
        c2.reproducir();
    }
}

