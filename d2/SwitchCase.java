package com.sanjay;

public class SwitchCase {
    public static void main(String[] args){
        String i= unknownCity();

        switch (i) {
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City Of Joy");
                break;
            case "Delhi":
                System.out.println("Capital Of the Country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
            System.out.println("Maybe other Indian City");
        }

        }
  public static String unknownCity() {
      return "Bangalore";
    }
}
