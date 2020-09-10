package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        for(int i=1; i<=inp ; i++)
        {
            for(int j=1;j<=inp; j++){
                if((i+j)>inp){
                    if(j==inp)
                    {
                        System.out.print("#");
                    }
                    else {
                        System.out.print("# ");
                    }
                }else
                {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }

    }
}
