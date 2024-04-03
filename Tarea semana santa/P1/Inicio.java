import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        RegistroEstudian registro = new RegistroEstudian();
        registro.agregarEstudiante(new Estudiante("Juan Perez", "1001", "Ingeniería", 4.5));
        registro.agregarEstudiante(new Estudiante("Maria Rodriguez", "1002", "Ciencias de la Computación", 4.2));
        registro.agregarEstudiante(new Estudiante("Carlos Gonzalez", "1003", "Arquitectura", 4.0));

        System.out.println("Estudiantes registrados:");
        registro.listarEstudiantes();

        System.out.println("\nBuscando estudiantes con filtro 'Maria':");
        List<Estudiante> resultados = registro.buscarEstudiantes("Maria");
        
        for (Estudiante e : resultados) {
            System.out.println(e);
        }

        registro.eliminarEstudiante("1002");

        System.out.println("\nEstudiantes registrados después de eliminar:");
        registro.listarEstudiantes();
    }
}
