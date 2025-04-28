package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString(callSuper = true)

public final class Colectivo extends Vehiculo { //final class: no se pueden crear productos derivados de Colectivo.
    /**
     * constructor con los atributos obligatorios:
     * @param color
     * @param marca
     * @param modelo
     */
    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    /**
     * constructor con los atributos obligatorios más precio.
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     */
    public Colectivo(String color, String marca, String modelo, double precio) {
        super(color, marca, modelo, precio);
    }
    
    @Override
    public void informarTipoDeVehiculo() {
        System.out.println("Información sobre este vehículo: Colectivo");
    }
}
