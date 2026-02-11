public class LaboSelections1A {
    public static void main(String[] args) throws Exception {
        char menuSaisi;

        System.out.print("Veuillez entrer le menu à utiliser (A/B/Q) : ");

        menuSaisi = Clavier.lireCharLn();

        if (menuSaisi == 'A' || menuSaisi == 'B' || menuSaisi == 'Q') {
        System.out.println("Vous avez entrer : " + menuSaisi);
        } else {
            System.out.print("Votre choix est invalide.");
            System.exit(0);
        }
    }
}
