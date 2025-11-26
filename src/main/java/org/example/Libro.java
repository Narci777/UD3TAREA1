package org.example;

public class Libro {

    // ---------- ENUNCIADO: Atributos ----------
    // Atributos privados → Datos del libro
    private String titulo;        // Título del libro
    private String autor;         // Autor del libro
    private int numeroPaginas;    // Cantidad de páginas
    private String ISBN;          // Código identificador del libro


    // ---------- ENUNCIADO: Constructor por defecto ----------
    // Crea un libro sin datos
    public Libro() {
        this.titulo = "";         // Título vacío
        this.autor = "";          // Autor vacío
        this.numeroPaginas = 0;   // Páginas = 0
        this.ISBN = "";           // ISBN vacío
    }


    // ---------- ENUNCIADO: Constructor con todos los atributos ----------
    // Crea un libro con toda la información
    public Libro(String titulo, String autor, int numeroPaginas, String ISBN) {
        this.titulo = titulo;             // Guardar título
        this.autor = autor;               // Guardar autor
        this.numeroPaginas = numeroPaginas; // Guardar páginas
        this.ISBN = ISBN;                 // Guardar ISBN
    }


    // ---------- ENUNCIADO: Métodos getTitulo() y getAutor() ----------
    // Devuelve el título del libro
    public String getTitulo() {
        return this.titulo;
    }

    // Devuelve el autor del libro
    public String getAutor() {
        return this.autor;
    }


    // ---------- ENUNCIADO: Método mostrarInformacion() ----------
    // Muestra por pantalla todos los datos del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);              // Mostrar título
        System.out.println("Autor: " + this.autor);                // Mostrar autor
        System.out.println("Páginas: " + this.numeroPaginas);      // Mostrar páginas
        System.out.println("ISBN: " + this.ISBN);                  // Mostrar ISBN
        System.out.println("-----------------------------");     // Separador
    }


    // ---------- ENUNCIADO: Método esLibroLargo() ----------
    // Devuelve true si el libro tiene más de 300 páginas
    public boolean esLibroLargo() {
        return this.numeroPaginas > 300;  // Comprobación
    }
}

