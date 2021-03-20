//Programmers: Jonathan Hsing, Jaten Jhawar

import java.util.ArrayList;

public class Loan{
  //instance variables 
  private int ID; 
  private double loanAmount;
  private String country;
  private int daysToFund;
  int numLenders;

  //constructor
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
  {
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }

  //accessor methods
  public int getID()
  {
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public String getCountry()
  {
    return country;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }

  //modifier methods
  public void setID(int a)
  {
    ID = a;
  }
  public void setLoanAmount(double b)
  {
    loanAmount = b;
  }
  public void setCountry(String c)
  {
    country = c;
  }
  public void setDaysToFund(int d)
  {
    daysToFund = d;
  }
  public void setNumLenders(int e)
  {
    numLenders = e;
  }

  //toString method 
  public String toString()
  {
    return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " days to fund: " + daysToFund + " num lenders: " + numLenders;
  }
}