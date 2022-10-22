package com.company.Algorithms;

public class MarsExploration {
    public static int marsExploration(String s) {
        int output = 0;

        char[] message = {'S', 'O', 'S'};

        int messageIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != message[messageIndex]) {
                output++;
            }

            messageIndex++;

            if (messageIndex == message.length) {
                messageIndex = 0;
            }
        }

        return output;
    }
}
