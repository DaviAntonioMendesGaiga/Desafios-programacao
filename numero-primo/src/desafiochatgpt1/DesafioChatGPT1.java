package desafiochatgpt1;

import java.util.Scanner;
public class DesafioChatGPT1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        int n = teclado.nextInt();
        boolean primo = true;
        
        for (int i = 1; i <= n; i++) {
            if (i!=1 && i!=n) {
                if (n%i==0) {
                   primo = false;
                   System.out.println("O Numero " + n + " nao e primo");
                   System.exit(0);
                }
            }
        }
        System.out.println("O Numero " + n + " e primo");
        
    
    }
        }

