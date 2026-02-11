public class LaboSelections2 {
    public static void main(String[] args) throws Exception {
        int nombreEntierSaisi;

        boolean nombreSaisiPair;
        boolean nombreSaisiMultipleDe10;
        int chiffresDansNombreSaisi;

        System.out.print("Veuillez entrer un nombre entier : ");

        nombreEntierSaisi = Clavier.lireInt();

        if (nombreEntierSaisi < 0) {
            System.out.print("Nombre refusé! ");
            System.exit(0);
        } else {
            nombreSaisiPair = nombreEntierSaisi % 2 == 0;
            nombreSaisiMultipleDe10 = nombreEntierSaisi % 10 == 0;
            chiffresDansNombreSaisi = Integer.toString(nombreEntierSaisi).length();

            System.out.println((nombreSaisiPair == true) ? "Le nombre saisi est pair" : "Le nombre saisi est impair");

            if (nombreSaisiMultipleDe10) {
                System.out.println("Le nombre saisi est un multiple de 10");
            }

            System.out.println("Le nombre saisi a " + chiffresDansNombreSaisi + " chiffres");

        }
    }
}
