/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.tipos;

/**
 *
 * @author everton
 */
public class TesteTipos {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("valor: " + valor);
        
        String valor2 = "30"; 
        int idade2 = Integer.parseInt(valor2);
        System.out.println("Idade é " + idade2);
        
        String valor3 = "30.5"; 
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("A idade é %.2f \n", idade3);
        
    }
}
