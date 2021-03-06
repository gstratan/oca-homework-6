package com.sckeedoo.certification;

import java.util.Scanner;

public class Problem2 {

    static class Player {
        String name;
        int age;
        int points;
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding John
        players[0] = new Player();
        players[0].name = "John";
        players[0].age = 17;
        players[0].points = 2000000;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding Maria
        players[2] = new Player();
        players[2].name = "Maria";
        players[2].age = 16;
        players[2].points = 2500;

        // Adding Anna
        players[3] = new Player();
        players[3].name = "Anna";
        players[3].age = 15;
        players[3].points = 1800000;

        // Adding Igor
        players[4] = new Player();
        players[4].name = "Igor";
        players[4].age = 19;
        players[4].points = 270;

        int max = 1;
        for (int i = 0; i < players.length; i++) {
            if (players[i].points >= players[max].points) {
                max = i;
            }

        }
        System.out.println("The winner's name is " + players[max].name + ", aged " + players[max].age);
    }


}


