public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Christopher";
        persona.apellido = "Aguilera";
        persona.edad = 21;
        persona.setCedula("1727424507");

        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Apellido: " + persona.apellido);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Cédula: " + persona.getCedula());
    }
}
