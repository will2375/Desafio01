import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros que deseja jogar: ");
        int quantidade = input.nextInt();
        Random random = new Random();
        int aleatorio = random.nextInt(quantidade);
        System.out.println("Tente acertar o numero aleatorio dentro da quantidade digitada " + quantidade + ", digite um numero:");
        int numerod = input.nextInt();

        if (numerod == aleatorio) {
            System.out.println("Parabens você acertou o numero ganhou 10 pontos ");

        } else if (numerod == aleatorio - 1 || numerod == aleatorio + 1) {
            System.out.println("muito proximo 5 pontos ");
            System.out.println(" tente novamente: ");
            int segChanche = input.nextInt();
            if (segChanche == aleatorio) {
                System.out.println("Parabens você acertou e acomulou 15 pontos");
            } else {
                System.out.println("Numero errado, você perdeu e zerou seus pontos ");
            }
        }

    }
}
