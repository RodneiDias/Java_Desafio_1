import java.util.Scanner;

public class IfCase {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String linha="*************************************";
        String textoInicial = "Dados iniciais do cliente";
        String nomeCliente = "Rodnei Ferreira Dias Santos";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        String menuOperacoes = """
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada
                """
                ;
        System.out.println(linha);
        System.out.println(textoInicial);
        System.out.println("");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
        System.out.println(linha);
        System.out.println("");
        System.out.println(menuOperacoes);

        int opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("Seu saldo atual é " + saldo);
        }else if (opcao == 2) {
            System.out.println("Insira o valor recebido");
            double valorRecebido = leitura.nextInt();
            double novoSaldo = saldo + valorRecebido;
            System.out.println("Seu saldo atual é R$"+ novoSaldo);
        }else if (opcao == 3) {
            System.out.println("Insira o valor da transferência");
            double valorTransferencia = leitura.nextInt();
            if (valorTransferencia > saldo) {
                System.out.println("Não há saldo suficiente para fazer essa transferência.");
            }else {
            double novoSaldo = saldo - valorTransferencia;
            System.out.println("Seu saldo atual é R$"+ novoSaldo);
            }
        }else if (opcao == 4) {
            System.out.println("Obrigado por utilizar nossos serviços.");
            leitura.close();
        }else {
            System.out.println("Opção inválida");
        }
    }
}
