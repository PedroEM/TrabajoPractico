import java.util.*;

public class Materia implements Informacion {
    String nombre;
    Profesor titular;
    LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<Estudiante>();

    void agregarEstudiante(Estudiante estudiante){
        if(this.coleccionEstudiantes.add(estudiante)) {
            System.out.println("Estudiante agregado");
        }else{
            System.out.println("Error al agregar el estudiante");
        }
    };
    void eliminarEstudiante(String nombre){
        ListIterator<Estudiante> iterador = this.coleccionEstudiantes.listIterator();
        while (iterador.hasNext()){
            String estudiante = iterador.next().getNombre();
            if (estudiante == nombre){
                iterador.remove();
                System.out.println("Estudiante eliminado");
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    };

    void modificarTitular(Profesor profesor){
        this.setTitular(profesor);
    };

    @Override
    public int verCantidad(){
        return this.coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos(){
        String contenido = "";
        for (int i=0;i<this.coleccionEstudiantes.size();i++){
            contenido += this.coleccionEstudiantes.get(i).getApellido() + " " + this.coleccionEstudiantes.get(i).getNombre() + " - ";
        }
        return contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + this.nombre + '\'' +
                ", titular=" + this.titular +
                ", coleccionEstudiantes=" + this.listarContenidos() +
                '}';
    }
}
