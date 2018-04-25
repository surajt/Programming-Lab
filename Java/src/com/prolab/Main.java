package com.prolab;

import java.util.*;

import com.prolab.*;
import com.prolab.duplicate.DuplicateData;
import com.prolab.knapsack.KnapSack;
import com.prolab.wordcount.WordCount;

public class Main {

    public static void main(String[] args) {
        boolean isContinue = true;
        printMenu();
        do {
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
                case 3:
                    DuplicateData.mainApplication();
                    break;
                case 0:
                    isContinue = false;
                    break;
                case 100:
                default:
                    printMenu();
                    break;
            }
        } while (isContinue);
    }

    public static void printMenu() {
        System.out.println("\n\n-------Welcome-------");
        System.out.println("1. KnapSack");
        System.out.println("2. Word Count");
        System.out.println("3. Duplicate String");
        System.out.println("0. Quit");
        System.out.println("100. Display Menu");
        System.out.println("--------------------");
    }

    private static void caseOne() {
        System.out.println("Knap Sack Problem ");
        KnapSack ks = new KnapSack();
        ks.mainApplication();
    }
}
