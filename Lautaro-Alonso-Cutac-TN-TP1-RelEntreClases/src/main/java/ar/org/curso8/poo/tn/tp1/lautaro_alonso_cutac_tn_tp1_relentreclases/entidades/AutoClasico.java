package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString(callSuper = true)

public class AutoClasico extends Vehiculo{
    /**
     * constructor con atributos obligatorios:
     * @param color
     * @param marca
     * @param modelo
     */
    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }  
    /**
     * constructor con atributos obligatorios más precio.
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     */
    public AutoClasico(String color, String marca, String modelo, double precio) {
        super(color, marca, modelo, precio);
    }

    @Override
    public void informarTipoDeVehiculo() {
        System.out.println("Información sobre este vehículo: Auto Clásico");
    }
}
