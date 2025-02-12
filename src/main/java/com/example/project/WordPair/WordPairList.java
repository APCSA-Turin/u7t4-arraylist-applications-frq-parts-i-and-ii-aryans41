package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) { 
        allPairs = new ArrayList<WordPair>(); 
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
               WordPair pair = new WordPair(words[i], words[j]);
               allPairs.add(pair);
            }
        }
    }
    

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches(){
        int totalMatches = 0; 
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
                  totalMatches++;
              }
        }
        return totalMatches;
   }
   
    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
