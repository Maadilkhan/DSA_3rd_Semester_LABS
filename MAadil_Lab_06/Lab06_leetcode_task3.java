/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06_leetcode_task3;

/**
 *
 * @author User
 */
public class Lab06_leetcode_task3 {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        
        for (char c : s.toCharArray()) {
            result ^= c;  
        }
        
        for (char c : t.toCharArray()) {
            result ^= c;          }
        
        return result;
    }

  public static void main(String[] args) {
       Lab06_leetcode_task3 solution = new Lab06_leetcode_task3();
        String s = "abcd";
        String t = "abcde";

        char result = solution.findTheDifference(s, t);
        System.out.println("The added letter is: " + result);
    }
}
