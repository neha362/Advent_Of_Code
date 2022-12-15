package Advent_Of_Code.AdventOfCode2022;

import java.util.*;
import java.io.*;

public class Dec4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Java/AdventOfCode2022/Dec4.txt"));
            String x = "";
            int y, z, a;
            int oneS, oneE, twoS, twoE;
            int total = 0;
            while (input.hasNext()) {
                
                x = input.nextLine();
                y = x.indexOf("-");
                z = x.indexOf(",");
                a = x.substring(z).indexOf("-") + z;
                oneS = Integer.parseInt(x.substring(0, y));
                oneE = Integer.parseInt(x.substring(y + 1, z)); 
                twoS = Integer.parseInt(x.substring(z + 1, a));
                twoE = Integer.parseInt(x.substring(a + 1));
                //part 1: 
                /*
                if ((twoS <= one && twoE >= oneE) || (oneS <= twoS && oneE >= twoE))
                    count++;
                */
                //part 2:
                total++;
                if ((oneS < twoS && oneE < twoS) || twoS < oneS && twoE < oneS)
                    total--;
            }
            System.out.println(total);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
