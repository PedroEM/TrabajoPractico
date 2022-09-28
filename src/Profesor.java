public class Profesor extends Persona {
    double basico;
    int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.antiguedad = antiguedad;
        this.basico = basico;
    }

    public void modificarDatos(String nombre, String apellido, int legajo, double basico, int antiguedad){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setLegajo(legajo);
        this.setBasico(basico);
        this.setAntiguedad(antiguedad);
    }

    public void calcularSueldo() {
        this.basico = basico * (antiguedad);//******* asignar contador ********//
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
