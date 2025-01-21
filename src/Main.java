public class Main {
    //FONCTION
    // /////////EXO1
    public static Integer someIT(int[] tblImpaire) {
        int total  = 0;
        //BOUCLE
        for (int i = 0; i < tblImpaire.length; i++) {
            if (tblImpaire[i] % 2 != 0) {
                total += tblImpaire[i];
            }
        }
        return total;
    }

    public static String returnMotPlusLong(String[] tblMotPlusLong) {
        String motPlusLong = "";

        //BOUCLE
        for (int i = 0; i < tblMotPlusLong.length; i++) {
            if (tblMotPlusLong[i].length() > motPlusLong.length()) {
                motPlusLong = tblMotPlusLong[i];
            }
        }
        return motPlusLong;
    }

    public static void main(String[] args) {
        // /////////EXO1
        int[] tab1 = {5,7,12,5};
        int[] tab2 = {8,3,5,6};
        //AFFICHAGE
        int totalTab1 = someIT(tab1);
        int totalTab2 = someIT(tab2);

        System.out.println("EXO 1 : Nombre paire et impaire + somme");
        System.out.println(totalTab1 + totalTab2);

        // /////////EXO2
        String[] stringTab = {"Hello", "World", "fldsjnsdfdnsfn" ,"Testtest"};
        //AFFICHAGE
        String tabMotPlusLong = returnMotPlusLong(stringTab);

        System.out.println("EXO 2 : Return mot le plus long");
        System.out.println(tabMotPlusLong);
    }
}