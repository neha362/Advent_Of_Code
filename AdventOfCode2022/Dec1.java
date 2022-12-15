package Advent_Of_Code.AdventOfCode2022;

import java.util.*;
import java.io.*;

public class Dec1 {
    public static void main(String[] args){
        long[] highest = new long[3];
        try{
            Scanner input = new Scanner(new File("Java/AdventOfCode2022/Dec1.txt"));
            long current = 0;
            do {
                String x = input.nextLine();
                if (x.isBlank()) {
                    findHighest(highest, current);
                    current = 0;
                }
                else
                    current += Long.parseLong(x);
            } while (input.hasNext());
            findHighest(highest, current);
            input.close();
             //204837 total calories
            System.out.println(highest[0] + " + " + highest[1] + " + " + highest[2] + " = " + (highest[0] + highest[1] + highest[2]));
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static long[] findHighest(long[] highest, long current) {
        if (current >= highest[2])
            highest[2] = current;
        if (current >= highest[1]) {
            highest[2] = highest[1];
            highest[1] = current;
        }
        if (current >= highest[0]) {
            highest[1] = highest[0];
            highest[0] = current;
        }
        return highest;
    }
}
