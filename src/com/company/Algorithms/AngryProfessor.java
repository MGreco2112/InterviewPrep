package com.company.Algorithms;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        final int LATE = 0;

        int lateStudentCount = a.size();

        for (Integer student : a) {
            if (student > LATE) {
                lateStudentCount--;
            }

        }

        if (lateStudentCount < k) {
            return "YES";
        }

        return "NO";

        //Richie's Approach onTimeAttempt

        //     int onTimeCount = 0;

        //     for (Integer student : a) {
        //         if (student <= LATE) {
        //             onTimeCount++;
        //         }

        //     }

        //     if (onTimeCount < k) {
        //         return "YES";
        //     }

        //     return "NO";
    }

}

