package exer06;

import aula11.Lista;
import vetor.Contato;

import java.util.Scanner;

public class Excer06 {

    public static void main(String[] args) {

        //ciração das variáveis
        Scanner scan = new Scanner(System.in);

        //criar vetor com 20 posições
        Lista<Contato> lista = new Lista<Contato>(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(15, lista);

        //criar um menu para que o usuario escolha a opção
        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {

                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                default:
                    break;
            }
        }

        System.out.println("programa finalizado");

    }

    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }
    private static void limparVetor(Lista<Contato> lista){
        lista.limparLista();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }
    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }
    private static void excluirContato(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        try {
            Contato contato = lista.obtem(pos);


            lista.remove(contato);
            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
        try {
            lista.remove(pos);
            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }
    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        try {
            Contato contato = lista.obtem(pos);
            boolean existe = lista.contem(contato);

            if (existe){
                System.out.println("Contao existe");
                System.out.println(contato);
            }else {
                System.out.println("Contato não existe");
            }



        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }
    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        try {
            Contato contato = lista.obtem(pos);
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último contato: ");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }
    private static void obtemContato(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        try {
            Contato contato = lista.obtem(pos);
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }
    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
        try {
            Contato contato = lista.obtem(pos);
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre co um nome", scan);
        String telefone = leInformacao("Entre com um telefone", scan);
        String email = leInformacao("Entre com um email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre co um nome", scan);
        String telefone = leInformacao("Entre com um telefone", scan);
        String email = leInformacao("Entre com um email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição desejada" , scan);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posição inválida");
        }

    }

    private static String leInformacao(String msg, Scanner scan){
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    private static int leInformacaoInt(String msg, Scanner scan){

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida){

            try {

                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente\n\n");
            }

        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida){

            System.out.println("Digite a opção desejada");
            System.out.println("1: Adicionar contato no final do vetor");
            System.out.println("2: Adicionar contato em um posição específica");
            System.out.println("3: Consultar contato de uma posição específica");
            System.out.println("4: Consultar contato");
            System.out.println("5: Consultar último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Limpar vetor");
            System.out.println("11: Imprimir vetor");
            System.out.println("0: Sair");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0&& opcao <= 11){
                    entradaValida = true;
                }else {
                    System.out.println("Entrada inválida, digite novamente\n\n");
                }

            }catch (Exception e){
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }


        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

        Contato contato;

        for (int i=1; i<= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " +i);
            contato.setTelefone("111111" +1);
            contato.setEmail("Contato" + i + "@email.com");
            lista.add(contato);
        }

    }
}
