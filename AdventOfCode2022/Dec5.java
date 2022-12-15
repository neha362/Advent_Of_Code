package Advent_Of_Code.AdventOfCode2022;

import java.util.*;
import java.io.*;
public class Dec5 {
    public static void main(String[] args) {
        ArrayList<LinkedList<Character>> lists = new ArrayList<LinkedList<Character>>();
        LinkedList<Character> interim = new LinkedList<Character>();
        for(int i = 0; i < 9; i++)
            lists.add(new LinkedList<Character>());
        try {
            Scanner input = new Scanner(new File("Java/AdventOfCode2022/Dec5.txt"));
            String x = "";
            for(int j = 0; j < 8; j++) {
                x = input.nextLine();
                for(int i = 0; i < x.length(); i += 4) {
                	if (x.charAt(i + 1) != ' ')
                		lists.get(i/4).addFirst(x.charAt(i + 1));
                }
            }
            input.nextLine();
            input.nextLine();
            int times = 0, start = 0, end = 0;
            while(input.hasNext()) {
                x = input.nextLine(); 
                times = Integer.parseInt(x.substring(5, x.indexOf("from") - 1));
                start = Integer.parseInt(x.substring(x.indexOf("from") + 5, x.indexOf("to") - 1));
                end = Integer.parseInt(x.substring(x.indexOf("to") + 3));
                System.out.println(times + " " + start + " " + end);
                /*
                 part 1: 
                 for(int i = 0; i < times; i++)
                 	lists.get(end - 1).add(lists.get(start - 1).removeLast());
                 */
                //part 2: 
                for(int i = 0; i < times; i++)
                	interim.addFirst(lists.get(start - 1).removeLast());
                for(Character i: interim)
                	lists.get(end - 1).add(i);
                interim.clear();
            }
            input.close();
            for(LinkedList<Character> i: lists)
                System.out.print(i.getLast());
            System.out.println();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
