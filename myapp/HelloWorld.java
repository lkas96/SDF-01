package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Console console = System.console();

    //     //BASIC KEYBOARD INPUT
    //     String name = console.readLine("What is your name?");
    //     System.out.println("Your name is " + name);
    //     System.out.printf("Your name... %s \n", name); //AlTERNATIVE PRINT FORMAT

    //     //IF ELSE STATEMENTS
    //     String sport = console.readLine("What is your favorite sport?");
    //     if (sport.toUpperCase().equals("SWIMMING")){
    //         //If user favorite sport = swimming
    //         //This if statement is true and prints line
    //         System.out.println("Oh, I hate swimming!");
    //     } else if (sport.toLowerCase().equals("basketball")){
    //         //If user says basketball prints
    //         System.out.println("Balls to you...");
    //     } else {
    //         System.out.println("Omg same girl same, we like the same sports! or nothing LMAO");
    //     }

    //     //REPLACE A CHARACTER IN A STRING VARIABLE
    //     String replaceName = name.replace('a', 'e');
    //     System.out.printf("you got your name wrong, it is spelt with an e... %s\n", replaceName);

    //     //SWITCH CASE EXAMPLE
    //     String valueString = console.readLine("What marks do you hope to score for SDF? From 0 - 100 : ");
    //     Integer score = Integer.parseInt(valueString); //Converting string to a score

    //     //IF COMPARE MULTIPLE CASES LIKE A RANGE, CASE99.....CASE90 then print the line and break
    //     //In this case, using if statement would be better, can put a range of the score instead. 
    //     switch (score) {
    //         case 100:
    //         System.out.println("Perfect score lah, confirm cheat right!");
    //         break;

    //         case 99:
    //         case 98:
    //         case 97:
    //         case 96:
    //         case 95:
    //         case 94:
    //         case 93:
    //         case 92:
    //         case 91:
    //         case 90:
    //             System.out.println("You scored A, good, A for Asian. Bare minimum you have to score.");
    //         break;

    //         default:
    //             System.out.println("No score? Is you dumb. Fail bodoh!");
    //     }

        
    //     //WHILE LOOP EXAMPLE
    //     Integer i = 0;
    //     while (i < score){
    //         System.out.println(i + ",");
    //         i++;
    //         //This will print value of i, starting from zero
    //         //+1 to the value of i after printing
    //         //Continue printing the line until it satisfies i<score
    //     }

    //     //DO WHILE LOOP
    //     //SIMILAR TO WHILE
    //     //BUT IN THIS CASE PRINTS FIRST
    //     //IN THIS CASE, THIS EXAMPLE WILL NOT RUN, COMMENT OUT THE ABOVE WHILE LOOP TO TEST
    //     do {
    //         System.out.println(i + ",");
    //         i++;
    //     } while( i < score);
        


    //     //ARRAY EXAMPLE
    //     String[] fruits = new String[5]; //AN ARRAY FOR 5 ITEMS ONLY

    //     for (int x = 0; x < fruits.length ; x++){
    //         String fruitName = console.readLine("Think of a fruit : ");
    //         fruits[x] = fruitName;
    //     }

    //     for (String fruitIndex : fruits)
    //     System.out.println(fruitIndex);
    // }

    // if (args.length > 0){
    //     String[] names = new String[5];
        
    //     int x = 0;
    //     while (x < args.length) {
    //         names[x] = args [x];
    //         x++;
    //         if (x >= 4) {
    //             break;
    //         }
    //     }

    //     for (int y = 0; y < names.length; y++){
    //         System.out.printf("Name[%i]: %s/n", y, names[y]);
    //     }

    // } else {
    //     System.out.println("No arguments passed");
    // }




    List<String> names = new ArrayList<>();
    String input = "";
    do {
        input = console.readLine("Enter a name: ");
        if(!input.equals("quit")) {
            names.add(input);
        }
    } while (!input.equals("quit"));

    //print names
    for (String name: names) {
        System.out.println(name);
    }
    
}}

