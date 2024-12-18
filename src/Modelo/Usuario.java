
package Modelo;

public class Usuario {
    private int ID;
    private String Email;
    private String Nombre;
    private String Nivel;
    private int Puntaje=0;
    //No se almacena la contraseña pues solo se validara mediante una consulta directa a la BD y los datos que si se usaran se guardaran en un objeto de esta clase

    public Usuario(int ID, String Email, String Nombre, String Nivel, int Puntaje) {
        this.ID = ID;
        this.Email = Email;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Puntaje = Puntaje;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje += Puntaje;
    }

   
}
