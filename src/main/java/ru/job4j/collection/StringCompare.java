package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int stringsLengthComparisonResult = Integer.compare(left.length(), right.length());
        int characterComparisonResult;

        if (stringsLengthComparisonResult <= 0) {
            for (int index = 0; index < left.length(); index++) {
                characterComparisonResult = Character.compare(left.charAt(index), right.charAt(index));
                if (characterComparisonResult != 0) {
                    return characterComparisonResult;
                }
            }
            return stringsLengthComparisonResult;
        } else {
            for (int index = 0; index < right.length(); index++) {
                characterComparisonResult = Character.compare(left.charAt(index), right.charAt(index));
                if (characterComparisonResult != 0) {
                    return characterComparisonResult;
                }
            }
            return stringsLengthComparisonResult;
        }
    }
}