import java.util.List;

public class Gestion
{ 
    // Crear un gestor de vehículos
        GestorVehiculos gestorVehiculos = new GestorVehiculos();

        // Buscar vehículos disponibles
        List<Vehiculo> vehiculosDisponibles = gestorVehiculos.buscarVehiculosDisponibles(tipo);

        // Mostrar vehículos disponibles
        System.out.println("Vehículos disponibles para alquiler son de tipo "+ tipo);
        for (Vehiculo vehiculo: vehiculosDisponibles) {
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Tipo: " + vehiculo.getTipo());
        }
    
    
    
    String nombreCliente;
    String placaVehiculo;
    
    public Gestion(String nombreCliente, String PlacaVehiculo){
        this.nombreCliente = nombreCliente;
        this.placaVehiculo = placaVehiculo;
    }
    
    
    
}
