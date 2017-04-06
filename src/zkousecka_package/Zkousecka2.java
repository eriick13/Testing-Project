/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkousecka_package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class Zkousecka2 {

    public int vysledek;

    public Zkousecka2() {
        System.out.println("Hello!");
        init();
    }

    public void init() {
        ArrayList<Integer> poleCisel = new ArrayList<Integer>();
        poleCisel.add(5);
        poleCisel.add(-3);
        poleCisel.add(8);
        poleCisel.add(13);
        poleCisel.add(-4);
        poleCisel.add(6);
        poleCisel.add(17);
        poleCisel.add(2);
        System.out.println(poleCisel.size());
        for (int i : poleCisel) {
            System.out.println("Výpis " + (poleCisel.indexOf(i) + 1) + " pozice: " + i);
        }

        int max = 0;
        int min = 0;

        for (int i = 0; i < poleCisel.size(); i++) {
            int a = poleCisel.get(i);
            if (i + 1 == (poleCisel.size())) {
                break;
            }
            int b = poleCisel.get(i + 1);
            if (a > b) {
                if (a > max) {
                    max = a;
                }
            } else {
                if (b > max) {
                    max = b;
                }
            }
        }
        System.out.println(max);
        System.out.println("Faktoriál je: " + spocitejFaktorial(5));
        //System.out.println(poleCisel.get(1));

//        Scanner input = new Scanner(System.in);
//        String retezec;
//        
//        int cislo = 5;
//        int cislo2 = 10;
//        vysledek = 5;
//        System.out.println(getCislo());
//
//        vysledek = secti(cislo, cislo2);
//        System.out.println(vysledek);
//
//        vysledek = deleni(cislo2, cislo);       
        /*
         System.out.print("Zvol první číslo:");
         cislo = input.nextInt();
         System.out.print("Zvol druhé číslo:");
         cislo2 = input.nextInt();        
         vysledek = vynasob(cislo, cislo2);
         System.out.println("Tvé vynásobené číslo: " + vysledek);
         */
        //System.out.println("napsals:" + cislo);
    }

    public void rekniAhoj() {
        System.out.println("Ahoj!");
    }

    public static void pozdrav() {
        System.out.println("Zdar!");
    }

    public int secti(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public int deleni(int a, int b) {
        int c;
        c = a / b;
        return c;
    }

    public int vynasob(int a, int b) {
        int c;
        c = a * b;
        return c;
    }
    
    public static int spocitejFaktorial(int number){
        int faktorial = number;
        if(number == 1) return faktorial = 1;
        if(number < 1) throw new IndexOutOfBoundsException();
        for(int i = (number -1); i > 1;i--){
            faktorial = faktorial * i;
        }        
        return faktorial;        
    }

    public int getCislo() {
        return vysledek;
    }

    public void previousStuff() {
        System.out.println("Ahoj světe!");
        int celeCisloPrvni = 200;
        float desetinneCislo = 5.3f;
        boolean pravdaNepravda = false;
        byte maleCislo = 127;
        int promenna;
        promenna = 20;
        System.out.println(promenna);
        promenna = 50;
        System.out.println(promenna);
        System.out.println(Integer.MAX_VALUE);
        System.out.println();
        System.out.println();

        float celeCislo = 15;
        float celeCislo2 = 20;
        float vyraz = celeCislo * celeCislo2 + celeCislo;

        System.out.println(celeCislo + celeCislo2);
        System.out.println(celeCislo - celeCislo2);
        System.out.println(celeCislo * celeCislo2);
        System.out.println(celeCislo / celeCislo2);
        System.out.println(celeCislo % celeCislo2);
        System.out.println(vyraz);
        System.out.println("__________________________________________");

        int promenna1 = 20;
        int promenna2 = 15;

        //if(promenna1 < promenna2) ,if(promenna1 => promenna2 !=)
        if (promenna1 == promenna2) {
            System.out.println("Promenne se rovnaji.");
        } else {
            System.out.println("Promenne se nerovnaji.");
        }

        //if(promenna1 == promenna2 || promenna1 == 20)
        //if(!(promenna1 == promenna2 || promenna1 == 20)) (negace)
        if (promenna1 == promenna2 && promenna1 == 20) {
            System.out.println("Promenne se rovnaji.");
        } else {
            System.out.println("Promenne se nerovnaji.");
        }
        System.out.println("__________________________________________");

        int pocitadlo = 0;

        while (pocitadlo < 20) {
            System.out.println("Cislo: " + pocitadlo);
            pocitadlo = pocitadlo + 1; //pocitadlo++; ++pocitadlo prefix postfix
        }

        for (int a = 0; a < 20; a++) {
            System.out.println("Cislo: " + a);
        }
        System.out.println("__________________________________________");

        int celeCislo1 = 5;
//        if (celeCislo1 == 5) {
//            System.out.println("Promenna je rovna 5.");
//        } else if (celeCislo1 == 8) {
//            System.out.println("Promenna je rovna 8.");
//        } else if (celeCislo1 == 10) {
//            System.out.println("Promenna je rovna 10.");
//        }

        switch (celeCislo1) {
            case 5:
                System.out.println("Promenna je rovna 5.");
                break;
            case 8:
                System.out.println("Promenna je rovna 8.");
                break;
            case 10:
                System.out.println("Promenna je rovna 10.");
                break;
        }
        //System.exit(0);
        System.out.println("__________________________________________");

        for (int a = 0; a < 20; a++) {
            if ((a % 2) != 0) {
                continue;
            }
            System.out.println(a);
        }
        System.out.println("__________________________________________");

//        Scanner input = new Scanner(System.in);
//        String retezec;
//        System.out.println("Zadejte retezec: ");
//        retezec = input.nextLine();
//        System.out.println("Napsal jste: " + retezec);
        System.out.println("__________________________________________");

        pozdrav();
        Zkousecka2 novaPromenna = new Zkousecka2();
        novaPromenna.rekniAhoj();

        init();

    }
}
