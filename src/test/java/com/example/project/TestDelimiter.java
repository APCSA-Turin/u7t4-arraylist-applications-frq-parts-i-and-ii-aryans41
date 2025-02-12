package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.example.project.Delimiter.Delimiters;

public class TestDelimiter {
    @Test
    public void testGetDelimiterListPARTA(){
        Delimiters delimitersEx1 = new Delimiters("(", ")");
        String[] tokens1 = {"(", "x + y", ")", " * 5" };
        ArrayList<String> results1 = delimitersEx1.getDelimitersList(tokens1);
        ArrayList<String> expResults1 = new ArrayList<String>(Arrays.asList("(", ")"));
        assertEquals(results1,expResults1);

        Delimiters delimitersEx2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> results2 = delimitersEx2.getDelimitersList(tokens2);
        ArrayList<String> expResults2 = new ArrayList<String>(Arrays.asList("<q>", "</q>", "</q>"));
        assertEquals(results2,expResults2);

        Delimiters  delimitersEx3 = new Delimiters("<br>","</br>");
        String[] tokens3 = {"<br>","hello","</br>","x","<br>","</br>","xx","<br>"};
        ArrayList<String> results3 = delimitersEx3.getDelimitersList(tokens3);
        ArrayList<String> expResults3 = new ArrayList<String>(Arrays.asList("<br>", "</br>", "<br>","</br>","<br>"));
        assertEquals(results3,expResults3);

    }

    @Test
    public void testIsBalanced(){
        Delimiters delimitersEx3 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList1 = delimitersEx3.getDelimitersList(tokens3);
        boolean res1 = delimitersEx3.isBalanced(delList1);
        assertEquals(res1,true);

        String[] tokens4 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> delList2 = delimitersEx3.getDelimitersList(tokens4);
        boolean res2 = delimitersEx3.isBalanced(delList2);
        assertEquals(res2,false);

        String[] tokens5 = {"</sup>"};
        ArrayList<String> delList3 = delimitersEx3.getDelimitersList(tokens5);
        boolean res3 = delimitersEx3.isBalanced(delList3);
        assertEquals(res3,false);

        String[] tokens6 = {"<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList4 = delimitersEx3.getDelimitersList(tokens6);
        boolean res4 = delimitersEx3.isBalanced(delList4);
        assertEquals(res4,false);



    }
}