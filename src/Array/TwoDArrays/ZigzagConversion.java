package Array.TwoDArrays;

//File Created by -- > anuragbhatt
//Created On -- > 12/11/23,Sunday

public class ZigzagConversion {

    public static void main(String[] args) {

        System.out.println(convert("ABCDEFGH" , 2));
    }

    public static String convert(String s , int rows)
    {

        if (rows == 1 || s.length() == 1) {
            return s;
        }

        char[][] arr = new char[rows][s.length()];
        int flag = 0, pointer = 0;

        for (int j = 0; pointer < s.length(); ++j) {
            if (flag == 0) {
                for (int i = 0; i < rows && pointer < s.length(); ++i) {
                    arr[i][j] = s.charAt(pointer);
                    pointer++;
                }
            } else {
                int k = j;
                for (int i = rows - 2; i >= 0 && j < k + (rows - 2) && pointer < s.length(); --i) {
                    arr[i][j] = s.charAt(pointer);
                    pointer++;
                    ++j;
                }
                --j;
            }

            flag ^= 1;
        }


        StringBuilder ans = new StringBuilder(s.length());

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < s.length(); ++j) {

                if(arr[i][j] > 0)ans.append(arr[i][j]);
            }
        }

        return ans.toString();
    }
}
