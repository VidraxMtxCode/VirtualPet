package virtualpet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        // 1. Demanar el tipus (es repeteix fins que sigui "gos" o "gat")
        String tipus;
        do {
            System.out.println("Vols un gos o un gat? (gos/gat):");
            tipus = teclat.nextLine().toLowerCase();
        } while (!tipus.equals("gos") && !tipus.equals("gat"));

        // 2. Demanar el nom
        System.out.println("Quin nom li vols posar?");
        String nom = teclat.nextLine();

        // 3. Crear la mascota i el dummy
        MascotaVirtual mascota = new MascotaVirtual(nom, tipus);
        MascotaVirtual dummy = new MascotaVirtual("Dummy", "dummy");

        boolean mort = false;
        int opcio = -1;

        // 4. Bucle del menú: es repeteix mentre la mascota visqui i no triem sortir
        while (!mort && opcio != 0) {
            mascota.mostrarEstat();
            System.out.println("\n1.- Dormir");
            System.out.println("2.- Jugar");
            System.out.println("3.- Menjar");
            System.out.println("4.- Dutxar");
            System.out.println("5.- Atacar el dummy");
            System.out.println("0.- Sortir");
            System.out.println("Tria una opció:");
            opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    mascota.dormir();
                    break;
                case 2:
                    mascota.jugar();
                    break;
                case 3:
                    mascota.menjar();
                    break;
                case 4:
                    mascota.dutxar();
                    break;
                case 5:
                    System.out.println("Quantes vegades vols atacar?");
                    int vegades = teclat.nextInt();
                    // Bucle de l'atac: un cop per volta
                    for (int i = 1; i <= vegades; i++) {
                        mascota.rebreCop();
                        dummy.rebreCop();
                        System.out.println("Cop " + i + " fet.");
                        // Si algú mor, parem d'atacar
                        if (mascota.haMort() || dummy.haMort()) {
                            break;
                        }
                    }
                    if (dummy.haMort()) {
                        System.out.println("El dummy s'ha trencat!");
                    }
                    break;
                case 0:
                    System.out.println("Sortint de l'aplicació...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }

            // 5. Després de cada acció, comprovem si la mascota ha mort
            mort = mascota.haMort();
        }

        // 6. Final del joc
        if (mort) {
            mascota.mostrarEstat();
            System.out.println(nom + " ha mort. Fi del joc.");
        }
    }
}
