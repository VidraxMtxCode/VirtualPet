import java.util.Scanner;

public class Personatge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        System.out.print("Força: ");
        int forca = sc.nextInt();
        System.out.print("Destresa: ");
        int destresa = sc.nextInt();
        System.out.print("Constitució: ");
        int constitucio = sc.nextInt();
        System.out.print("Inteligencia: ");
        int inteligencia = sc.nextInt();
        System.out.print("Sabiduria: ");
        int sabiduria = sc.nextInt();
        System.out.print("Carisma: ");
        int carisma = sc.nextInt();

        System.out.println("--------------------------------");
        System.out.printf("| %-28s |\n", raca);
        System.out.printf("| %-28s |\n", nom);
        System.out.println("--------------------------------");
        System.out.printf("| %-26s%2d |\n", "Força", forca);
        System.out.printf("| %-26s%2d |\n", "Destresa", destresa);
        System.out.printf("| %-26s%2d |\n", "Constitució", constitucio);
        System.out.printf("| %-26s%2d |\n", "Inteligencia", inteligencia);
        System.out.printf("| %-26s%2d |\n", "Sabiduria", sabiduria);
        System.out.printf("| %-26s%2d |\n", "Carisma", carisma);
        System.out.println("--------------------------------");
    }
}