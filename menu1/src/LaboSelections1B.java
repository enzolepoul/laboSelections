public class LaboSelections1B {
    public static void main(String[] args) throws Exception {
        char menuSaisi;

        System.out.print("Veuillez entrer le menu à utiliser (A/B/Q) : ");

        menuSaisi = Clavier.lireCharLn();

        switch (menuSaisi) {
            case 'A':
                System.out.println("Vous avez entrer : A");
                break;
            case 'B':
                System.out.println("Vous avez entrer : B");
                break;
            case 'Q':
                System.out.println("Vous avez entrer : Q");
                break;
            default:
                System.out.print("Votre choix est invalide.");
                break;
            }
        }
    }
