public class Main {
    //FONCTION
    public static Integer SomeIT(int[] tblImpaire) {
        int total  = 0;
        //BOUCLE
        for (int i = 0; i < tblImpaire.length; i++) {
            if (tblImpaire[i] % 2 != 0) {
                total += tblImpaire[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] tab1 = {5,7,12,5};
        int[] tab2 = {8,3,5,6};
        //AFFICHAGE
        int totalTab1 = SomeIT(tab1);
        int totalTab2 = SomeIT(tab2);

        System.out.println(totalTab1 + totalTab2);
    }
}