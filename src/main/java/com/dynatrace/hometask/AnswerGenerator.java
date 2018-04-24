package com.dynatrace.hometask;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class AnswerGenerator {
    private static final String MAIN_QUESTION = "Answer to the Ultimate Question of Life, the Universe, and Everything";
    public static final int ANSWER = 42;

    private AnswerGenerator() {
    }


    public static String giveAnswer(String question) {
        Preconditions.checkNotNull(Strings.emptyToNull(question), "Question cant be a null!");
        if (MAIN_QUESTION.toLowerCase().equalsIgnoreCase(question)) {
            return String.valueOf(ANSWER);
        } else {
            return "I really know only " + MAIN_QUESTION;
        }
    }
}
