package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades;
    //  ALT + Z
import lombok.Getter;
import lombok.ToString;
@Getter
@ToString

public class Radio {
    private String marca;
    private int potencia;
    private boolean enUso;  //este booleano indica con true o false si la radio está siendo utilizada por un objeto de Vehiculo.

    /**
     * constructor con los atributos de radio obligatorios:
     * @param marca
     * @param potencia
     */
    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.enUso=false;   //por defecto el atributo "enUso" es false al momento de crear la radio. La radio se crea sin estar en un Vehiculo. 
    }

    /**
     * "sub-métodos" que son utilizados por los métodos ".agregarRadio()" y ".retirarRadio()" de la clase padre "Vehiculo". 
     */
    public void ocuparRadio(){
        this.enUso = true;      //cambia el estado de la radio a en uso u ocupada. 
    }
    public void desocuparRadio(){
        this.enUso = false;     //cambia el estado de la radio a disponible/desocupada
    }
}
