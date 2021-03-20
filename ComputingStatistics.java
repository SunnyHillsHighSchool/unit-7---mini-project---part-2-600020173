import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }
   public double avgLoan(){
     double average = this.totalAmount() / data.size();
     return average;
   }

   //statsitics
  
public double largestLoan(){
  //create int = 0
  double large = 0;
  //for each loop
  for(Loan x: data){
    //if loan at x is greater than int
    if(x.getLoanAmount() > large){
      //set equal
      large = x.getLoanAmount();
    }
  }

  //return large
  return large;
}

public double smallestLoan(){
  //create int as first loan
  double small = data.get(0).getLoanAmount();
  //for each loop
  for(Loan x: data){
    //if loan at x is less than
    if(x.getLoanAmount() < small){
      small = x.getLoanAmount();
    }
  }

  //return small
  return small;
}

public String largestLoanCountry(){
  //create int 
  int index = 0;
  //create double
  double large = 0;
  //for loop
  for(int x = 0; x < data.size(); x++){
    //if value at x is greater than double
    if(data.get(x).getLoanAmount() > large){
      //set value at x for double
      large = data.get(x).getLoanAmount();
      //set int at x
      index = x;
    }
  }

  //set String country as country at data index
  String country = data.get(index).getCountry();

  //return country
  return country;
}

public String smallestLoanCountry(){
  //create int
  int index = 0;
  //create double
  double small = data.get(0).getLoanAmount();
  //for loop
  for(int x = 0; x < data.size(); x++){
    //if value at x is lesser than smallest
    if(data.get(x).getLoanAmount() < small){
      //set value at x for smallest
      small = data.get(x).getLoanAmount();
      //set index at x
      index = x;
    }
  }

  //set String country as country at data index
  String country = data.get(index).getCountry();

  //return country
  return country;
}

public double avgDaysToFund(){
  //create double 
  double total = 0;
  //for each loop 
  for(Loan x: data){
    //add days
    total = total + x.getDaysToFund();
  }

  //return average
  return total/data.size();
}

public double largestLoanKenya(){
  double large = 0;
  for(Loan x: data){
    if(x.getCountry().equals("Kenya")){
      if(x.getLoanAmount() > large){
        large = x.getLoanAmount();
      }

    }
  }

  //return largest
  return large;
}

public double avgLoanPhilippines(){
  double total = 0;
  int loanCount = 0;
  for(Loan i:data){
    if(i.getCountry().equals("Philippines")){
      total += i.getLoanAmount();
      loanCount++;
    }
  }
  if(loanCount == 0){
    return 0;
  }
  return (double)total/loanCount;
}

public String longestToFundCountry(){
  int longest = Integer.MIN_VALUE;
  Loan longestLoan = data.get(0);
  for(Loan i:data){
    if(i.getDaysToFund() > longest){
      longest = i.getDaysToFund();
      longestLoan = i;
    }
  }
  return longestLoan.getCountry();
}

public double variance(){
  double sum = 0.0;
  for(Loan i:data){
    sum += Math.pow(i.getLoanAmount() - this.avgLoan(), 2);
  }
  return (double)sum/data.size(); 
  }
  public double standardDeviation(){
    return Math.sqrt(this.variance());
  }
}
