package SegundoParcialAF.abstract_factory.serie3.Aplicacion;

import SegundoParcialAF.abstract_factory.serie3.botones.Boton;
import SegundoParcialAF.abstract_factory.serie3.Ventanas.Ventana;
import SegundoParcialAF.abstract_factory.serie3.CuadroTexto.CuadroTexto;
import SegundoParcialAF.abstract_factory.serie3.Factories.AbstractFactory;


public class Application {

    private Boton boton;

    private Ventana ventana;

    private CuadroTexto cuadroTexto;


    public Application(AbstractFactory factory){
        boton = factory.crearBoton();
        ventana = factory.crearVentana();
        cuadroTexto = factory.crearCuadroTexto();
    }

    public void paint(){
        boton.paint();
        ventana.paint();
        cuadroTexto.paint();
    }

}
