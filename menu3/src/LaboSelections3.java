public class LaboSelections3 {
    public static void main(String[] args) throws Exception {
        int nombreEntier1;
        int nombreEntier2;
        int premierPlusGrandMultipleDe5DuNombre;
        int deuxiemePlusGrandMultipleDe5DuNombre;

        System.out.print("Veuillez entrer un nombre entier positif : ");

        nombreEntier1 = Clavier.lireInt();

        if (nombreEntier1 % 5 == 0  && nombreEntier1 >= 15) {
            premierPlusGrandMultipleDe5DuNombre = nombreEntier1 - 10;
            deuxiemePlusGrandMultipleDe5DuNombre = nombreEntier1 - 5;

            System.out.println("Les 3 plus grands multiples de 5 de " + nombreEntier1 + " sont : " + premierPlusGrandMultipleDe5DuNombre + ", " + deuxiemePlusGrandMultipleDe5DuNombre + ", " + nombreEntier1);
        } else {
            System.out.print("Veuillez entrer un autre nombre entier : ");
            
            nombreEntier2 = Clavier.lireInt();

            if (nombreEntier1 % 2 == 0 || nombreEntier2 % 2 == 0) {
                System.out.println("La somme des deux nombres est : " + (nombreEntier1 + nombreEntier2));
            } else {
                System.out.println("Le produit des deux nombres est : " + (nombreEntier1 * nombreEntier2));
            }
        }
    }
}
