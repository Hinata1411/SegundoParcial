package SegundoParcialAF.abstract_factory.serie3.Factories;

import SegundoParcialAF.abstract_factory.serie3.botones.Boton;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.Ventana;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTexto;
import SegundoParcialAF.abstract_factory.serie3.botones.BotonWindows;
public class WindowsFactory implements AbstractFactory{
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Ventana crearVentana() {
        return null;
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return null;
    }


}
