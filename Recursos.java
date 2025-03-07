
public class Recursos {
    
    
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}
