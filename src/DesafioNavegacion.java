public class DesafioNavegacion {
    public static void main(String[] args) {
        String textU = "Hola";
        String textDos = "Hola";

        if (textU == textDos) {
            System.out.println("Les cadenes coincideixen");
        }

        imprimirMissatgeEspecial("Benvingut a IntelliJ IDEA");
    }

    public static void imprimirMissatgeEspecial(String msg) {
        System.out.println(">>> " + msg + " <<<");
    }
}