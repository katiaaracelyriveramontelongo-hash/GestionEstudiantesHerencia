
// Clase base Persona
class Persona {
    protected String nombre;
    protected int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar informacion personal
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    protected String matricula;
    protected String carrera;

    // Constructor que utiliza super para llamar a Persona
    public Estudiante(String nombre, int edad,
                      String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Metodo para mostrar informacion del estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}

// Clase EstudianteBecado que hereda de Estudiante
class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public EstudianteBecado(String nombre, int edad,
                            String matricula, String carrera,
                            double porcentajeBeca) {
        super(nombre, edad, matricula, carrera);
        this.porcentajeBeca = porcentajeBeca;
    }

    // Metodo exclusivo para estudiantes becados
    public void mostrarBeca() {
        System.out.println("Porcentaje de beca: "
                           + porcentajeBeca + "%");
    }

    // Sobrescritura del metodo heredado
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarBeca();
    }
}

// Clase EstudianteRegular que hereda de Estudiante
class EstudianteRegular extends Estudiante {
    private int semestre;

    public EstudianteRegular(String nombre, int edad,
                             String matricula, String carrera,
                             int semestre) {
        super(nombre, edad, matricula, carrera);
        this.semestre = semestre;
    }

    // Metodo exclusivo para estudiantes regulares
    public void mostrarSemestre() {
        System.out.println("Semestre: " + semestre);
    }

    // Sobrescritura del metodo heredado
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarSemestre();
    }
}

// Clase principal del programa
public class Main {
    public static void main(String[] args) {

        // Crear un objeto de estudiante becado
        EstudianteBecado estudiante1 =
            new EstudianteBecado(
                "Carlos Perez", 20,
                "A001", "Ingenieria en Sistemas", 50
            );

        // Crear un objeto de estudiante regular
        EstudianteRegular estudiante2 =
            new EstudianteRegular(
                "Maria Lopez", 21,
                "A002", "Ingenieria en Sistemas", 4
            );

        // Mostrar informacion del estudiante becado
        System.out.println("=== ESTUDIANTE BECADO ===");
        estudiante1.mostrarInformacion();

        System.out.println();

        // Mostrar informacion del estudiante regular
        System.out.println("=== ESTUDIANTE REGULAR ===");
        estudiante2.mostrarInformacion();
    }
}
