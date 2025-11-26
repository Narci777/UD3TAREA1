package org.example;

public class Main {
    public static void main(String[] args) {

                // ---------- ENUNCIADO: Crear 3 libros diferentes ----------
                // Crear tres objetos libro
                Libro libro1 = new Libro("It", "Stephen King", 500, "12345");
                Libro libro2 = new Libro("El Principito", "Saint-Exupéry", 120, "22222");
                Libro libro3 = new Libro("La Sombra del Viento", "Zafón", 350, "33333");


                // ---------- ENUNCIADO: Mostrar su información ----------
                // Llamamos al método que imprime los datos
                libro1.mostrarInformacion();
                libro2.mostrarInformacion();
                libro3.mostrarInformacion();


                // ---------- ENUNCIADO: Indicar cuáles son libros largos ----------
                // Comprobamos si cada libro tiene más de 300 páginas
                System.out.println(libro1.getTitulo() + " es largo? " + libro1.esLibroLargo());
                System.out.println(libro2.getTitulo() + " es largo? " + libro2.esLibroLargo());
                System.out.println(libro3.getTitulo() + " es largo? " + libro3.esLibroLargo());


                // ---------- ENUNCIADO: Buscar un libro por título ----------
                // Título que queremos encontrar
                String tituloBuscado = "It";

                System.out.println("\nBuscando el libro: " + tituloBuscado);

                // Comparamos el título buscado con los títulos de los libros
                if (libro1.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                    libro1.mostrarInformacion();        // Si coincide, lo mostramos
                } else if (libro2.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                    libro2.mostrarInformacion();
                } else if (libro3.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                    libro3.mostrarInformacion();
                } else {
                    System.out.println("No existe un libro con ese título."); // No encontrado
                }
            }
        }























