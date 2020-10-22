//**Author: Theja N
Date: 22-10-2020
Desc: sum of cubes of digits of a num**//
import java.util.Scanner;
public class Solution 
{
  static int sumOfCubes(int num)
  {
   int sum=0;
   while(num!=0)
   {
     int digit=num%10;
     sum=sum+(digit*digit*digit);
     num=num/10;
   }
   return sum;
 }
  public static void main(String[] args)
  {
    System.out.println("Enter num: ");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       System.out.println(sumOfCubes(num));
   }
 }
