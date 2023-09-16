package SegundoParcialAF.abstract_factory.serie3.Factories;

import SegundoParcialAF.abstract_factory.serie3.botones.Boton;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.Ventana;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTexto;

public interface AbstractFactory {

    Boton crearBoton();

    Ventana crearVentana();

    CuadroTexto crearCuadroTexto();

}
