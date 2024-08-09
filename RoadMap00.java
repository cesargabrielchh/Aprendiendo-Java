import java.lang.reflect.Array;

public class RoadMap00 {
    /*
     * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
     * - Recuerda que todas las instrucciones de participación están en el
     *   repositorio de GitHub.
     *
     * Lo primero... ¿Ya has elegido un lenguaje?
     * - No todos son iguales, pero sus fundamentos suelen ser comunes.
     * - Este primer reto te servirá para familiarizarte con la forma de participar
     *   enviando tus propias soluciones.
     *
     * EJERCICIO:
     * - Crea un comentario en el código y coloca la URL del sitio web oficial del
     *   lenguaje de programación que has seleccionado.
     * - Representa las diferentes sintaxis que existen de crear comentarios
     *   en el lenguaje (en una línea, varias...).
     * - Crea una variable (y una constante si el lenguaje lo soporta).
     * - Crea variables representando todos los tipos de datos primitivos
     *   del lenguaje (cadenas de texto, enteros, booleanos...).
     * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
     *
     * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
     * debemos comenzar por el principio.
     */

    public static void main(String[] args) {

        /*
         * Este es un comentario de varias líneas que se usa cuando es necesario
         * explicar algún fragmento del código y que puede ocupar más de una
         * línea para lograrlo.
         * El sitio web oficial de Java es: https://www.java.com/
         */

        // De esta manera es como se escribe un comentario corto

        /**
         * Este otro código es usado para documentar
         */

        //Variables primitivas
        byte age = 21;
        short students = 50;
        int citizens = 30000;
        long speedLight = 300000;
        float stature = 1.80F;
        double bigNumber = 32154654.1245;
        char aSingleLetter = 'a';
        boolean isThatTrue = false;

        //Variables no primitivas (de referencia)
        String myName = "César Chairez"; //Cadena de texto
        Double[] container = {1200.0,1500.0}; //Array

        //Constantes
        final float PI_VALUE = 3.14159F;

        System.out.println("Hola, este es mi primer ejercicio con Java y GitHub");

    }
}
