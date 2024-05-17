
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    String nombre;
    int documento;
    String direccion;
    String correo;
    int numero;
    
    public Cliente(String nombre ,int documento, String direccion, String correo, int numero){
        this.nombre= nombre;
        this.documento= documento;
        this.direccion= direccion;
        this.correo= correo;
        this.numero=numero;
    }
    
     // Getters
    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String getCorreo() {
        return correo;
    } 
    
    public int getNumero() {
        return numero;
    }    

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setEdad(String direccion) {
        this.direccion = direccion;
    }
    
    public void setOcupacion(String correo) {
        this.correo = correo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
