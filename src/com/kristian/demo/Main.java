package com.kristian.demo;

public class Main {


    public static void main(String[] args) {


        int x = 15;
        int y = 10;
        System.out.println(x + y);

        // Fick svar: 25


        int[] scores = {0, 50, 100};
        System.out.println(scores[0]);

        //Fick svar: 0

        String Kristian = "Kristian";
        String Anton = "Anton";
        System.out.println(Kristian + Anton);

        //Fick svar: KristianAnton

        // Ändrat till "private" istället för public på psvm men inget händer (kod går inte att köra)
        // Tog bort "static" från psvm men inget händer (kod går inte att köra)


        int number = 22;
        int Number = 33;
        System.out.println(number + Number);

        // Det funkar, den summerar båda talen och det blir 55.

    }
}
