package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ResultsBoard board = new ResultsBoard();
        board.addStudent("Brittny", 3F);
        board.addStudent("Angela", 5F);
        board.addStudent("Susan", 5F);
        board.addStudent("Oliver", 5F);
        board.addStudent("Charley",  4.3F);
        board.addStudent("Thomas",  4.5F);
        board.addStudent("Bred",  4F);
        board.addStudent("Piter",  3F);
        board.addStudent("Oscar",  5F);

        System.out.println("имена 3-х самых успешных студентов : " + board.top3());
    }
}