public class Main  {

   public static void main(String[] args)
   {
      //While Loop
      int i = 0;
    
      while(i < 5)
      {
         System.out.println(i);
         i++;
      }
      
      //Do While Loop
      int y = 0;
      
      do {
         System.out.println(y);
         y++;
      }
	  while(y < 5);
      
      //For Loop
      
      for(int z = 0; z < 7; z++) {
         System.out.println(z);
      
      }
      
      
      for(int x = 100; x >= 0; x = x-3) {
         System.out.println(x);
      }
      
      //Nested Loops
      for(int a = 0; a<10; a++){
         System.out.print("\n");
         
         for(int b=0; b<10; b++){
            System.out.print("* ");
         }
      
      }
      
      //For-Each Loop
      String[] cars = {"Opel","Volvo","Mercedes","BMW","Audi","Seat"};
      for(String c : cars)
      {
      	System.out.println(c);
      }
      
      String[] myFriends = {"Ridvan","Nisa","Ahmet","Cagri","Merve","Oguzhan"};
      
      for(String d : myFriends)
      {
         System.out.println("My friend name is " +d);
      }
      
   }

}