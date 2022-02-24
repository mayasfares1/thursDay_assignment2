class Main{
  public static boolean happy = true;

public static void main(String [] args) {
  
  System.out.println(getSum(25,45));
  System.out.println(getString("Hello"));
  
  


   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
}



public static boolean iAmHappy()
{
if(happy){

}

  return true;
}

  public static int getSum(int num1, int num2)
  {
    return num1+num2;
  }


  public static String getString (String him)
  {
    return him.toUpperCase();
  }

  public static String getStringfirst (String her)
}