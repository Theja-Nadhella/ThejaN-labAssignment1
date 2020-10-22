//**Author: Theja N
Date: 22-10-2020
Desc: Traffic Lights**//


import java.util.Scanner;
public class Traffic {
 public static void main(String[] args) {
  System.out.println("Enter your choice:");
  Scanner input=new Scanner(System.in);
  String button=input.nextLine();
  switch (button) {
  case "red": System.out.println("STOP");
              break;
  case "yellow":System.out.println("READY");
                break;
  case "green":System.out.println("GO");
               break;
  }
  }
 }