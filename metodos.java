import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class metodos{

    BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

    public Stack<Double> llenar_pila(Stack<Double> pila)throws IOException{

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el numero para la pila: ");
            pila.push(Double.parseDouble(cp.readLine()));
            System.out.println("Desea ingresar otro dato?\n"
                            +"1. Si\n"
                            +"2. No\n");
            int opc = Integer.parseInt(cp.readLine());
            if(opc == 1){
                continuar = true;
            }else{
                continuar = false;
            }
        }
        return pila;
    }


    public void mostrar_pila(Stack<Double> pila){
        System.out.println(pila);
    }


    public double[] pila_a_matriz (double[]matriz,double[]matriz2, Stack<Double>pila){

        Stack<Double> pila_aux = new Stack<>();
        int tamaño = pila.size();
        for (int i = 0; i < tamaño; i++) {
            matriz[i] = pila.peek();
            matriz2[i] = pila.peek();
            pila_aux.push(pila.pop());
        }
        return matriz;
    }


    public void mostrar_matriz(double[]matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("["+matriz[i]+"]");
        }
        System.out.println("\n");
    }


    public double[] validacion_matriz(double[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]< 0) {
                matriz[i] = 0;
            }else if(matriz[i]>=8 && matriz[i]<=20){
                matriz[i] = 50;
            }else if(matriz[i]> 60 && matriz[i]< 62){
                matriz[i]= 100;
            }
        }
        return matriz;
    }


    public void mostrado_matriz_mod(double[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("["+matriz[i]+"]");
        }
        System.out.println("\n");
    }


    public double[]matriz_con_raiz(double []matriz){
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Math.sqrt(matriz[i]);
        }
        return matriz;
    }

    public void matriz_raiz(double []matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("["+matriz[i]+"]");
        }
    }

    public Stack<Double> matriz_a_pila(double[]matriz, Stack<Double>pila){

        for (int i = 0; i < matriz.length; i++) {
            pila.push(matriz[i]);
        }
        return pila;
    }

    public void mostrar_pila_mod(Stack<Double> pila){
        System.out.println(pila);
    }
}