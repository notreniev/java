/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.scanner;

import java.util.Scanner;

/**
 *
 * @author everton
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
    }
}
