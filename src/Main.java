public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Francesco", "Bianchi", 354, 40);
        Docente docente2 = new Docente("Lucia", "Bruno", 267, 42);

        Docente[] docenti = {docente1, docente2};

        Universita universita = new Universita(docenti);

        System.out.println(universita.etaMin());


        int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
        stampaArray(arrayNum);
        valMinMax(arrayNum);
        //sommaArray(arrayNum);
        sommaPari(arrayNum);
    }
    public static void stampaArray(int[] arrayNum) {
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Array: " + arrayNum[i]);
        }
    }
    public static void valMinMax(int[] arrayNum) {

        int valMin = arrayNum[0];
        int valMax = arrayNum[0];
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] < valMin) {
                valMin = arrayNum[i];
            }
            if (arrayNum[i] > valMax) {
                valMax = arrayNum[i];
            }
        }
        System.out.println("Valore minimi: " + valMin + " Valore massimo: " + valMax );
    }
    public static void sommaPari(int[] arrayNum) {
        int sommaPari = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (i % 2 == 0) {
                sommaPari += arrayNum[i];
            }
        }
        System.out.println("Somma numeri pari: " + sommaPari);
    }
    public static void sommaArray(int[] arrayNum) {
        int somma = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            somma += arrayNum[i];
        }
        System.out.println("Somma: " + somma);
    }
}