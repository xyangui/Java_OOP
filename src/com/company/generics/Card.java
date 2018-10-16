package com.company.generics;

/**
 * Immutable: An object is immutable if none of its instance variables
 * can be changed after being initialised.
 */
public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    @Override
    public int compareTo(Card card) {
        return card.rank.getPoints() - this.rank.getPoints();
    }
}
