
public class Main {
    public static void main(String[] args) {
    
        Recursos recursos = new Recursos();

      
        System.out.println("Mensaje: " + recursos.obtenerMensaje());

        int edadEjemplo = 20;
        System.out.println(" anos): " + recursos.verificarEdad(edadEjemplo) + edadEjemplo + "Verificacion de edad (");

        
        int num1 = 5, num2 = 7;
        System.out.println("Multiplicacion de " + num1 + " y " + num2 + ": " + recursos.multiplicar(num1, num2));

       
        int x = 10;
        int[] lista = recursos.generarLista(x);
        System.out.print("Lista de numeros del 1 al " + x + ": ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
