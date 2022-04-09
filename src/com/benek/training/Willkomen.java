package com.benek.training;

public class Willkomen {


    public static void main(String[] args) {
        String zmiennaA = udup(String.valueOf(mnozenie(3, 4)));
        System.out.println(zmiennaA);
        String zmiennaC = ugrzyb(String.valueOf(mnozenie(9, 9)));
        System.out.println(zmiennaC);
        String zmiennaB = zmiennaA.concat(" ".concat(ugrzyb(String.valueOf(dodawanie(6, 3)))));
        System.out.println(zmiennaB);

        System.out.println("nie pierdol");


        String zmiennaD = udup(String.valueOf(
                mnozenie((int) (Math.random()*9)+1, (int) (Math.random()*9)+1)));

        System.out.println(zmiennaD);
    }

    // (int) (Math.random()*9)+1



    // ziolo smierdzi chujem

    // zamknij ryj, tak zapisujemy adnotacje (jeden wiersz)

    /* mozna
    w ten sposob rowniez
     */

    /** ten bajer jest do
     * automatycznego generowania dokumentacji
     * i w sumie chuj wie co to znaczy */

    /*


     DD: napisac metode ktora bedzie przyjmowala gorny i dolny zakres losowanych liczb
    i zwracala losowa wartosc, uzyc tej metody do podstawiania parametrow dla ugrzybienia i udupienia

nie no, tyle to nie

   tera to tak
   3
   4
     */
    private static String udup(String doUdupienia) {
        String wynik = new String();
        wynik = "dupa".concat(doUdupienia);
        return wynik;
    }

    private static String ugrzyb(String doUgrzybienia) {
        String wynik = new String();
        wynik = "grzybek".concat(doUgrzybienia);
        return wynik;
    }

    private static int mnozenie(int mnozna, int mnoznik) {
        int result = mnozna * mnoznik;

        return result;
    }

    private static int dodawanie(int wartA, int wartB) {
        int result = wartA + wartB;

        return result;
    }
}
