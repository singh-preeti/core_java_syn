package com.exception.bankexample;


public class InsufficientFundsException extends Exception
{
    public InsufficientFundsException ()
    {
        super ();
    }
    public InsufficientFundsException (String msg)
    {
        super (msg);
    }
}