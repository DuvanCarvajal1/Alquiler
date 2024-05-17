
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    String placa;
    String marca;
    String modelo;
    String tipo;
    
    public Vehiculo(String placa, String marca, String modelo, String tipo){
        this.placa= placa;
        this.marca= marca;
        this.modelo= modelo;
        this.tipo= tipo;
    }
    
     // Getters
    public String getPlaca() {
        return placa;
    }
 
     
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }


    //Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
