package desafiochatgpt5;


import java.util.Scanner;
import java.util.ArrayList;
public class DesafioChatGPT5 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int n = teclado.nextInt();
        int fatorial = 1;
        ArrayList<Integer> fibonacci = new ArrayList();
        int elemento = 0;
        
        //CALCULANDO FATORIAL
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        
        //SEQUENCIA FIBONACCI
        fibonacci.add(0);
        fibonacci.add(1);
        
        for (int i = 2; i <= n-1; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
            elemento = fibonacci.get(i);
        }
        
        //MOSTRANDO RESULTADOS
        System.out.println();
        System.out.println("O Fatorial de " + n + " e " + fatorial);
        System.out.println("O Elemento " + n + " da sequencia de fibonacci e " + elemento);
    }
    
}
