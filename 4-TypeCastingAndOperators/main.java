public class Main 
{
	public static void main(String[] args)
    {
    
    	//Casting
        //Widening Casting(automatically)
    	int myIntNumber = 5;
        double myDoubleNumber = myIntNumber;
        
        
        System.out.println(myIntNumber);
        System.out.println(myDoubleNumber);
        
        //Narrowing Casting
        
        double myOtherDoubleVariable = 9.87d;
        
        int myOtherIntegerVariable = (int) myOtherDoubleVariable; //Manuel casting: double to int
        
        System.out.println(myOtherDoubleVariable);
        System.out.println(myOtherIntegerVariable);
        
        //Operators
        int a = 10;
        
        int b = a + 10;
        
        int c = a + b + 25;
        
        System.out.println("a = " + a + ", b = " +b + ", c = " +c);
        
        System.out.println(c > a);
        
        System.out.println(a == b);
        
        System.out.println(b != c);
    }

}