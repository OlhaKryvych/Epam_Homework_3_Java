package com.epam;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please the number of task (1 - 5):  ");
        int input = sc.nextInt();
        switch (input)
        {
            case 1:
                int height = 1;
                while (height <= 6)
                {
                    printStars(height);
                    height++;
                }
                height = 5;
                while (height >= 1)
                {
                    printStars(height);
                    height--;
                }
                break;
            case 2:
                height = 6;
                int space = 0;
                reverseTriangle(height, space);
                break;
            case 3:
                height = 1;
                space = 6;
                rightTriangle(height, space);
                break;
            case 4:
                height = 1;
                space = 5;
                rightTriangle(height, space);
                height = 6;
                space = 0;
                reverseTriangle(height, space);
                break;
            case 5:
                height = 1;
                space = 6;
                int count = 1;
                while(count <= 2)
                {
                    while(height < 6)
                    {
                        printSymbol(space);
                        space--;
                        printStars(height + height - 1);
                        height++;
                    }
                    height = 1;
                    space = 6;
                    count++;
                }
                break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static void printSymbol(int space)
    {
        int count = 1;
        while(count <= space)
        {
            System.out.print(" ");
            count++;
        }
    }
    public static void printStars(int stars)
    {
        int count = 1;
        while (count <= stars)
        {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }
    public static void rightTriangle(int height, int space)
    {
        while(height != 6)
        {
            printSymbol(space);
            space--;
            printStars(height);
            height++;
        }
    }

    public static void reverseTriangle(int height, int space)
    {
        while (height > 0)
        {
            printSymbol(space);
            space++;
            printStars(height);
            height--;
        }
    }
}
