package com.dynatrace.hometask;

import org.junit.Assert;
import org.junit.Test;

public class AnswerGeneratorTest {


    private static final String EXPECTED = "42";

    @Test
    public void test_that_answer_is_42(){
        String actualAnswer = AnswerGenerator.giveAnswer("answer to the ultimate question of life, the universe, and Everything");
        Assert.assertEquals(actualAnswer, EXPECTED);


    }

    @Test
    public void test_another_question(){
        String s = AnswerGenerator.giveAnswer("What time is it now?");
        Assert.assertNotEquals(s, EXPECTED);
    }


    @Test(expected = NullPointerException.class)
    public void test_null_question(){
        AnswerGenerator.giveAnswer(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_empty_question(){
        AnswerGenerator.giveAnswer("");
    }


}