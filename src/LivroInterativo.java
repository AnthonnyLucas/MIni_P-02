import java.util.Scanner;

public class LivroInterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando dois personagens
        Personagem personagem1 = new Personagem("Alice", 50);
        Personagem personagem2 = new Personagem("Bob", 60);

        System.out.println("Bem-vindo ao Livro Interativo!");

        // Capítulo 1: Desenvolvimento da história de Alice
        System.out.println("Capítulo 1: " + personagem1.nome);
        System.out.println("Você está em uma encruzilhada. Para onde você quer ir? (esquerda/direita)");
        String escolha1 = scanner.nextLine().toLowerCase();

        if (escolha1.equals("esquerda")) {
            personagem1.energia -= 50; // Alice perde energia ao nadar
            System.out.println("Você encontrou um rio. Você perdeu energia ao nadar. Energia restante: " + personagem1.energia);

            if (personagem1.energia <= 0) {
                System.out.println("Alice ficou esgotada. Fim.");
            } else {
                System.out.println("Você decide continuar contornando o rio.");
            }

        } else if (escolha1.equals("direita")) {
            System.out.println("Você se depara com uma caverna escura. O que você quer fazer? (entrar/voltar)");
            String escolha2 = scanner.nextLine().toLowerCase();

            if (escolha2.equals("entrar")) {
                personagem1.energia -= 40; // Alice perde energia ao encontrar o dragão
                System.out.println("Você foi queimado pelo dragão. Energia restante: " + personagem1.energia);

                if (personagem1.energia <= 0) {
                    System.out.println("Alice ficou esgotada. Fim.");
                } else {
                    System.out.println("Alice consegue escapar da caverna.");
                }

            } else if (escolha2.equals("voltar")) {
                personagem1.energia += 30; // Alice ganha energia ao encontrar o tesouro
                System.out.println("Você encontrou um mapa para um tesouro. Energia restante: " + personagem1.energia);
                System.out.println("Parabéns, você venceu!");

            } else {
                System.out.println("Escolha inválida. Fim.");
            }

        } else {
            System.out.println("Escolha inválida. Fim.");
        }

        // Capítulo 2: Desenvolvimento da história de Bob
        System.out.println("Capítulo 2: " + personagem2.nome);
        System.out.println("Você se depara com um labirinto. Qual caminho você quer seguir? (esquerda/direita)");
        String escolhaBob = scanner.nextLine().toLowerCase();

        if (escolhaBob.equals("esquerda")) {
            personagem2.energia += 25; // Bob perde energia ao seguir pela esquerda
            System.out.println("Você entrou em uma arca de tesouros e ganhou energia. Energia restante: " + personagem2.energia);

            if (personagem2.energia <= 0) {
                System.out.println("Bob ficou esgotado. Fim.");
            } else {
                System.out.println("Você encontra uma saída à esquerda.");
            }

        } else if (escolhaBob.equals("direita")) {
            personagem2.energia -= 60; // Bob perde energia ao seguir pela direita
            System.out.println("Você foi atacado por monstros. Energia restante: " + personagem2.energia);

            if (personagem2.energia <= 0) {
                System.out.println("Bob ficou esgotado. Fim.");
            } else {
                System.out.println("Você conseguiu escapar dos monstros.");
            }

        } else {
            System.out.println("Escolha inválida. Fim.");
        }

        scanner.close();
    }
}