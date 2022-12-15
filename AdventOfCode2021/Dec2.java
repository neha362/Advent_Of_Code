package Advent_Of_Code.AdventOfCode2021;

import java.io.*;
import java.util.*;
public class Dec2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("C://Users/nehas/OneDrive/Desktop/Important Stuff/Programs/Java/AdventOfCode2021/Dec2.txt"));
            //part 1:
            //int depth = 0, distance = 0;
            //part 2:
            int distance = 0, depth = 0, aim = 0;
            String x = "";
            while(input.hasNext()) {
                x = input.nextLine();
                /*
                part 1: 
                if (x.substring(0, x.indexOf(" ")).equals("forward"))
                    distance += Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                else if (x.substring(0, x.indexOf(" ")).equals("down"))
                    depth += Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                else 
                    depth -= Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                */
                //part 2: 
                if (x.substring(0, x.indexOf(" ")).equals("forward")) {
                    distance += Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                    depth += aim * Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                }
                else if (x.substring(0, x.indexOf(" ")).equals("down"))
                    aim += Integer.parseInt(x.substring(x.indexOf(" ") + 1));
                else 
                    aim -= Integer.parseInt(x.substring(x.indexOf(" ") + 1));
            }
            System.out.println(depth * distance);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
