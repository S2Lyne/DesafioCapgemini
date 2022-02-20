/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioCapgemini;

import java.util.Scanner;

/**
 *
 * @author Aline Athaydes
 */
public class Questao1 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int n;
        String p;
        System.out.println("Digite um valor inteiro");
        n = leitura.nextInt();
        p = "*";
        for(int i = 0; i < n; i++){
            System.out.println(p + " ");
            p = p + " *";
        }
    }         
}

 
