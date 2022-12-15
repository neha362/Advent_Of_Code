package Advent_Of_Code.AdventOfCode2021;

import java.io.*;
import java.util.*;

public class Dec3 {
    public static void main(String[] args) { 
        partOne();
    }

    public static void partOne() {
        try {
            Scanner input = new Scanner(new File("C://Users/nehas/OneDrive/Desktop/Important Stuff/Programs/Java/AdventOfCode2021/Dec3.txt"));
            String binary = input.nextLine();
            int[][] counts = new int[binary.length()][2];
            while (input.hasNext()) {
                for(int i = 0; i < binary.length(); i++) {
                    if (binary.charAt(i) == '0')
                        counts[i][0]++;
                    else 
                        counts[i][1]++;
                }
                binary = input.nextLine();
            }
            int gamma = 0, epsilon = 0;
            for (int i = 0; i < binary.length(); i++) {
                if (counts[i][0] > counts[i][1])
                    epsilon += Math.pow(2, binary.length() - i - 1);
                else 
                    gamma += Math.pow(2, binary.length() - i - 1);
            }
            System.out.println(epsilon + " " + gamma + " " + epsilon * gamma);
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void partTwo() {
        try {
            ArrayList<String> nums = new ArrayList<String>();
            Scanner input = new Scanner(new File("C://Users/nehas/OneDrive/Desktop/Important Stuff/Programs/Java/AdventOfCode2021/Dec3.txt"));
            while(input.hasNext())
                nums.add(input.nextLine());
            int o2 = 0, co2 = 0;
            int zeros = 0;
            for (String i: nums) {
                if (i.charAt(0) == '0')
                    zeros++;
            }
            
            for (int i = 0; i < nums.size(); i++) {
                //if (zeros < nums.size()/2.0)
            }
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
