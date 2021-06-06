package oop.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int userInput;
        String month = null;

        System.out.print("Please enter the number of this month: ");
        userInput = Integer.parseInt(input.nextLine());

        switch(userInput)   {
            case(1):   {
                month = "January";
                break;
            }
            case(2):   {
                month = "February";
                break;
            }
            case(3):   {
                month = "March";
                break;
            }
            case(4):   {
                month = "April";
                break;
            }
            case (5):   {
                month = "May";
                break;
            }
            case(6):   {
                month = "June";
                break;
            }
            case(7):   {
                month = "July";
                break;
            }
            case(8):   {
                month = "August";
                break;
            }
            case(9):   {
                month = "September";
                break;
            }
            case(10):   {
                month = "October";
                break;
            }
            case(11):   {
                month = "November";
                break;
            }
            case(12):   {
                month = "December";
                break;
            }

        }
        System.out.printf("The name of this month is %s.\n", month);
    }
}