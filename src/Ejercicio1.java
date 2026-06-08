import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
    //
    // Metodo que devuelve una cadena de texto invertida
    // texto --> COMPUTACION
    // return --> NOICATUPMOC
    // USANDO SOLO PILAS 
    public String invertString(String texto) {
        Deque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invetido = "";
        while (!pila.isEmpty()) {
            invetido += pila.pop();
        }

        return invetido;
    }
}
