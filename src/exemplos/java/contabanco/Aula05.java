/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.contabanco;

/**
 *
 * @author everton
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(350250);
        cb1.setDono("Everton Canez");
        cb1.abrirConta("CC");

        ContaBanco cb2 = new ContaBanco();
        cb2.setNumConta(350251);
        cb2.setDono("Ana Laura Canez");
        cb2.abrirConta("CP");

        cb1.depositar(100);
        cb2.depositar(500);
        cb1.sacar(150);

        cb1.fecharConta();
        System.out.println("--------------------------");

        cb1.estadoAtual();
        cb2.estadoAtual();

    }
}
