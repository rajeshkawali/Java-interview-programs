package com.program.exception;
public class ReturnValueFromTryCatchFinally1
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValue()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
}