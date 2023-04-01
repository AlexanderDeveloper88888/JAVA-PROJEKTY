package Zajęcia;

import java.io.FileWriter;
import java.io.IOException;


public class Zadania {

    public static void main(String[] args) {
        try {
            File myBooks = new File("filebooks.txt");
            if (myBooks.createNewFile()) {
                System.out.println("File created: " + myBooks.getName());
            } catch(IOException e){
                System.out.println("Error");
            }
            String[] book = {"bookone", "booktwo", "bookthree"};
            for (String i : book) {
                System.out.println(i);
            }

        }
    }
}
