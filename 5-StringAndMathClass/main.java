public class Main {
  public static void main(String[] args) {
    String testVariable = "Hi World:)";
    
    System.out.println(testVariable);
    
    String myFullName = "Dogukan Koc";
    
    System.out.println(myFullName);
    
    System.out.println("Text lenght = " + myFullName.length());
    
    String message = "Hello World! I'm Dogukan KOC";
    
    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());
    
    System.out.println("this message is a test message".toUpperCase());
    
    System.out.println(message.indexOf("world"));
    System.out.println(message.indexOf("World"));
    
    String firstName = "Dogukan ";
    
    String lastName = "Koc";
    
    
    System.out.println(firstName + lastName);
    
    //or 
    // I think + operator more simple than concat method
    
    System.out.println(firstName.concat(lastName));
    
    String x = "10";
    
    String y = "20";
    
    System.out.println(x+y);
    
    int z = 50;
    
    System.out.println(y+z); //?
    
    String txt = "Hello\nWorld!";
    System.out.println(txt);
    
    //Math Class
    
    System.out.println(Math.max(5,10));
    
    System.out.println(Math.min(77,107));
    
    System.out.println(Math.sqrt(55));
    System.out.println(Math.sqrt(64));
	
    System.out.println(Math.abs(-77.33));
    System.out.println(Math.abs(45));
    
    System.out.println(Math.random());
    
    
    
    int randomNum = (int)(Math.random()*101);
    
    System.out.println(randomNum);
    
  }
}
