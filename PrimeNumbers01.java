//**Author: Theja N
Date: 22-10-2020
Desc: prime numbers upto a particular integer**//

public class Prime
{
public static void main(String[] args) 
{
  int num,i,j;
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(i=2;i<n;i++)
  {
   num=0;
   for(j=2;j<i;j++)
   {
    if(i%j==0)
     num=1;
   }
  if(num==0)
   System.out.println(i);
  }
  
 }

}