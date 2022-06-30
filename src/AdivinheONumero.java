import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int somaTotal = 0;
        boolean controlador = true;
        while (controlador) {

            System.out.print("Digite a quantidade de numeros que deseja jogar: ");
            int quantidade = input.nextInt();
            Random random = new Random();
            int aleatorio = random.nextInt(quantidade);
            System.out.println("Tente acertar o numero aleatorio dentro da quantidade digitada " + quantidade + ", digite um numero:");
            int numerod = input.nextInt();

            if (numerod == aleatorio) {
                System.out.println("Parabens você acertou o numero ganhou 10 pontos ");
                somaTotal = +10;
            } else if (numerod == aleatorio - 1 || numerod == aleatorio + 1) {
                System.out.println("muito proximo 5 pontos ");
                somaTotal = +5;
                System.out.println(" tente novamente: ");
                int segChanche = input.nextInt();
                if (segChanche == aleatorio) {
                    System.out.println("Parabens você acertou e ganhou 10");
                } else {
                    System.out.println("Numero errado, você perdeu e zerou seus pontos ");
                }
            }
            System.out.println("Deseja continuar jogando? S/N");
            Scanner loop = new Scanner(System.in);
            String opcao = input.next();
            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Jogo encerrado");
                controlador = false;}
                System.out.println("Sua pontuação total é de: "+ somaTotal);
            }
        }
    }