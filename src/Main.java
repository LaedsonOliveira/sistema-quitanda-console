import Model.Produto;
import Model.Quitanda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Quitanda minhaQuitanda = new Quitanda();

        boolean runProgram = true;

        System.out.println("*********************");
        System.out.println("Gestor de Quitanda:");
        System.out.println("*********************");

        while(runProgram){

            int id;
            String resposta = null;

            System.out.println("Digite qual operação deseja realizar:" +
                    "\n 1 - Adicionar Fruta" +
                    "\n 2 - Remover Fruta" +
                    "\n 3 - Perquisar Fruta" +
                    "\n 4 - Consultar Estoque" +
                    "\n 5 - Finalizar Programa");
            resposta = scanner.nextLine();

            switch (resposta){

                case "1":
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preco: ");
                    int preco = Integer.parseInt(scanner.nextLine());

                    System.out.print("Digite a quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    System.out.println( minhaQuitanda.AdcionarProduto(nome, preco, quantidade));
                    break;

                case "2":
                    System.out.print("Digite o ID: ");
                    id = Integer.parseInt(scanner.nextLine()) ;
                    System.out.println(minhaQuitanda.RemoverProduto(id));
                    break;

                case "3":
                    System.out.println("Qual o id do produto:");
                    id = Integer.parseInt(scanner.nextLine()) ;
                    System.out.println(minhaQuitanda.PesquisarProduto(id));
                    break;

                case "4":
                    minhaQuitanda.ConsultarEstoque();
                    break;

                case "5":
                    runProgram = false;
                    break;

                default:
                    System.out.println("Valor digitado, Incorreto!");
                    break;


            }

        }
    }
}