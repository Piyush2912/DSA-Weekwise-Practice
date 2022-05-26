package com.company.DSA_PrepBytes._Week_1_Fundamental;

import java.io.IOException;
import java.util.Scanner;

public class _10_Clocks_and_Angels {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int h = sc.nextInt();
            int m = sc.nextInt();
            if(h<0 || m < 0 || h > 12 || m > 60){
                System.out.println(0);
            }

            if (h == 12){
                h = 0;
                if (m == 60){
                    m= 0;
                    h++;
                    if(h > 12){
                        h = h-12;
                    }
                }
            }
            int hangle = (int )(0.5 * (h * 60 + m));
            int minangle = (int) (6*m);

            int angle = Math.abs(hangle - minangle);
            angle = Math.min(360- angle,angle);
            System.out.println(angle);
        }
    }
}
