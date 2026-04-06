package jogoAdivinhacaoCompleto4;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoCompleto {

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        Scanner sc = new Scanner(System.in);
        limparTela();

        System.out.println("===== jogo do adivinha =====");
        System.out.println("Preparado pra jogar?");
        System.out.println("ENTER = continuar \n qualquer tecla = sair");

        String resposta = sc.nextLine();

        if(resposta.isEmpty()){
            nivel();
        } else {
            System.exit(0);
        }
    }

    public static void nivel(){
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        double pontos = 0;
        double perda = 0;

        while (true) {

            limparTela();
            System.out.println("""
                ==== escolha a dificuldade ====
                1 - facil   = 10 tentativas
                2 - medio   = 7 tentativas
                3 - dificil = 5 tentativas
                s - sair
            """);

            String tentativa = sc.nextLine();

            if (tentativa.isEmpty()) {
                System.out.println("Digite alguma opcao!");
                continue;
            }

            char t = tentativa.charAt(0);

            if (t == '1') {
                tentativas = 10;
                pontos = 50;
                perda = 0.5;
                break;
            } else if (t == '2') {
                tentativas = 7;
                pontos = 70;
                perda = 1;
                break;
            } else if (t == '3') {
                tentativas = 5;
                pontos = 100;
                perda = 2;
                break;
            } else if (t == 's' || t == 'S') {
                System.exit(0);
            } else {
                System.out.println("Isso nao e uma opcao!");
            }
        }

        jogar(tentativas, pontos, perda);
    }

    public static void jogar(int tentativas, double pontos, double perda) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        while (tentativas > 0) {

            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.print("Digite um numero: ");

            int palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Acertou!");
                vencer(pontos);
                return;
            } else if (palpite < numeroSecreto) {
             System.out.println("O numero e maior!");
                pontos -= perda;
            } else {
               System.out.println("O numero e menor!");
                pontos -= perda;
          }

            tentativas--;
        }

        System.out.println("Voce perdeu! O numero era: " + numeroSecreto);
        System.out.println(" jogar novamente?:\n");
        String b = sc.next();
        if(b.isEmpty()) {
        inicio();
        }else{
             System.exit(0);
        }  
    }

    public static void vencer(double pontos){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========== PARABENS =========");
        System.out.println("Sua pontuacao foi: " + pontos);

        System.out.println("""
            Deseja salvar pontuacao?
            s - sim
            n - sair
        """);

        String a = sc.nextLine();

        if (!a.isEmpty()) {
            char r = a.charAt(0);

            if (r == 'n') {
                System.exit(0);
            } else if (r == 's') {
                System.out.print("Digite seu nome: ");
                String nome = sc.nextLine();
                placar(nome, pontos);
            } else {
                System.out.println("Opcao invalida!");
                vencer(pontos);
            }
        }
    }

    public static void placar(String nome, double pontos) {
        System.out.println("\n====== PLACAR ======");
        System.out.println("Jogador: " + nome);
        System.out.println("Pontos: " + pontos);

        System.out.println("\nENTER para jogar novamente\n qualquer outra tecla saira do ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        if(b.isEmpty()) {
        inicio();
        }else{
             System.exit(0);
        }    
    }

    public static void limparTela() {
        System.out.print("   "
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + "");
       
    }
}  