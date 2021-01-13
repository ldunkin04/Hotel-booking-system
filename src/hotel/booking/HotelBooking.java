
package hotel.booking;

import java.util.*;
public class HotelBooking {
public static Scanner input = new Scanner(System.in);
public static int roomType(){
    String userchoice ="";
    int price = 0;
    while(userchoice == "" && price == 0){
    System.out.println("would you like a single room(£50), double room(£75), or family room(£105)");
     userchoice = input.next();
     if(userchoice == "single"){
          price = 50;
     }if(userchoice == "double"){
          price = 75;
     }if(userchoice == "family"){
          price = 105;
     }
     }
    
    return(price);
}
  public static int board(){
      String userchoice = "";
      int price = 1000;
      while(userchoice == "" && price == 1000){
          System.out.println("WOuld you like to self cater(£0), half board(£10), full board(£20)");
          userchoice = input.next();
          if(userchoice == "self cater"){
              price = 0;
          }if(userchoice == "half board"){
              price = 10;
          }if(userchoice == "full board"){
              price = 20;
          }
      }
      return(price);
  }
  public static int days(){
      int userchoice = 0;
      while(userchoice == 0){
          System.out.println("how many days do you want to stay");
          userchoice = input.nextInt();
      }
      return(userchoice);
  }
    public static void main(String[] args) {
        int room= roomType();
        int board = board();
        int days = days();
        double totalPrice = (room*days)+(board*days);
        System.out.println("amount before reduction = "+totalPrice);
        if(days > 7){
            int overWeek = days-7;
            int tobereduced = (room*overWeek)+(board*overWeek);
            double reducedamount = tobereduced * 0.8;
            totalPrice = totalPrice-reducedamount;
            
        }
        System.out.println("amount after reduction = "+totalPrice);
    }
    
}
