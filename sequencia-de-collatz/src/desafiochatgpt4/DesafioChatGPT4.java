package desafiochatgpt4;

import java.util.ArrayList;
import java.util.Scanner;
public class DesafioChatGPT4 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int n = teclado.nextInt();
        int passos = 0;
        ArrayList<Integer> trajeto = new ArrayList();
        trajeto.add(n);
        
        do {            
            if(n%2==0){
              n = n/2;
              passos ++;
              trajeto.add(n);
            }else{
              n = 3*n+1;
              passos ++;
              trajeto.add(n);
            }
             
            
        } while (n!=1);
        
        System.out.print("Passos da sequencia: ");
        for (int i = 0; i < trajeto.size(); i++) {
            if (i==trajeto.size()-1) {
                System.out.print(trajeto.get(i));    
            }else{
                System.out.print(trajeto.get(i) + " → ");
            }
            
        }
        System.out.println();
        System.out.println("Numero de passos: " + passos);
        
        
    }
}
 
    



