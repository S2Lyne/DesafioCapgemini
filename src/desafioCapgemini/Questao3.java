/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioCapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aline Athaydes
 */
public class Questao3 {
    public static void main(String[] args) {
    
        Scanner palavra = new Scanner (System.in);
        String p1;
        System.out.println("Digite uma palavra");
        p1 = palavra.nextLine();
        ArrayList<String> anagramas = new ArrayList<>();
        for(int i = 0; i <p1.length(); i++) {
            for(int j = 1; j < p1.length(); j++) {
                if(p1.charAt(i) == p1.charAt(j) && i != j && i < j) {
                    if(p1.charAt(i) == p1.charAt(i+1)) {
                    String z = p1.substring(i, i + 1);
                    anagramas.add(z);
                    } else {
                    String x = p1.substring(i, j);
                    String y = p1.substring(i + 1, j + 1);
        
                    anagramas.add(y);
                    anagramas.add(x);
                    }
                }
            }
        }
        int tamanho = anagramas.size();
        System.out.println(tamanho);
    }
}
