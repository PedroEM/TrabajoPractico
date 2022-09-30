import java.util.*;

public class Carrera implements Informacion{
    String nombre;
    LinkedList<Materia> coleccionMaterias = new LinkedList<Materia>();

    void agregarMateria(Materia materia){
        if(this.coleccionMaterias.add(materia)){
            System.out.println("Materia agregada");
        }else{
            System.out.println("Error al agregar la materia");
        }
    };
    void eliminarMateria(String nombreMateria){
        ListIterator<Materia> iterador = this.coleccionMaterias.listIterator();
        while (iterador.hasNext()){
            String materia = iterador.next().getNombre();
            if (materia == nombreMateria){
                iterador.remove();
                System.out.println("Estudiante eliminado");
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    void encontrarMateria(String nombre){
        ListIterator<Materia> iterador = this.coleccionMaterias.listIterator();
        Scanner sc = new Scanner(System.in);
        while (iterador.hasNext()){
            String materia = iterador.next().getNombre();
            if (materia == nombre){
                try {
                    System.out.println("Estudiante Encontrada, ¿Quiere eliminar la materia? y/n");
                    String opcion = sc.nextLine();
                    opcion.toLowerCase();
                    if(opcion.equals("y")){
                        this.eliminarMateria(nombre);
                        System.out.println("Materia eliminada");
                    }else if(opcion.equals("n")){
                        return;
                    }else{
                        System.out.println("Ingrese solamente y/n");
                    }
                }
                catch (Exception e){
                    System.out.println("Ingrese solamente letras");
                }
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    @Override
    public int verCantidad(){
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos(){
        String contenido = "";
        for (int i=0;i<this.coleccionMaterias.size();i++){
            contenido += this.coleccionMaterias.get(i).nombre + " - ";
        }
        return contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + this.nombre + '\'' +
                ", coleccionMaterias=" + this.listarContenidos() +
                '}';
    }
}
