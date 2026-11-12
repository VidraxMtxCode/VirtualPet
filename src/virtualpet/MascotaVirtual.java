package virtualpet;

import java.util.Random;

public class MascotaVirtual {

    // Constants: valors límit dels atributs
    final int MINIM = 0;
    final int MAXIM = 100;

    // Atributs de la mascota
    String nom;
    String tipus;   // "gos", "gat" o "dummy"
    int energia;
    int higiene;
    int pes;
    int anim;

    // Constructor: es crida quan fem "new MascotaVirtual(...)"
    public MascotaVirtual(String nom, String tipus) {
        this.nom = nom;
        this.tipus = tipus;

        if (tipus.equals("dummy")) {
            // El dummy comença amb tot a 100
            energia = 100;
            higiene = 100;
            pes = 100;
            anim = 100;
        } else {
            // Gos o gat: valor aleatori entre 40 i 60
            // nextInt(21) dona un número de 0 a 20 -> 40 + (0..20) = 40..60
            Random aleatori = new Random();
            energia = 40 + aleatori.nextInt(21);
            higiene = 40 + aleatori.nextInt(21);
            pes = 40 + aleatori.nextInt(21);
            anim = 40 + aleatori.nextInt(21);
        }
    }

    // 1. Dormir
    public void dormir() {
        if (tipus.equals("gos")) {
            energia += 25;
        } else {
            energia += 20;
        }
        anim += 10;
    }

    // 2. Jugar
    public void jugar() {
        energia -= 20;
        anim += 20;
        pes -= 10;
    }

    // 3. Menjar
    public void menjar() {
        energia += 10;
        higiene -= 15;
        pes += 10;
    }

    // 4. Dutxar
    public void dutxar() {
        if (tipus.equals("gos")) {
            energia -= 10;
            higiene += 25;
            anim -= 15;
        } else {
            energia -= 5;
            higiene += 25;
            anim += 5;
        }
    }

    // 5. Rebre un cop (s'utilitza a l'atac, tant per la mascota com pel dummy)
    public void rebreCop() {
        energia -= 3;
        higiene -= 3;
        anim -= 3;
    }

    // Comprova si la mascota ha mort: algun atribut a 0 o menys, o per sobre de 100
    public boolean haMort() {
        return energia <= MINIM || energia > MAXIM
                || higiene <= MINIM || higiene > MAXIM
                || pes <= MINIM || pes > MAXIM
                || anim <= MINIM || anim > MAXIM;
    }

    // Imprimeix l'estat actual
    public void mostrarEstat() {
        System.out.println("\n--- " + nom + " (" + tipus + ") ---");
        System.out.println("Energia: " + energia);
        System.out.println("Higiene: " + higiene);
        System.out.println("Pes: " + pes);
        System.out.println("Ànim: " + anim);
    }
}
