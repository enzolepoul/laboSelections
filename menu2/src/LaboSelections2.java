public class LaboSelections2 {
    public static void main(String[] args) throws Exception {
        int nombreEntierSaisi;

        System.out.print("Veuillez entrer un nombre entier : ");

        nombreEntierSaisi = Clavier.lireInt();

        if (nombreEntierSaisi < 0) {
            System.out.print("Nombre refusé! ");
            System.exit(0);
        } else {
            System.out.println((nombreEntierSaisi % 2 == 0) ? "Le nombre saisi est pair" : "Le nombre saisi est impair");

            if (nombreEntierSaisi % 10 == 0) {
                System.out.println("Le nombre saisi est un multiple de 10");
            }

            System.out.println("Le nombre saisi a " + (Integer.toString(nombreEntierSaisi).length()) + " chiffres");
        }
    }
}
