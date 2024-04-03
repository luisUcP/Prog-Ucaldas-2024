import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RegistroBiblioteca registro = new RegistroBiblioteca();

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruano");
        registro.registrarAutor(autor1);
        registro.registrarAutor(autor2);

        Libro libro1 = new Libro("Cien años de soledad", autor1, "978-0307474728", "Realismo mágico", 5);
        Libro libro2 = new Libro("La ciudad y los perros", autor2, "978-8437607732", "Novela", 3);
        registro.registrarLibro(libro1);
        registro.registrarLibro(libro2);

        registro.listarLibros();
        registro.listarAutores();

        Usuario usuario = new Usuario("Juan Perez", "123456789");
        Prestamo prestamo = new Prestamo(libro1, usuario, new Date(), new Date());
        registro.registrarPrestamo(prestamo);

        registro.listarPrestamos();
    }
}
    
