import java.util.*;
public class MovieTickets {
    public static void main(String args[]) {
       String name;
       int NoofTickets;
       int cost;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter The Name of The Movie: ");
          this.name=input.nextLine();
           System.out.print("Enter The Theaters Name: ");
           this.Theaters=input.nextLine();
            System.out.print("Enter The Number of Tickets: ");
             this.NoofTickets=input.nextInt();
             System.out.print("Enter The Cost of The Tickets: ");
             this.cost=input.nextInt();
             int status=1;
        Movie molist[]=null;
        do{
            System.out.println("Welcome to the cinama ");
            System.out.println("1. Add Movie details");
            System.out.println("2. Search and Book ");
            System.out.println("3. View all");
            System.out.println("Enter Your choice");
            int ch=input.nextInt();
            switch(ch)
            {
                case 1:
                      System.out.println("Enter Number of Movie: ");
                      int no=input.nextInt();
                      movlist[i]=new Movie[no];
                      for(int i=0;i<movlist.length;i++){
                      int j=i;
                      System.out.println("Enter Movie " + ++j +"Details");
                      movlist[i]=new Movie();
                      }
                      System.out.println("Data saved ....");
                      break;
                      case 2:
                        boolean flag =true;
                        input=nextLine();
                        System.out.println("Enter the movie name:");
                        String name=input.nextLine();
                        for(int i=0;i<movlist.length;i++){
                        if(movlist[i].getName().equals(name)){
                        movlist[i].viewAllDetails();
                        flag=true;
                        System.out.println("would you like to book tickets for this movie?:");
                         System.out.println("Enter 1 to book and 2 to exit:");
                         int c=input.nextInt();
                         if(c==1){
                          System.out.println("Enter the number of tickets:");
                          int tick=input.nextInt();
                          int tc=movlist[i].getcost()*tick;
                           System.out.println("the bill is: " + tc);
                         }
                         else
                         break;
                        }
                        else
                        flag=false;
                        }
                        if(flag==false)
                         System.out.println("Not Found");
                         break;
                         case 3:{
                             for(int i=0;i<movlist.length;i++){
                                movlist[i].viewAllDetails();
                             }
                              break;
                              System.out.println("Wrong choice....");
            }
                           System.out.println("Do you Want to con. (1.Yes/2.No):");
                           status=input.nextInt();
        }while(status==1);
        System.out.println("Execution completed Succefully.....");
}
    {
     public static void setname(String name){
          this.name= name;
      }
      String getName(){
      return name;
    }
   public static void setTheatersname(String Theaters){
        this.Theaters= Theaters;
    }
    String gettheTheaters(){
        return Theaters;
    }
    public static void setNoofTickets(int NoofTickets){
        this.NoofTickets=NoofTickets;
    }
    int getNoofTickets(){
        return NoofTickets;
    }
    public static void setcost(int cost){
        this.cost= cost;
    }
    int getcost(){
        return cost;
    }
    public static void storeAllDetails(String name,String brand,int memory,int camera,double price)
    {
        this.name= name;
        this.Theaters= Theaters;
        this.No.ofTickets= No.ofTickets;
        this.cost= cost;
    } 
    public static void viewAllDetails(){
         System.out.print("Name: " + name);
         System.out.print("Theaters: " + Theaters);
         System.out.print("No.ofTickets: " + No.ofTickets);
         System.out.print("Cost of The Tickets: " + cost);
    }
}