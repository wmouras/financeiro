import contabancaria.negocio.Cliente;
import contabancaria.negocio.Conta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        System.out.println("Bem vindo ao Banco XYZ/n");

        System.out.print("Insira o nome do Cliente: ");
        cliente.setNome(scan.nextLine());
        System.out.print("Insira o CPF do Cliente: ");
        cliente.setCpf(scan.nextLine());
        System.out.print("Insira o telefone do Cliente: ");
        cliente.setTelefone(scan.nextLine());

        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("---------------------------");
        System.out.println("Dados da conta: ");
        System.out.print("Número da conta: ");
        conta.setNumero(Integer.parseInt(scan.nextLine()));
        System.out.print("Agência: ");
        conta.setAgencia(scan.nextLine());
        System.out.println("Conta cadastrada com sucesso!");

        cliente.setConta(conta);

        System.out.println("---------------------------");
        System.out.println("---------------------------");




        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Número da conta: " + cliente.getConta().getNumero());
        System.out.println("Agência: " + cliente.getConta().getAgencia());

    }
}