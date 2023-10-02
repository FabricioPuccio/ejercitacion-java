package principal;

import clasespropias.*;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Nicolás");

        //Probamos el funcionamiento de la clase Pareja
        Pareja<String> pareja1 = new Pareja<String>();
        pareja1.setPrimero("Fabricio");
        System.out.println(pareja1.getPrimero());

        Pareja<Persona> pareja2 = new Pareja<Persona>();
        pareja2.setPrimero(persona);
        System.out.println(persona.toString());

        /*
        Cuando utilizamos clases genéricas NO podemos utilizar el principio
        de sustitución con la herencia
         */
        Pareja<Empleado> trabajador = new Pareja<Empleado>();
        Pareja<Jefe> gerente = new Pareja<Jefe>();

        System.out.println(Pareja.imprimeDatos(trabajador));
        System.out.println(Pareja.imprimeDatos(gerente));
//-------------------------------------------------------------------------------------------------
        String[] nombres = {"Fabri", "Brian", "Abby", "Gino", "Benja", "Angel"};

        String elemento = MetodoGenerico.<String>getMenor(nombres);

        System.out.println(elemento);

    }


}

