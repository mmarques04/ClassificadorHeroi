import java.util.Scanner;

public class ClassificadorHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nomeHeroi = scanner.nextLine();

        System.out.print("Digite a quantidade de XP do herói: ");
        int xpHeroi = scanner.nextInt();

        String nivelHeroi;

        if (xpHeroi < 1000) {
            nivelHeroi = "Ferro";
        } else if (xpHeroi <= 2000) {
            nivelHeroi = "Bronze";
        } else if (xpHeroi <= 5000) {
            nivelHeroi = "Prata";
        } else if (xpHeroi <= 7000) {
            nivelHeroi = "Ouro";
        } else if (xpHeroi <= 8000) {
            nivelHeroi = "Platina";
        } else if (xpHeroi <= 9000) {
            nivelHeroi = "Ascendente";
        } else if (xpHeroi <= 10000) {
            nivelHeroi = "Imortal";
        } else {
            nivelHeroi = "Radiante";
        }

        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivelHeroi);

        scanner.close();
    }
}
