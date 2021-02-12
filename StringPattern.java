/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpattern;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class StringPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        int length=word.length();
        int middleChar=length/2;
        int temp;
        for(int i=0;i<word.length();i++)
        {
            for(int j=word.length();j>=0;j--)
            {
                if(i<j)
                {
                    System.out.printf(" ");
                }
            }
            for(int j=middleChar;j<middleChar+i+1;j++)
            {
                temp=j;
                if(temp>=length)
                {
                    temp=temp-length;
                }
                System.out.printf("%c",word.charAt(temp));
            }
            System.out.println();
        }
    }
    
}
