/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06_leetcode_task2;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab06_leetcode_task2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }
        
        
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        
        return intersection;
    }

    
    public static void main(String[] args) {
        Lab06_leetcode_task2 solution = new Lab06_leetcode_task2();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = solution.intersect(nums1, nums2);

        // Output the result
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}