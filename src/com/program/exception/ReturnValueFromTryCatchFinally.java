package com.program.exception;
public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }
 
    static String methodReturningValue()
    {
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + "return value from finally block";
        }
    }
}