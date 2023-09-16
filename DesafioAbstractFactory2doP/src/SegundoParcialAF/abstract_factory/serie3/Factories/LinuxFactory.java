package SegundoParcialAF.abstract_factory.serie3.Factories;

import SegundoParcialAF.abstract_factory.serie3.botones.Boton;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.Ventana;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTexto;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTextoLinux;



public class LinuxFactory implements AbstractFactory{

    @Override
    public Boton crearBoton() {
        return null;
    }

    @Override
    public Ventana crearVentana() {
        return null;
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoLinux();
    }
}
