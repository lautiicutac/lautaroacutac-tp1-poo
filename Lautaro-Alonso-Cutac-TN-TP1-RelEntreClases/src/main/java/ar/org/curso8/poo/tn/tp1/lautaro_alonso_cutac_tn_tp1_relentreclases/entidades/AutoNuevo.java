package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString(callSuper = true)

public class AutoNuevo extends Vehiculo{
    /**
     * constructor con los atributos de AutoNuevo obligatorios:
     * @param color
     * @param marca
     * @param modelo
     * @param radio
     */
    public AutoNuevo(String color, String marca, String modelo, Radio radio) {
        super(color, marca, modelo);
        super.agregarRadio(radio);
    }
    /**
     * constructor con atributos obligatorios más precio.
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     * @param radio
     */
    public AutoNuevo(String color, String marca, String modelo, double precio, Radio radio) {
        super(color, marca, modelo, precio);
        super.agregarRadio(radio);
    }

    @Override
    public void informarTipoDeVehiculo() {
        System.out.println("Información sobre este vehículo: Auto Nuevo");
    }
}
