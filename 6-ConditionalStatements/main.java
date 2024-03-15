public class Main {

	public static void main(String[] args){
    
       //if - else 
       if(20 > 18){
    
       System.out.println("20 is greater than 18");
    
       }
	
       int x = 20;
    
       double y = 20.0d;
    
       if(x == y){
          System.out.println("x is equal to y");
    
       }
       
       else {
          System.out.println("x is not equal to y");
       
       }
       
       int number = 7;
       
       if(number > 8){
          System.out.println("number is greater than 8");
       
       }
       
       else if(number < 6) {
          System.out.println("number is less than 6");
       
       }
       
       else {
          System.out.println("Number is equal to 7");
       
       }
       
       //Ternary Operator
       
       String result = (false == true) ? "true" : "false";
       
       System.out.println(result);
       
       //Switch
       
       int day = 2;
       
       switch (day) {
       
          case 1:
             System.out.println("Monday");
             break;
          case 2:
             System.out.println("Tuesday");
             break;
          case 3:
             System.out.println("Wednesday");
             break;
          case 4:   
             System.out.println("Thursday");
             break;
          case 5:
          	 System.out.println("Friday"); 	
             break;
          case 6:   
             System.out.println("Saturday");
             break;
          case 7:
             System.out.println("Sunday");
             break;
             
          default:
          	 System.out.println("I'm waiting for Weekend");
       
       }
    
    }
}