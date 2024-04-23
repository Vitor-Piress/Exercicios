
package Principal;

import java.util.*;
import Model.*;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ContaCorrente conta1 = new ContaCorrente();
        //ContaPoupanca conta2 = new ContaPoupanca();
        System.out.println("Bem-vindo ao sistema de criação de contas!");
        System.out.print("Digite 1 para conta Poupança ou 2 para conta Corrente: ");
        int entrada = scanner.nextInt();
        scanner.nextLine();
        
        if(entrada == 1){
            System.out.println("Você escolheu conta Poupança");
            
          //input nome
            System.out.print("Digite o nome da conta: ");
            String nomeM = scanner.nextLine();
            
          //input juros
            System.out.print("Digite o valor dos juros: ");
            double jurosM = scanner.nextDouble();
            
          //input saldo
            System.out.print("Digite o saldo da conta: ");
            double saldoM = scanner.nextDouble();
            
            ContaPoupanca conta = new ContaPoupanca(jurosM, saldoM, nomeM);
            System.out.println("Saldo atual: "+conta.getSaldo());
          //testando setDeposito();
            conta.setDeposito(250.43);
            System.out.println("Saldo atual: "+conta.getSaldo());
            
        } else if(entrada == 2){
            System.out.println("Você escolheu conta Corrente");
            
        //input nome
            System.out.print("Digite o nome da conta: ");
            String nomeM = scanner.nextLine();
            
          //input juros
            System.out.print("Digite o valor da taxa de serviço: ");
            double taxaM = scanner.nextDouble();
            
          //input saldo
            System.out.print("Digite o saldo da conta: ");
            double saldoM = scanner.nextDouble();
            
            
            ContaCorrente conta = new ContaCorrente(taxaM, saldoM, nomeM);
            System.out.println("Saldo atual: "+conta.getSaldo());
          //testando setDeposito();
            conta.setDeposito(100.4);
            System.out.println("Saldo atual: "+conta.getSaldo());
            
        } else{
            System.out.println("Você não escolheu nenhuma das opções possíveis");
        }
        
        
        
        
    }
    
    
}
