package Advent_Of_Code.AdventOfCode2022;

import java.util.*;
import java.io.*;

public class Dec2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Java/AdventOfCode2022/Dec2.txt"));
            //part 1: 
            //int[][] key = {{4, 8, 3}, {1, 5, 9}, {7, 2, 6}};
            //part 2: 
            int[][] key = {{3, 4, 8}, {1, 5, 9}, {2, 6, 7}};
            int score = 0;
            String x = "";
            while(input.hasNext()) {
                x = input.nextLine();
                score += key[x.charAt(0) - 65][x.charAt(2) - 88];
            }
            System.out.println(score);
        } 

        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
