package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades;
    //   ALT + Z 
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public abstract class Vehiculo {    //clase abstracta: no se pueden crear objetos de la clase Vehiculo.
    private String color;
    private String marca;
    private String modelo;
    private double precio;
    @Setter(AccessLevel.NONE)
    private Radio radio;

    /**
     * constructor con los atributos obligatorios (color, marca y modelo).
     * @param color
     * @param marca
     * @param modelo
     */
    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * constructor con los atributos obligatorios más precio.
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     */
    public Vehiculo(String color, String marca, String modelo, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * método abstracto que se sobreescribe en las subclases.  
     */
    public abstract void informarTipoDeVehiculo();
    
/**
     * método para agregar una Radio nueva al vehículo, si ésta radio que queremos implementar no está en otro vehículo, y si el vehículo no tiene una.
     * @param nuevaRadio recibe el objeto de Radio que se desee agregar.
     */
    public void agregarRadio(Radio nuevaRadio) { 
        if (nuevaRadio.isEnUso()) {      //primero se verifica si la nuevaRadio está en otro vehiculo
            System.out.println("¡La radio que quiere añadir está en otro vehiculo! No se puede cometer tal acción. Retirela de dicho vehiculo utilizando '.retirarRadio(radio)'");
        }else { 
            if (this.radio!=null) {     //verifica si este vehiculo tiene una radio
                System.out.println("Ya hay una radio en este vehiculo, retirela utilizando el método '.retirarRadio(radio)' e intente esta acción (.agregarRadio(radio)) nuevamente");            
            }else{
                nuevaRadio.ocuparRadio();   //cambia el estado del atributo enUso a true
                this.radio=nuevaRadio;
                System.out.println("La radio " + nuevaRadio + " ha sido agregada al vehiculo. Disfrute del viaje con música en alta fidelidad y volúmen sin saturación.");
            }
        }
    }

    /**
     * método para retirar la radio del vehiculo.
     * @param radio
     */
    public void retirarRadio(){
        if (this.radio==null){
            System.out.println("Radio no encontrada en este vehiculo.");
        }else { 
            System.out.println("Retirando radio del vehiculo...");
            radio.desocuparRadio();     //cambia el estado del atributo enUso a false
            this.radio=null;
            System.out.println("Extracción realizada, radio disponible para instalar en otro vehículo.");
        }  
    }
}
