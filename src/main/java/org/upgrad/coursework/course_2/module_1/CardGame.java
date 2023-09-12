package org.upgrad.coursework.course_2.module_1;

/**
 * Cards game
 * Description
 * Write and design a program as per the given instructions:
 *
 * Create a class ‘Cards’ and define suitable class variables for it.
 * Create a class ‘ClassicGame’ and define suitable class variables for it.
 * The function of the class ‘ClassicGame’ name game will take two cards as input and compare them.
 * First, compare the values on the cards; the player having higher number on the card will win the game. For example, the card having the number 2 will lose to the card having the number 3.
 * If the numbers on the cards are the same, compare the suits of the two cards. The suits in order of priority are:
 * Spades > Diamond > Hearts > Clubs
 * Increase the point of the winner card by 1 and print the scores.
 *
 *
 * Input: Your program will take the following as input from the user:
 *
 * Suit of card 1 as a string
 * The number on card 1.
 * Suit of card 2 as a string
 * The number on card 2.
 *
 *
 * Output: The output will display the points of the two players.
 *
 *
 *
 * Sample Input
 *
 * hearts
 *
 * 3
 *
 * diamonds
 *
 * 4
 *
 * Sample Output
 *
 * points of player 1: 0
 *
 * points of player 2: 1
 *
 * Execution Time Limit
 * 15 seconds
 */
import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    int getSuitPriority(String suitString) {

        //Write your code here.

        return 0;
    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class CardGame {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}