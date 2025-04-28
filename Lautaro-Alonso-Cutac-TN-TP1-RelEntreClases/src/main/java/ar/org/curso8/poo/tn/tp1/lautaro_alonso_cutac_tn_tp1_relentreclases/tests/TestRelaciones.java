package ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.tests;

import ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades.AutoClasico;
import ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades.AutoNuevo;
import ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades.Colectivo;
import ar.org.curso8.poo.tn.tp1.lautaro_alonso_cutac_tn_tp1_relentreclases.entidades.Radio;

public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("               ~~Test de la clase Radio~~  ");

        Radio radio1 = new Radio("Stromberg SC-6003", 25);
        Radio radio2 = new Radio("Pioneer MVH-S235BT3", 23);
        Radio radio3 = new Radio("Philco 94CSP2950", 50);

        System.out.println("Radio 1: " + radio1);
        System.out.println("Radio 2: " + radio2);
        System.out.println("Radio 3: " + radio3);
        System.out.println();



        System.out.println("              ~~Test de la clase AutoClasico~~    ");
        AutoClasico autoClasico1 = new AutoClasico("Azul", "Chevrolet", "400 SS (1969)", 8500); 
        System.out.println(autoClasico1);

        AutoClasico autoClasico2 = new AutoClasico("Negro", "Chevrolet", "Impala Coupé SS (1964)"); 
        System.out.println(autoClasico2);

        AutoClasico autoClasico3 = new AutoClasico("Rojo", "Fiat", "600 D 1961"); 
        System.out.println(autoClasico3);
        System.out.println();



        System.out.println("              ~~Test de la clase AutoNuevo~~  ");

        AutoNuevo autoNuevo1 = new AutoNuevo("Blanco", "Renault", "Kwid", radio3);
        AutoNuevo autoNuevo2 = new AutoNuevo("Rojo", "Fiat", "Mobi", 18530, radio2);
        AutoNuevo autoNuevo3 = new AutoNuevo("Rojo", "Citroën", "C4 Cactus", radio1);
        System.out.println(autoNuevo1);
        System.out.println(autoNuevo2);
        System.out.println(autoNuevo3);
        System.out.println();



        System.out.println("               ~~Test de la clase Colectivo~~  ");

        Colectivo colectivo1 = new Colectivo("Azul y Rojo", "Mercedes-Benz", "1420");
        Colectivo colectivo2 = new Colectivo("Verde y Blanco", "Mercedes-Benz", "LO 3500");
        System.out.println(colectivo1);
        System.out.println(colectivo2);
        System.out.println();



        System.out.println("               ~~Test con los métodos~~    ");

        autoClasico1.agregarRadio(radio3);
        System.out.println(autoClasico1);
        autoClasico3.agregarRadio(radio3);
        System.out.println(autoClasico3);
        System.out.println();

        System.out.println(autoNuevo1);
        autoNuevo1.retirarRadio();
        System.out.println(autoNuevo1);
        System.out.println(autoClasico1);
        System.out.println();

        autoClasico3.agregarRadio(radio3);
        System.out.println(autoClasico3);
        System.out.println();
        
        System.out.println(autoNuevo1);
        autoNuevo1.agregarRadio(radio1);
        System.out.println(autoNuevo1);
        autoNuevo1.agregarRadio(radio2);
        colectivo2.retirarRadio();
        System.out.println();
        
    }
}
