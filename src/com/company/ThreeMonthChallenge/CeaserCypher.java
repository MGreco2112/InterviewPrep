package com.company.ThreeMonthChallenge;

public class CeaserCypher {
    public static String caesarCipher(String s, int k) {
        String output = "";

        for (int i = 0; i < s.length(); i++) {
            //65 - 90
            //97 - 122

            char letter = s.charAt(i);

            if (letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122) {
                int letterCode = letter;

                letterCode += k % 26;

                //determine volume of overflow, then add that to start of sequence

                //capital letters
//                if (letterCode > 90 && letterCode < 97) {
//
//
//                    letterCode = 64 - (90 - letterCode);
//                    //lowercase letters
//                } else if (letterCode > 122) {
//
//                    letterCode = 96 - (122 - letterCode);
//                }


                while (letterCode > 90 && letterCode < 97) {
                    letterCode = 64 - (90 - letterCode);
                }

                while (letterCode > 122) {
                    System.out.println(letterCode);
                    letterCode = 96 - (122 - letterCode);

                }

                System.out.println((char) letterCode);


                output += (char) letterCode;

            } else {
                output += letter;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
        System.out.println("!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E");
    }
}
