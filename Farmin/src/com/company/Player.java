package com.company;

import java.util.Scanner;

public class Player implements Buy {

    public static Double cash = 20000.0;
    private Farm[] farm;
    private static Integer value;


    public Player(String name, Integer farmNumber){

    }



    public static boolean checkFarmNumber(Integer nrFarm){
        if (nrFarm < 0 || nrFarm > 6){
            System.out.println("Wybierz farmę od 1 do 6!");
            return false;
        } return true;
    }

    static Scanner scan = new Scanner(System.in);

    public void menu() throws Exception {
        System.out.println("Menu:"
                + "\n 1. Sprawdź stan konta."
                + "\n 2. Kup zwierzę."
                + "\n 3. Kup sadzonki."
                + "\n 4. Kup budynek."
                + "\n 5. Kup ziemię."
                + "\n 6. Koniec gry.");

        value = scan.nextInt();

        switch (value) {
            case 1:
                stanKonta();
            case 2:
                System.out.println("Podaj nazwę zwierzęta które chcesz kupić: ");
                //Animals.species = scan.nextLine();
                Animals.species = "dog";
                buy(Animals.value, Animals.species);

            case 6:
                koniecGry();

            default:
                System.out.println("Nie znalazłem odpowiedniej komendy, spróbuj jeszcze raz");

        }
        menu();
    }

    public void koniecGry(){

        System.out.println("Dziękujemy za grę!");
        System.exit(0);

    }

    private Double stanKonta() {
        System.out.println("Twój stan konta: " + cash + " zł");
        return this.cash;
    }

    @Override
    public void buy(Double price, String species) throws Exception {
        System.out.println("Kupiłeś " + species + " za " +price );
        Player.cash -= price;
    }
}
