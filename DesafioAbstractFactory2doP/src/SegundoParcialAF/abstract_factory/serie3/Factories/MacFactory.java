package SegundoParcialAF.abstract_factory.serie3.Factories;

import SegundoParcialAF.abstract_factory.serie3.botones.Boton;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.Ventana;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTexto;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.VentanaMac;

public class MacFactory implements AbstractFactory {


    @Override
    public Boton crearBoton() {
        return null;
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return null;
    }

}
