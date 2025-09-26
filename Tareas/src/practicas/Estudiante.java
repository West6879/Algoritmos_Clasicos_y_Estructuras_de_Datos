package practicas;

public class Estudiante {
    private int matricula;
    private String nombre;
    private double indiceAcademico;

    public Estudiante(int matricula, String nombre, double indiceAcademico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.indiceAcademico = indiceAcademico;
    }

    @Override
    public String toString() {
        return matricula + "-" + nombre + "-" + indiceAcademico;
    }

    public void setIndiceAcademico(double indiceAcademico) {
        this.indiceAcademico = indiceAcademico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIndiceAcademico() {
        return indiceAcademico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }
}
