package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        deckRevealedIncreasing(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> index = new LinkedList<Integer>();
        for (int i = 0; i < deck.length; i++) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            int x = q.poll();
            index.add(x);
            if (q.isEmpty()) break;
            q.add(q.poll());
        }
        Arrays.sort(deck);
        int[] res = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            res[index.poll()] = deck[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
