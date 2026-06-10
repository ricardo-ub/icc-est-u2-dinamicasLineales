import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {
    // Método que verifica si una cadena de texto
    // es palíndroma usando una pila.
    // Un texto es palíndromo cuando se lee igual
    // de izquierda a derecha y de derecha a izquierda.
    public boolean esPalindromo(String texto){
        Deque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        for (char letra : texto.toCharArray()) {
            if (letra != pila.pop()) {
                return false;
            }
        }

        return true;
    }
}