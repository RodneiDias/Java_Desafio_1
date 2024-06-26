import java.util.Scanner;

public class SwitCase {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        String linha = "*************************************";
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
        /*Inicializar dados do cliente*/
        System.out.println(linha);
        System.out.println(textoInicial);
        System.out.println("");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
        System.out.println(linha);
        System.out.println("");
        /*Menu de opções*/


        while (opcao !=4){
            System.out.println(menuOperacoes);
            opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo atual é " + saldo);
                break;
            case 2:
                System.out.println("Insira o valor recebido");
                double valorRecebido = leitura.nextDouble();
                     saldo += valorRecebido;
                System.out.println("Seu saldo atual é R$" + saldo);
                break;
            case 3:
                System.out.println("Insira o valor da transferência");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Seu saldo atual é R$" + saldo);
                }
                break;
            case 4:
                System.out.println("Obrigado por utilizar nossos serviços.");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        }
        leitura.close();
    }
}
