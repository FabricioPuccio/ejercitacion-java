package clasespropias;

public class MetodoGenerico {

    /*
     * Método genérico. <T extends Comparable> Necesitamos que todos los argumentos
     * que le pasemos a este método implementen la interfaz Comparable. Devuelve el
     * menor elemento del array que le pasemos por parámetro
     */
    public static <T extends Comparable> T getMenor(T[] array) {

        if (array.length == 0 || array == null) {
            return null;
        }

        T elementoMenor = array[0];

        for (int i = 1; i < array.length; i++) {

            if (elementoMenor.compareTo(array[i]) > 0) {
                elementoMenor = array[i];
            }
        }
        return elementoMenor;
    }
}
