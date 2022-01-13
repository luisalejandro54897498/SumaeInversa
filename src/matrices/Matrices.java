/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matrices{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int resultadosuma[][] = new int[3][3];
        
        
     System.out.println("*****************************************");
        System.out.println("Ingrese los numeros de la primera matriz: ");
          System.out.println("*****************************************");
          for(int i = 0;i < 3; i++) {
           for(int j = 0;j < 3; j++) {
                System.out.print("Digite los numero en: ["+i+"]["+j+"] : ");
                matriz1[i][j] = teclado.nextInt();
           }
         } 
          
     System.out.println("*****************************************");
          System.out.println("Ingrese los numeros de la segunda matriz: ");
          System.out.println("*****************************************");   
          for(int i = 0;i < 3; i++) {
           for(int j = 0;j < 3; j++) {
                System.out.print("Digite los numero en ["+i+"]["+j+"] : ");
                matriz2[i][j] = teclado.nextInt();
           }
         }
          
          for(int i = 0;i < matriz1.length; i++) {
             for(int j = 0;j < matriz2.length; j++) {
                resultadosuma[i][j] = matriz1[i][j] + matriz2[i][j];
           }
         }    
          
        System.out.println("*****************************************");         
          System.out.println("La suma de las matrices es: ");
        System.out.println("*****************************************");   
          for(int i = 0;i < matriz1.length; i++) {
           for(int j = 0;j < matriz1.length; j++) {
                System.out.print(" [ "+matriz1[i][j] + " ] ");
           }
           
           if (i == 1) {
                 System.out.print("      +       ");
           }
           else{
                System.out.print("              ");
           }
           
            for(int j = 0;j < matriz2.length; j++) {
                System.out.print(" [ "+matriz2[i][j] + " ] ");
           }
            
             if (i == 1) {
                 System.out.print("      =       ");
           }
           else{
                System.out.print("              ");
           }
           
              for(int j = 0;j < resultadosuma.length; j++) {
                System.out.print(" [ "+resultadosuma[i][j] + " ] ");
           }
              
            System.out.println("");
         }
   }
}
          
             
          
    
