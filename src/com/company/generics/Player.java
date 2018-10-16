package com.company.generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * For this question you will implement classes for a basic card game. You may assume
 * that the enums Rank and Suit exist, as defined in lectures. In addition,
 * the Rank class has the following method:
 *
 * int getPoints()
 * Returns the number of points a given Rank would score.
 *
 * a) Implement an immutable Card class with the following: (6 marks)
 * i. Two attributes: a Rank and a Suit.
 * ii. Appropriate initialization, accessor, and mutator methods.
 * iii. A compareTo method that results in Card objects being arranged in decreasing
 * order of the number of points given by the Rank; for example, if c1’s rank is
 * worth less points than c2’s, c2.compareTo(c1) should be negative.
 *
 * b) Implement a Player class with the following: (14 marks)
 * i. Two attributes: a numeric playerID, and a list of Card objects (the player’s hand)
 * ii. Appropriate initialization, accessor, and mutator methods.
 * iii. A method to add a Card to the player’s hand.
 * iv. A method to calculate the total score of the player’s hand.
 * v. A method to sort the player’s hand.
 * vi. A method to play the best Card; the best Card is the one with the highest score.
 * The Card played should be returned, and removed from the player’s hand as a result.
 */
public class Player {
    private int playerID;
    private ArrayList<Card> cardArrayList;

    public Player(int playerID){
        this.playerID = playerID;
        cardArrayList = new ArrayList<>();
    }

    public int getPlayerID(){
        return playerID;
    }

    public void addCard(Card card){
        cardArrayList.add(card);
    }

    public int calculateTotalScore(){
        int sum = 0;

        //TODO

        return sum;
    }

    public void sortCards(){
        Collections.sort(cardArrayList);
    }

    public Card playBestCard(){

        //TODO

        Card returnCard = cardArrayList.get(0);

        //TODO

        return returnCard;
    }
}
