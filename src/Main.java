import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Moedas, Escolha, Sala, Construiu, Coluna, Linha;
        String Nome;
        int[][] Salas = new int[3][3];

        Moedas = 100;
        Sala = 30;
        Construiu = 0;
        System.out.println("===================");
        System.out.println(" Dungeon Manager");
        System.out.println("===================");
        System.out.println();
        System.out.println("Digite o nome da dungeon: ");
        Nome = sc.nextLine();
        System.out.println("Bem-vindo a " + Nome + " ");
        System.out.println("Voce possui " + Moedas + " moedas");
        System.out.println();
        System.out.println("===================");
        System.out.println(" Dungeon Manager");
        System.out.println("===================");
        System.out.println(" 1 - Comprar sala ");
        System.out.println(" 2 - Ver status ");
        System.out.println(" 3 - Sair ");
        Escolha = sc.nextInt();


        while (Escolha != 3) {
            if (Escolha <= 3 && Escolha > 0) {
                if (Escolha == 1) {

                    if (Moedas >= Sala) {
                        for (Linha = 0; Linha < 3 && Construiu == 0; Linha++) {
                            for (Coluna = 0; Coluna < 3 && Construiu == 0; Coluna++) {
                                if (Salas[Linha][Coluna] == 0) {
                                    Salas[Linha][Coluna] = 1;
                                    System.out.println("Parabens!!! voce comprou uma sala");
                                    Moedas -= Sala;
                                    System.out.println(Moedas);
                                    Construiu = 1;

                                }
                            }

                        }
                        if (Construiu == 0) {
                            System.out.println("Dungeon cheia!!!!!");
                        }
                    } else {
                        System.out.println("Moedas insuficiente!!!!!");
                    }
                } else if (Escolha == 2) {
                    for (Linha = 0; Linha < 3; Linha++) {
                        for (Coluna = 0; Coluna < 3; Coluna++) {
                            System.out.print(Salas[Linha][Coluna] + " ");
                        }
                        System.out.println();
                    }

                }
            }else {
                System.out.println("Escolha Invalida");

            }
                Construiu = 0;
                System.out.println(" 1 - Comprar sala ");
                System.out.println(" 2 - Ver status ");
                System.out.println(" 3 - Sair ");
                Escolha = sc.nextInt();

        }
        sc.close();
        System.out.println("Obrigado Por ter Jogado, Volte sempre!!!!");
    }
}