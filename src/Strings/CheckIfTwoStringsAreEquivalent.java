package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 01/12/23,Friday

public class CheckIfTwoStringsAreEquivalent {

    public static void main(String[] args) {

        String[] word1 = {"ab" , "c"};
        String[] word2 = {"a" , "bc"};

        System.out.println(arrayStringsAreEqual(word1 , word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1 , String[] word2)
    {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (String s : word1) {
            a.append(s);
        }

        for (String s : word2) {
            b.append(s);
        }

        return a.compareTo(b) == 0;
    }

}
