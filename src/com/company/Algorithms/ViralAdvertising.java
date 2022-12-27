package com.company.Algorithms;

import javax.xml.transform.Result;
import java.io.*;

public class ViralAdvertising {
    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared = 5;

        int liked = 0;

        int cumulative = 0;

        for (int i = 0; i < n; i++) {
            int floor = (int) Math.floor(shared/2);

            shared = floor * 3;

            liked = floor;

            cumulative += liked;
        }

        return cumulative;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = ViralAdvertising.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
