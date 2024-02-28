import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operacao = 0;
        double valorReceber = 0;
        double valorTranferir = 0;

        System.out.println("""
                Nome: Jacqueline Oliveira
                Tipo conta: Corrente
                Saldo: R$2.500,00
                """);

        while (operacao != -1){
            System.out.println(""" 
                    
                    Operações
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a operação desejada
                    """);
            operacao = leituraDados.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a receber: ");
                    valorReceber = leituraDados.nextDouble();

                    saldo += valorReceber;
                    System.out.println("Seu saldo foi atualizado, você recebeu: " + valorReceber + ". Saldo atual: " + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    valorTranferir = leituraDados.nextDouble();

                    if (saldo < valorTranferir){
                        System.out.println("Você é pobre");
                    }else {
                        saldo -= valorTranferir;

                        System.out.println("Seu saldo foi atualizado, você transferiu. " + valorTranferir + ". Saldo atual: " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Digite uma operação válida.");
                break;            }

        }

    }
}