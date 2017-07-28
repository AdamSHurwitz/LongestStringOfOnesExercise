import java.lang.Math;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    static String binaryString = "1011001";
    static String binaryString2 = "1101100111";

    public static void main(String[] args) {
        System.out.println("Longest String Of Ones: " + String.valueOf(printLongestConsecutiveOnes(binaryString)));

        System.out.println("Longest String of Ones Removing a Zero: " + String.valueOf(printLongestPotentialOnes(binaryString2)));
    }

    private static int printLongestConsecutiveOnes(String binaryString){

        int maxConsec = 0;
        int count = 0;

        for (int i = 0; i < binaryString.length(); i++){
            if (String.valueOf(binaryString.charAt(i)).equals("1")){
                count++;
                maxConsec = Math.max(maxConsec, count);
            } else {

                count = 0;
            }

        }

        return maxConsec;
    }

    private static int printLongestPotentialOnes(String binaryString){
        int prevCount = 0;
        int maxConsec = 0;
        int count = 0;

        for (int i = 0; i < binaryString.length(); i++){
            if (String.valueOf(binaryString.charAt(i)).equals("1")){
                count++;
                maxConsec = Math.max(maxConsec, count);
            } else {
                maxConsec = Math.max(prevCount + count, maxConsec);
                prevCount = count;
                count = 0;
            }

        }

        return maxConsec;
    }

}

