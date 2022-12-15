package Advent_Of_Code.AdventOfCode2022;

import java.io.*;
import java.util.*;

public class Dec3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Java/AdventOfCode2022/Dec3.txt"));
            String x = "", y = "", z = "";
            char repeat = 'a';
            int total = 0;
            while (input.hasNext()) {
                /* 
                part 1: 
                x = input.next(); 
                for(int i = 0; i < x.length()/2; i++) {
                    if (x.substring(x.length()/2).contains(x.charAt(i) + ""))
                        repeat = x.charAt(i);
                }
                */
                //part 2:
                x = input.next();
                if (input.hasNext())
                    y = input.next();
                if (input.hasNext())
                    z = input.next();
                for(char i: x.toCharArray()) {
                    if (y.contains(i + "") && z.contains(i + ""))
                        repeat = i;
                }
                
                System.out.println("" + repeat);
                if (Character.isLowerCase(repeat))
                    total += repeat - 96;
                else 
                    total += repeat - 38;
            }
            System.out.println(total);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
