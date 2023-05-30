package myproyect;

import java.util.ArrayList;

public class User {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    
    public User(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "User [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
    }

    public static ArrayList<User> getuserZerrenda(){
        ArrayList<User> lista = new ArrayList<User>();
        lista.add(new User("Zerrenda", "Aguilar", 20, "12345678"));
        lista.add(new User("Aimar", "Medialdea", 21, "12346879"));
        lista.add(new User("Iker", "Nuñez", 13, "34546578"));
        
        return lista;
    }


    
}
