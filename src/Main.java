import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moedas, escolha, sala, construiu, coluna, linha;
        String nome;
        int[][] salas = new int[3][3];

        moedas = 1000;
        sala = 30;



        System.out.println("===================");
        System.out.println(" Dungeon Manager");
        System.out.println("===================");
        System.out.println();
        System.out.println("Digite o nome da dungeon: ");
        nome = sc.nextLine();
        System.out.println("Bem-vindo a " + nome + " ");
        System.out.println("Voce possui " + moedas + " moedas");
        System.out.println();

        do {
            construiu = 0;
            System.out.println("===================");
            System.out.println(" Dungeon Manager");
            System.out.println("===================");
            System.out.println(" 1 - Comprar sala ");
            System.out.println(" 2 - Ver status ");
            System.out.println(" 3 - Sair ");
            escolha = sc.nextInt();


            switch (escolha) {

                case 1:

                    if (moedas >= sala) {
                        for (linha = 0; linha < 3 && construiu == 0; linha++) {
                            for (coluna = 0; coluna < 3 && construiu == 0; coluna++) {
                                if (salas[linha][coluna] == 0) {
                                    salas[linha][coluna] = 1;
                                    System.out.println("Parabens!!! voce comprou uma sala");
                                    moedas -= sala;
                                    System.out.println(moedas);
                                    construiu = 1;

                                }
                            }

                        }
                        if (construiu == 0) {
                            System.out.println("Dungeon cheia!!!!!");
                        }
                    } else {
                        System.out.println("Moedas insuficiente!!!!!");
                    }
                    break;
                case 2:
                    System.out.println("Moedas restantes: " + moedas);
                    System.out.println("Voce comprou essas salas: ");
                    for (linha = 0; linha < 3; linha++) {
                        for (coluna = 0; coluna < 3; coluna++) {
                            System.out.print(salas[linha][coluna] + " ");
                        }
                        System.out.println();
                    } break;

                case 3: System.out.println("Obrigado Por ter Jogado, Volte sempre!!!!");
                break;

                default:
                    System.out.println("Escolha invalida!!!");
            }
        } while(escolha != 3 );

        sc.close();
    }
}