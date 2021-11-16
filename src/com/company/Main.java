package com.company;
import java.util.Scanner;

class Program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        for(int x=1; x<=3; x++)
        {
            amount = (int) (amount-(amount*0.1));
        }
        System.out.println(amount);
    }
}