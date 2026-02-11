public class LaboSelections4 {
    public static void main(String[] args) throws Exception {
        char lettreMinusculeSaisie;
        int lettrePrecedantLettreSaisie;
        int lettreSuivantLettreSaisie;

        System.out.print("Veuillez entrer une lettre minuscule : ");

        lettreMinusculeSaisie = Clavier.lireCharLn();

        if (Character.isLowerCase(lettreMinusculeSaisie)) {
            System.out.println("La lettre est valide");
            if (lettreMinusculeSaisie > 'j') {
                lettrePrecedantLettreSaisie = lettreMinusculeSaisie - 1;
                System.out.println("La lettre précédant celle saisie est : " + ((char) lettrePrecedantLettreSaisie));
            } else if (lettreMinusculeSaisie == 'j' || lettreMinusculeSaisie < 'j') {
                lettreSuivantLettreSaisie = lettreMinusculeSaisie + 1;
                System.out.println("La lettre suivant celle saisie est : " + ((char) lettreSuivantLettreSaisie));

            }
        } else {
            System.out.print("La lettre est invalide");
        }

        }
    }
