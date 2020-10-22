//**Author: Theja N
Date: 22-10-2020
Desc:Fibanocci Series**//

import java.util.Scanner;

public class Solution1 {
 static int fib(int n)
 {
  int f1=0,f2=1;
  int f3;
  for(int i=0;i<n-2;i++)
  {
   f3=f1+f2;
   f1=f2;
   f2=f3;
  }
  return f2;
 }
 public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
   int n=sc.nextInt();
   System.out.println(fib(n));
  }
 }

}