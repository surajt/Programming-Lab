package com.prolab;

import java.util.*;

import com.prolab.*;
import com.prolab.knapsack.KnapSack;
import com.prolab.wordcount.WordCount;

public class Main {

    public static void main(String[] args) {
        boolean isContinue = true;
        do {
            printMenu();
            Scanner scanData = new Scanner(System.in);
            int choice = scanData.nextInt();
            switch (choice) {
                case 1:
                    caseOne();
                    break;
                case 2:
                    WordCount wc = new WordCount();
                    wc.mainApplication();

                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
    }

    public static void printMenu() {
        System.out.println("\n\n-------Welcome-------");
        System.out.println("1. KnapSack");
        System.out.println("2. Word Count");
        System.out.println("0. Quit");
        System.out.println("--------------------");
    }

    private static void caseOne() {
        System.out.println("Knap Sack Problem ");
        KnapSack ks = new KnapSack();
        ks.mainApplication();
    }
}
