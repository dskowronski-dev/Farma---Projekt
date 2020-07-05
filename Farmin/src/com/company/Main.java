package com.company;

import java.util.Scanner;
import com.company.Player;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nick, naciśnij enter i wpisz nr farmy od 1 do 6");
        String nick = scan.nextLine();
        Integer nrFarm = scan.nextInt();
        //Player.checkFarmNumber(nrFarm);
            if(Player.checkFarmNumber(nrFarm)==false)
            {
                System.out.println("Jeszcze raz podaj nr farmy: ");
                nrFarm = scan.nextInt();
            }
        Player player1 = new Player(nick, nrFarm);
        System.out.println("Witaj " + nick + "! Wybrałeś farmę nr: " + nrFarm);

            player1.menu();

    }
}
