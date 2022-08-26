package com.company.ThreeMonthChallenge;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public final static int FAILING_GRADE = 38;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> modifiedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade < FAILING_GRADE) {
                modifiedGrades.add(grade);
            } else if ((grade + 1) % 5 == 0 || (grade + 2) % 5 == 0 ){
                modifiedGrades.add(
                        (grade + 1) % 5 == 0
                                ? grade + 1
                                : grade + 2);

            } else {
                modifiedGrades.add(grade);
            }
        }

        return modifiedGrades;
    }
}
