package com.tit.regex.basicproblems.extractallcapitalizedwordsfromsentence;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingExtractAllCapitalizedWordsfromSentence
{
    @Test
    public void Test(){
        String expected= Extract.extractCapitalizedWords("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");
        String result="[The, Eiffel, Tower, Paris, Statue, Liberty, New, York]";
        assertEquals(expected,result);
        System.out.println("Test is successful");
    }

}
