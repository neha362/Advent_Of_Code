package Advent_Of_Code.AdventOfCode2021;

import java.io.*;
import java.util.*;

public class Dec1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Java/AdventOfCode2021/Dec1.txt"));
            //part 1: 
            //int current = 0, previous = 0, count = 0;
            //current = input.nextInt();
            //part 2: 
            int count = 0;
            int[] val = new int[4];
            for(int i = 0; i < 4; i++)
                val[i] = input.nextInt();
            while (input.hasNext()) {
                /*
                part 1:
                previous = current;
                current = input.nextInt();
                if (current > previous)
                    count++;
                 */
                //part 2:
                if (val[3] > val[0])
                    count++;
                val[0] = val[1];
                val[1] = val[2];
                val[2] = val[3];
                val[3] = input.nextInt();
            }
            if (val[3] > val[0])
                count++;
            System.out.println(count);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
