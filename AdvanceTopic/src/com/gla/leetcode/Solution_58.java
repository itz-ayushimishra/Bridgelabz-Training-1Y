package com.gla.leetcode;

public class Solution_58 {
        public int length0fLastWord(String s) {
            s = s.trim();
            int count = 0;
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }

        public static void main(String args[])
        {
            Solution_58 l1=new Solution_58();
            String word= "Hello World";
            int c= l1.length0fLastWord(word);
            System.out.println(c);
        }
    
}
