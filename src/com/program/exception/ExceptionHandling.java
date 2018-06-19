package com.program.exception;
//Defining Our own exception class by extending ArithmeticException class

import java.util.Scanner;

class InvalidWithdrawlMoneyException extends ArithmeticException
{
    //Overriding toString() method of ArithmeticException as per our needs
    @Override
    public String toString()
    {
        return "You don't have that much of money in your account";
    }
}

//Using above customized ArithmeticException
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int balance = 5000;            //Initializing the balance
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
        System.out.println("Enter Withdrawl Money");
        int withdrawlMoney = sc.nextInt();      //taking input from the user
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
            if(withdrawlMoney > balance)
            {
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
            System.out.println(ex);
        }
    }
}