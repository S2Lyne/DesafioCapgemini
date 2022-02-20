/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioCapgemini;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Aline Athaydes
 */
public class Questao2 {
    public static void main(String[] args){
        Scanner senha = new Scanner(System.in);
        String s1;
        boolean crt = false, mns = false, msc = false, num = false;
        ArrayList caracteres = new ArrayList();
        char[] charSearchCrt = {'!','@','#','$','%','&','*','?'};
        char[] charSearchNum = {'0','1','2','3','4','5','6','7','8','9'};
        char[] charSeachStrMns = {'a','b','c','d','e','f','g','h','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] charSeachStrMsc = {'A','B','C','D','E','F','G','H','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println("Digite sua senha \nEla deve conter no mínimo 6 caracteres\n"
                +"Deve ter pelo menos 1 letra maiúscula, 1 letra minúscula "
                +"e 1 caractere especial");
        s1 = senha.nextLine();
        //if(s1.contains(s1))
        if(s1.length()<6){
            int falta = s1.length() - 6;
            System.out.println(falta);
        }else{
            for(int i = 0; i<s1.length(); i++){
                char chr = s1.charAt(i);

                for(int j = 0; j<charSearchCrt.length; j++){
                    if(charSearchCrt[j] == chr){
                        crt = true;
                    }
                }
                for(int k = 0; k<charSeachStrMns.length; k++){
                    if(charSeachStrMns[k] == chr){
                        mns = true;
                    }
                }
                for(int w = 0; w<charSeachStrMsc.length; w++){
                    if(charSeachStrMsc[w] == chr){
                        msc = true;
                    }
                }
                for(int y = 0; y<charSearchNum.length; y++){
                    if(charSearchNum[y] == chr){
                        num = true;
                    }
                }

            }
        }
        if(crt == false){
            System.out.println("Senha fraca, falta caracter especial.");
        }
        if(mns == false){
            System.out.println("Senha fraca, falta letra minúscula.");
        }
        if(msc == false){
            System.out.println("Senha fraca, falta letra maiúscula.");
        }
        if(num == false){
            System.out.println("Senha fraca, falta número.");
        }
        if(crt && mns && msc && num){
            System.out.println("Senha cadastrada com Sucesso!");
        }
    }
        
        
}
    

