public class AufgabeEins {
    public static void main(String[] args) {
        long ersteZahl = 0;
        long zweiteZahl = 1;
        long Summe;

        while (zweiteZahl < 89) {
            Summe = ersteZahl + zweiteZahl;
            ersteZahl = zweiteZahl;
            zweiteZahl = Summe;
        }

        for (int i = 0; i <= 40; i++) {
            System.out.println(i + ": " + zweiteZahl);
            Summe = ersteZahl + zweiteZahl;
            ersteZahl = zweiteZahl;
            zweiteZahl = Summe;
        }
    }
}
