package javapractice;

//import java.util.*;
class AlphabetCheck{
  public static void main(String []args){
	
     char ch ='1';
     if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
		 
		 System.out.println(ch+":It is Alphabet");
	 }
	  else{
	     System.out.println(ch+":It is number or Symbol. ");
	  }
  }

}