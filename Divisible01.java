//**Author: Theja N
Date: 22-10-2020
Desc:Divisible by 3 0r 5**//

import java.util.Scanner;

public class Divisible {
 static int calculateSum(int n)
 {
  int sum=0;
  for(int i=1;i<=n;i++)
  {
   if(i%3==0||i%5==0)
   sum=sum+i;
  }
  return sum;
 }
  public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(calculateSum(n));
 }

}