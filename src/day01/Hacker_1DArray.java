package day01;

import java.util.Scanner;

public class Hacker_1DArray {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int [] a = new int[n];
            int count = 0;
            while(scan.hasNext())
            {
                a[count] = scan.nextInt();
                count++;
            }


            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

        }
}
