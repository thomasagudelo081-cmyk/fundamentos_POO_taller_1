/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author estuam
 */
public class Videojuego {
/**
 * Clase para modelar videojuegos de una tienda o biblioteca digital.
 * 
 * @author Thomas Agudelo
 * @version 1.0
 */

    // Atributos
    String titulo;         // Nombre del juego
    String genero;         // Categoría (RPG, Shooters, etc.)
    double precio;         // Precio comercial
    boolean enEjecucion;   // Estado de si está abierto o no

    /**
     * Imprime la información del juego en pantalla.
     */
    void mostrarFicha() {
        System.out.println("--- Ficha del Juego ---");
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Precio: $" + precio);
        System.out.println("Estado: " + (enEjecucion ? "Corriendo..." : "Cerrado"));
    }

    /**
     * Cambia el estado a abierto y muestra mensaje.
     */
    void iniciarJuego() {
        enEjecucion = true;
        System.out.println("Cargando " + titulo + "... ¡A jugar!");
    }

    /**
     * Main de prueba para la clase Videojuego.
     */
    public static void main(String[] args) {
        Videojuego j1 = new Videojuego();
        j1.titulo = "Elden Ring";
        j1.genero = "Action RPG";
        j1.precio = 59.99;

        Videojuego j2 = new Videojuego();
        j2.titulo = "Valorant";
        j2.genero = "Tactical Shooter";
        j2.precio = 0.00;

        // Pruebas
        j1.mostrarFicha();
        j1.iniciarJuego();
        System.out.println();

        j2.mostrarFicha();
    }
}

