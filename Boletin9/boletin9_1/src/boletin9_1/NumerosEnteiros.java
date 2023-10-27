package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class NumerosEnteiros {
    public void dezNumeros (){
    Scanner sc = new Scanner(System.in);
    int p=0;int n=0;int c=0;int i=0;
        while (i<10){
            System.out.print("Introduza o numero: "+(i+1)+" : ");  
            int num = sc.nextInt();
            if (num>0)
                p++;
                else if (num<0)
                    n++;
                else{
                    c++;
                } 
            i ++;
        }
        System.out.println("Hai "+p+" numeros positivos\nHai "+n+" numeros negativos\nHai "+c+" numeros que son cero");
    }
}
