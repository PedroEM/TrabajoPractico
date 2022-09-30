import java.util.*;

public class Materia implements Informacion {
    String nombre;
    Profesor titular;
    LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<Estudiante>();

    void agregarEstudiante(Estudiante estudiante){
        if(coleccionEstudiantes.add(estudiante)) {
            System.out.println("Estudiante agregado");
        }else{
            System.out.println("Error al agregar el estudiante");
        }
    };
    void eliminarEstudiante(String nombre){
        ListIterator<Estudiante> iterador = coleccionEstudiantes.listIterator();
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
        String contenido[] = new String[coleccionEstudiantes.size()];
        for (int i=0;i<coleccionEstudiantes.size();i++){
            contenido[i] = coleccionEstudiantes.get(i).getApellido() + " " + coleccionEstudiantes.get(i).getNombre();
        }
        return contenido.toString();
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
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
