public class Main 
{

   public static void main(String[] args)
   {
	  byte myByteNumber = 127; //Byte data type range -128 +127
      System.out.println(myByteNumber);
      
      final byte readOnlyByteNumber = -55;
      System.out.println(readOnlyByteNumber);
     // readOnlyByteNumber = 27; 
     // error: cannot assign a value to final variable readOnlyByteNumber = 27;
     
     short myShortNumber = 32760; // -32768 to 32767;
     System.out.println(myShortNumber);
     
     int myIntNumber = -2147483648; //-2147483648 to 2147483647
     System.out.println(myIntNumber);
     
     long myLongNumber = -9223372036854775808L; // -9223372036854775808 to 9223372036854775807
     System.out.println(myLongNumber);
     
     float myFloatNumber = 7.789f;
     System.out.println(myFloatNumber);
     
     double myDoubleNumber = 7.789123d;
     System.out.println(myDoubleNumber);
     
     float number1 = 29e3f;
     double number2 = 11E2d;
     System.out.println(number1);
     System.out.println(number2);
     
     boolean isJavaFun = true;
     boolean isJavaLearningEasy = true;
     boolean isYourNameJohnDoe = false;
     
     System.out.println(isJavaFun + " " + isJavaLearningEasy+ " " + isYourNameJohnDoe);
     
     char myFirstCharacter = 'D';
     
     char myNote = 'A';
     
     System.out.println(myFirstCharacter);
     System.out.println(myNote);
     
     char firstLetter = 68, secondLetter = 111, thirdLetter = 103, fourthLetter = 117, fifthLetter = 107, 		 sixthLetter = 97, seventhLetter = 110;
     
     System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter + "" + fourthLetter + "" + 	            fifthLetter + "" + sixthLetter + "" + seventhLetter);
      
   }
}