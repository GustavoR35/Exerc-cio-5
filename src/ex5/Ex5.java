/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

    import java.util.Scanner;   

public class Ex5 {

  
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double valorProduto,valorPrestacao;
   int parcelas= 5;
   System.out.print("Informe o valor do produto: ");
   valorProduto = input.nextDouble();
   valorPrestacao = valorProduto / parcelas;   
   System.out.print("O valor de cada parcela é de R$: " +valorPrestacao);
           
    }
    
}
