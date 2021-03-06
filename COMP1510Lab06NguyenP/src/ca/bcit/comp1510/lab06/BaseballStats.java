package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink
 * @author Phuong Nguyen
 * @version 2.0
 */
public class BaseballStats {
    
    /*
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     */
    /** Drive BaseballStats programs.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        
        Scanner scan = new Scanner(System.in);

        String nextChar;
        
        //TODO Read and process each line of the file
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        //Read and process each line of the file
        while (fileScan.hasNext()) {
            int countHits = 0;
            int countOuts = 0;
            int countWalks = 0;
            int countSacr = 0;
            double battingAverage;
            
            fileName = fileScan.nextLine();
            System.out.println("File Name: " + fileName);
            
            lineScan = new Scanner(fileName);
            lineScan.useDelimiter(",");
            
            //Print each part of the file name and count how many 
            //(separately) the number of hits, outs, walks, and sacrifices.
            while (lineScan.hasNext()) {
                nextChar = lineScan.next();
                System.out.println(nextChar);
                if (nextChar.equals("h")) {
                    countHits++;
                } else if (nextChar.equals("o")) {
                    countOuts++;
                } else if (nextChar.equals("w")) {
                    countWalks++;
                } else if (nextChar.equals("s")) {
                    countSacr++;
                }
            }
            
            //The batting average is the number of hits divided 
            //by the total number of hits and outs.
            battingAverage = (double) countHits / (countHits + countOuts);
            
            System.out.println("Number of hits: " + countHits);
            System.out.println("Number of hits: " + countOuts);
            System.out.println("Number of hits: " + countWalks);
            System.out.println("Number of hits: " + countSacr);
            System.out.println("Average of hits: " + battingAverage);
            System.out.println();
        }
        
        scan.close();
        fileScan.close();        
    }
}
