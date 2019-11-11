package com.company;


import java.util.LinkedList;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        long all = 60;
        Random rnd = new Random();
        LinkedList<String> chisla = new LinkedList<>();

        for (int i = 0; i < 60; i++) {
            int x = rnd.nextInt(10);
            String s = Integer.toString(x);
            chisla.add(s);
        }

        long c0 = chisla.stream().filter(e -> e.equals("0")).count();
        long c1 = chisla.stream().filter(e -> e.equals("1")).count();
        long c2 = chisla.stream().filter(e -> e.equals("2")).count();
        long c3 = chisla.stream().filter(e -> e.equals("3")).count();
        long c4 = chisla.stream().filter(e -> e.equals("4")).count();
        long c5 = chisla.stream().filter(e -> e.equals("5")).count();
        long c6 = chisla.stream().filter(e -> e.equals("6")).count();
        long c7 = chisla.stream().filter(e -> e.equals("7")).count();
        long c8 = chisla.stream().filter(e -> e.equals("8")).count();
        long c9 = chisla.stream().filter(e -> e.equals("9")).count();

        long p0 = c0 * 100 / 60;
        long p1 = c1 * 100 / 60;
        long p2 = c2 * 100 / 60;
        long p3 = c3 * 100 / 60;
        long p4 = c4 * 100 / 60;
        long p5 = c5 * 100 / 60;
        long p6 = c6 * 100 / 60;
        long p7 = c7 * 100 / 60;
        long p8 = c8 * 100 / 60;
        long p9 = c9 * 100 / 60;

        System.out.println("Kolvo " + c0 + " - " + p0 + "%");
        System.out.println("Kolvo " + c1 + " - " + p1 + "%");
        System.out.println("Kolvo " + c2 + " - " + p2 + "%");
        System.out.println("Kolvo " + c3 + " - " + p3 + "%");
        System.out.println("Kolvo " + c4 + " - " + p4 + "%");
        System.out.println("Kolvo " + c5 + " - " + p5 + "%");
        System.out.println("Kolvo " + c6 + " - " + p6 + "%");
        System.out.println("Kolvo " + c7 + " - " + p7 + "%");
        System.out.println("Kolvo " + c8 + " - " + p8 + "%");
        System.out.println("Kolvo " + c9 + " - " + p9 + "%");
    }
}
