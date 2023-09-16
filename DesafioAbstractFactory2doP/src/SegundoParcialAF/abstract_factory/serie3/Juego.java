package SegundoParcialAF.abstract_factory.serie3;

import SegundoParcialAF.abstract_factory.serie3.Aplicacion.Application;
import SegundoParcialAF.abstract_factory.serie3.Factories.AbstractFactory;
import SegundoParcialAF.abstract_factory.serie3.Factories.MacFactory;
import SegundoParcialAF.abstract_factory.serie3.Factories.WindowsFactory;
import SegundoParcialAF.abstract_factory.serie3.Factories.LinuxFactory;


import java.util.Scanner;

public class Juego {

    public static Application configureApplication() {
        Application app;
        AbstractFactory factory =new MacFactory();
        //AbstractFactory factory =new WindowsFactory();
        //AbstractFactory factory =new LinuxFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistemas Operativos a utilizar:");

        System.out.println("Ingrese sistema operativo:");

        String Name = sc.nextLine();
        if (Name.contains("mac")) {
            factory = new MacFactory();
        } else if(Name.contains("Windows")){
            factory = new WindowsFactory();
        } else if(Name.contains("Linux")){
            factory = new LinuxFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

