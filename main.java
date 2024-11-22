import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException{
        
        Stack<Double> pila = new Stack<>();
        Stack<Double> pila2 = new Stack<>();

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));
        metodos m = new metodos();

        int opc = 0;

        do {
            System.out.println("\t\t----PROGRAMA PILAS----\n\n\n"
                            +"1. Ingresar numero a pila\n" 
                            +"2. Mostrar pila\n");

            System.out.println("Ingrese la opcion deseada: ");
            opc = Integer.parseInt(cp.readLine()); 
            switch (opc) {
                case 1:
                    m.llenar_pila(pila);
                    break;
                
                case 2: 
                    double []matriz = new double[pila.size()];
                    double[]matriz2 = new double[pila.size()];
                    System.out.println("Pila original");
                    m.mostrar_pila(pila);
                    m.pila_a_matriz(matriz, matriz2, pila);
                    System.out.println("Pila convertida a vector: ");
                    m.mostrar_matriz(matriz);
                    m.validacion_matriz(matriz);
                    System.out.println("Vector modificado con los validadores: ");
                    m.mostrado_matriz_mod(matriz);
                    System.out.println("Vector original con raiz: ");
                    m.matriz_con_raiz(matriz2);
                    m.matriz_raiz(matriz2);
                    System.out.println("\nVector modificado con raices: ");
                    m.matriz_con_raiz(matriz);
                    m.matriz_raiz(matriz);
                    System.out.println("\n\nPila con vector original:");
                    m.matriz_a_pila(matriz2, pila);
                    m.mostrar_pila_mod(pila);
                    System.out.println("\nPila con vector modificado");
                    m.matriz_a_pila(matriz, pila2);
                    m.mostrar_pila_mod(pila2);
                    break;
                default:
                    break;
            }
        } while (opc != 0);
    }
}