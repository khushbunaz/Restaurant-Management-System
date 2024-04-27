import java.io.*;
import java.util.*;

class Restaurant
{
    ArrayDeque<Integer> cook;
    Restaurant()
    {
        cook = new ArrayDeque<>();
    }
}
class Main
{

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Restaurant r = new Restaurant();
        int ch,c1,c2,c3,ch1,ch2,ch3,t_cost;
        double Bill;
        do
        { 
            System.out.println("Hii");
            System.out.println("Welcome to the Restaurent");
            System.out.println("1.View  Menu");
            System.out.println("2.Dining");
            System.out.println("3.Take Away");
            System.out.println("4.Online Order");
            System.out.println("enter your choice");
            ch =sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    do
                    {
                        System.out.println("enter your choice of order");
                        System.out.println("1.unlimited menu");
                        System.out.println("2.punjabi Combos");
                        System.out.println("3.gujarati combos");
                        System.out.println("4.rajastani combos");
                        System.out.println("5.our special combos");
                        System.out.println("6.exit");
                        c1=sc.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                BufferedReader br1=new BufferedReader(new FileReader("Unlimited/Unlimited.txt"));
                                String line;
                                while((line=br1.readLine())!=null)
                                {
                                    System.out.println(line);
                                }
                                br1.close();
                            }
                            break;
                            case 2:
                            {
                                BufferedReader br1=new BufferedReader(new FileReader("Punjabi/Punjabi.txt"));
                                String line;
                                while((line=br1.readLine())!=null)
                                {
                                    System.out.println(line);
                                }
                                br1.close();
                            }
                            break;
                            case 3:
                            {
                                BufferedReader br1=new BufferedReader(new FileReader("Gujarati/Gujarati.txt"));
                                String line;
                                while((line=br1.readLine())!=null)
                                {
                                    System.out.println(line);
                                }
                                br1.close();
                            }
                            break;
                            case 4:
                            {
                                BufferedReader br1=new BufferedReader(new FileReader("Rajasthani/Rajasthani.txt"));
                                String line;
                                while((line=br1.readLine())!=null)
                                {
                                    System.out.println(line);
                                }
                                br1.close();
                            }
                            break;
                            case 5:
                            {
                                BufferedReader br1=new BufferedReader(new FileReader("Special/Special.txt"));
                                String line;
                                while((line=br1.readLine())!=null)
                                {
                                    System.out.println(line);
                                }
                                br1.close();
                            }
                            break;
                            case 6:
                            {
                                System.out.println("Exiting menu");
                            }
                            break;
                            default :
                            System.out.println("Please enter Valid Choice");
                            break;
                        }
                    } while(c1!=6);
                }
                break;
                case 2:
                {
                    do
                    {
                        System.out.println("Welcome to Thala's Restaurent");
                        System.out.println("enter your choice of order");
                        System.out.println("1.unlimited menu-Price=500/-");
                        System.out.println("2.punjabi Combos-Price=300/-");
                        System.out.println("3.gujarati combos-Price=250/-");
                        System.out.println("4.rajasthani combos-Price=200/-");
                        System.out.println("5.our special combos-Price=350/-");
                        System.out.println("Maximum 9 orders can b placed at once for ");
                        System.out.println("6.exit");
                        c2 = sc.nextInt();
                        sc.nextLine();
                        switch(c2)
                        {
                            case 1:
                                System.out.println("enter number of people");
                                int n_p=sc.nextInt();
                                r.cook.addLast(n_p);
                                System.out.println("Your order for item "+n_p+" has been placed...");
                                t_cost=n_p*500;
                                Bill=t_cost+(t_cost*0.05);
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Unlimited platter"+"  "+"   500         "+"      "+n_p+"    ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            break;
                            case 2:
                                {
                                System.out.println("enter number of platters");
                                int p_p=sc.nextInt();
                                r.cook.addLast(p_p);
                                System.out.println("Your order for item "+p_p+" has been placed...");
                                t_cost=p_p*300;
                                Bill=t_cost+(t_cost*0.05);
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Punjabi platter"+"  "+"   300         "+"       "+p_p+"     ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________"); 
                            }
                            break;
                            case 3:
                            {
                                System.out.println("enter number of platters");
                                int g_p=sc.nextInt();
                                r.cook.addLast(g_p);
                                System.out.println("Your order for item "+g_p+" has been placed...");
                                t_cost=g_p*250;
                                Bill=t_cost+(t_cost*0.05);
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println(" Order        "+"  "+" Price per item"+"  "+"  Quantity     ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Gujarati platter"+"  "+"   250         "+"       "+g_p+"    ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            }
                            break;
                            case 4:
                                {
                                System.out.println("enter number of platters");
                                int r_p=sc.nextInt();
                                r.cook.addLast(r_p);
                                System.out.println("Your order for item "+r_p+" has been placed...");
                                t_cost=r_p*200;
                                Bill=t_cost+(t_cost*0.05);
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Rajasthani platter"+"  "+"   200         "+"       "+r_p+"  ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            }
                            break;
                            case 5:
                            {
                                System.out.println("enter number of platters");
                                int a_p=sc.nextInt();
                                r.cook.addLast(a_p);
                                System.out.println("Your order for item "+a_p+" has been placed...");
                                t_cost=a_p*350;
                                Bill=t_cost+(t_cost*0.05);
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println(" Order        "+"  "+" Price per item"+"  "+"  Quantity     ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Special platter"+"  "+"   350         "+"       "+a_p+"     ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________"); 
                            }
                            break;
                            case 6:
                            {
                                System.out.println("order done");
                            }
                            break;
                            default :
                            System.out.println("Please enter Valid Choice");
                            break;
                        }
                    }while(c2!=6);
                }
                break;
                case 3:
                {
                    do
                    {
                        System.out.println("Welcome to Thala's Restaurent");
                        System.out.println("Please enter your Order For Take Away");
                        System.out.println("enter your choice of order");
                        System.out.println("1.punjabi Combos-Price=300 + ParcelCharges/-");
                        System.out.println("2.gujarati combos-Price=250 + ParcelCharges/-");
                        System.out.println("3.rajasthani combos-Price=200 + ParcelCharges/-");
                        System.out.println("4.our special combos-Price=350 + ParcelCharges/-");
                        System.out.println("Cutlury Charges 10Rs Included In All");
                        System.out.println("6.exit");
                        c3 = sc.nextInt();
                        sc.nextLine();
                        switch(c3)
                        {
                            case 1:
                                {
                                System.out.println("enter number of platters");
                                int p_p=sc.nextInt();
                                r.cook.addLast(p_p);
                                System.out.println("Your order for item "+p_p+" has been placed...");
                                t_cost=p_p*300;
                                Bill=t_cost+(t_cost*0.05)+60;
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Punjabi platter"+"  "+"   300         "+"       "+p_p+"     ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("                       Cutlery Charges=10.0               ");
                                System.out.println("                        Parcel Charges=50.0               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________"); 
                            }
                            break;
                            case 2:
                            {
                                System.out.println("enter number of platters");
                                int g_p=sc.nextInt();
                                r.cook.addLast(g_p);
                                System.out.println("Your order for item "+g_p+" has been placed...");
                                t_cost=g_p*250;
                                Bill=t_cost+(t_cost*0.05)+60;
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Gujarati platter"+"  "+"   250         "+"       "+g_p+"    ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("                       Cutlery Charges=10.0               ");
                                System.out.println("                        Parcel Charges=50.0               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            }
                            break;
                            case 3:
                                {
                                System.out.println("enter number of platters");
                                int r_p=sc.nextInt();
                                r.cook.addLast(r_p);
                                System.out.println("Your order for item "+r_p+" has been placed...");
                                t_cost=r_p*200;
                                Bill=t_cost+(t_cost*0.05)+60;
                                System.out.println(" __________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Rajasthani platter"+"  "+"   200         "+"       "+r_p+"  ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("                       Cutlery Charges=10.0               ");
                                System.out.println("                        Parcel Charges=50.0               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            }
                            break;
                            case 4:
                            {
                                System.out.println("enter number of platters");
                                int a_p=sc.nextInt();
                                r.cook.addLast(a_p);
                                System.out.println("Your order for item "+a_p+" has been placed...");
                                t_cost=a_p*350;
                                Bill=t_cost+(t_cost*0.05)+60;
                                System.out.println("__________________________________________________________");
                                System.out.println("                      THALA'S RESTAURENT                  ");
                                System.out.println("                                                          ");
                                System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                System.out.println("__________________________________________________________");
                                System.out.println("Special platter"+"  "+"   350         "+"       "+a_p+"     ");
                                System.out.println("                                                          ");
                                System.out.println("                                                          ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Total Bill="+t_cost+"         ");
                                System.out.println("                                  CGST=2.5%               ");
                                System.out.println("                                  SGST=2.5%               ");
                                System.out.println("                       Cutlery Charges=10.0               ");
                                System.out.println("                        Parcel Charges=50.0               ");
                                System.out.println("__________________________________________________________");
                                System.out.println("                              Final Bill="+Bill+"           ");
                                System.out.println("                                                          ");
                                System.out.println("             Thank U For Visiting                         ");
                                System.out.println("                                                          ");
                                System.out.println("Our Other Branches                                        ");
                                System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                System.out.println("__________________________________________________________");
                            }
                            break;
                            case 6:
                            {
                                System.out.println("order done");
                                break;
                            }
                            default :
                            System.out.println("Please enter Valid Choice");
                            break;
                        }
                    }while(c3!=6);
                }
                break;
                case 4:
                {
                    do
                    {
                        System.out.println("Please Choice your Take Away ");
                        System.out.println("1.Swiggy");
                        System.out.println("2.Zomato");
                        System.out.println("6.Exit");
                        System.out.println("enter your choice");
                        ch1=sc.nextInt();
                        switch(ch1)
                        {
                            case 1:
                            {
                                do
                                {
                                    System.out.println("enter your choice of order");
                                    System.out.println("1.punjabi Combos-Price=350 + Delivery Charges/-");
                                    System.out.println("2.gujarati combos-Price=300 + Delivery Charges/-");
                                    System.out.println("3.rajasthani combos-Price=250 + Delivery Charges/-");
                                    System.out.println("4.our special combos-Price=400 + Delivery Charges/-");
                                    System.out.println("Cutlury Charges 10Rs Included In All");
                                    System.out.println("6.exit");
                                    ch2 = sc.nextInt();
                                    sc.nextLine();
                                    switch(ch2)
                                    {
                                        case 1:
                                            {
                                            System.out.println("enter number of platters");
                                            int p_p=sc.nextInt();
                                            r.cook.addLast(p_p);
                                            System.out.println("Your order for item "+p_p+" has been placed...");
                                            t_cost=p_p*350;
                                            Bill=t_cost+(t_cost*0.05)+65;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("Punjabi platter"+"  "+"   350         "+"       "+p_p+"     ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=55.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________");
                                        }
                                        break;
                                        case 2:
                                        {
                                            System.out.println("enter number of platters");
                                            int g_p=sc.nextInt();
                                            r.cook.addLast(g_p);
                                            System.out.println("Your order for item "+g_p+" has been placed...");
                                            t_cost=g_p*300;
                                            Bill=t_cost+(t_cost*0.05)+65;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println(" Order        "+"  "+" Price per item"+"  "+"  Quantity     ");
                                            System.out.println("_________________________________________________________ ");
                                            System.out.println("Gujarati platter"+"  "+"   300         "+"       "+g_p+"    ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=55.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________");
                                        }
                                        break;
                                        case 3:
                                            {
                                            System.out.println("enter number of platters");
                                            int r_p=sc.nextInt();
                                            r.cook.addLast(r_p);
                                            System.out.println("Your order for item "+r_p+" has been placed...");
                                            t_cost=r_p*250;
                                            Bill=t_cost+(t_cost*0.05)+65;
                                            System.out.println(" __________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                   ");
                                            System.out.println("                                                           ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity     ");
                                            System.out.println("__________________________________________________________ ");
                                            System.out.println(" Rajasthani platter"+"  "+"   250         "+"       "+r_p+"  ");
                                            System.out.println("                                                           ");
                                            System.out.println("                                                           ");
                                            System.out.println(" __________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"          ");
                                            System.out.println("                                  CGST=2.5%                ");
                                            System.out.println("                                  SGST=2.5%                ");
                                            System.out.println("                       Cutlery Charges=10.0                ");
                                            System.out.println("                 Delivery Partner cost=55.0                ");
                                            System.out.println("__________________________________________________________ ");
                                            System.out.println("                              Final Bill="+Bill+"            ");
                                            System.out.println("                                                           ");
                                            System.out.println("             Thank U For Visiting                          ");
                                            System.out.println("                                                           ");
                                            System.out.println(" Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~                ");
                                            System.out.println(" __________________________________________________________");
                                        }
                                        break;
                                        case 4:
                                        {
                                            System.out.println("enter number of platters");
                                            int a_p=sc.nextInt();
                                            r.cook.addLast(a_p);
                                            System.out.println("Your order for item "+a_p+" has been placed...");
                                            t_cost=a_p*400;
                                            Bill=t_cost+(t_cost*0.05)+65;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println(" Special platter"+"  "+"   400         "+"       "+a_p+"    ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=55.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________"); 
                                        }
                                        break;
                                        case 6:
                                        {
                                            System.out.println("order done");
                                            break;
                                        }
                                        default :
                                        System.out.println("Please enter Valid Choice");
                                        break;
                                    }
                                }while(ch2!=6);
                            }
                            break;
                            case 2:
                            {
                                do
                                {
                                    System.out.println("enter your choice of order");
                                    System.out.println("1.punjabi Combos-Price=350 + Delivery Charges/-");
                                    System.out.println("2.gujarati combos-Price=300 + Delivery Charges/-");
                                    System.out.println("3.rajasthani combos-Price=250 + Delivery Charges/-");
                                    System.out.println("4.our special combos-Price=400 + Delivery Charges/-");
                                    System.out.println("Cutlury Charges 10Rs Included In All");
                                    System.out.println("6.exit");
                                    ch3 = sc.nextInt();
                                    sc.nextLine();
                                    switch(ch3)
                                    {
                                        case 1:
                                            {
                                            System.out.println("enter number of platters");
                                            int p_p=sc.nextInt();
                                            r.cook.addLast(p_p);
                                            System.out.println("Your order for item "+p_p+" has been placed...");
                                            t_cost=p_p*350;
                                            Bill=t_cost+(t_cost*0.05)+60;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                     THALA'S RESTAURENT                   ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("Punjabi platter"+"  "+"   350         "+"       "+p_p+"     ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=50.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________");
                                        }
                                        break;
                                        case 2:
                                        {
                                            System.out.println("enter number of platters");
                                            int g_p=sc.nextInt();
                                            r.cook.addLast(g_p);
                                            System.out.println("Your order for item "+g_p+" has been placed...");
                                            t_cost=g_p*300;
                                            Bill=t_cost+(t_cost*0.05)+60;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("Gujarati platter"+"  "+"   300         "+"       "+g_p+"    ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=50.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________");
                                        }
                                        break;
                                        case 3:
                                            {
                                            System.out.println("enter number of platters");
                                            int r_p=sc.nextInt();
                                            r.cook.addLast(r_p);
                                            System.out.println("Your order for item "+r_p+" has been placed...");
                                            t_cost=r_p*250;
                                            Bill=t_cost+(t_cost*0.05)+60;
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("Rajasthani platter"+"  "+"   250         "+"       "+r_p+"  ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=50.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________");
                                        }
                                        break;
                                        case 4:
                                        {
                                            System.out.println("enter number of platters");
                                            int a_p=sc.nextInt();
                                            r.cook.addLast(a_p);
                                            System.out.println("Your order for item "+a_p+" has been placed...");
                                            t_cost=a_p*400;
                                            Bill=t_cost+(t_cost*0.05)+60;
                                            System.out.println(" __________________________________________________________");
                                            System.out.println("                      THALA'S RESTAURENT                  ");
                                            System.out.println("                                                          ");
                                            System.out.println("  Order        "+"  "+" Price per item"+"  "+"  Quantity    ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("Special platter"+"  "+"   400         "+"       "+a_p+"     ");
                                            System.out.println("                                                          ");
                                            System.out.println("                                                          ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Total Bill="+t_cost+"         ");
                                            System.out.println("                                  CGST=2.5%               ");
                                            System.out.println("                                  SGST=2.5%               ");
                                            System.out.println("                       Cutlery Charges=10.0               ");
                                            System.out.println("                 Delivery Partner cost=50.0               ");
                                            System.out.println("__________________________________________________________");
                                            System.out.println("                              Final Bill="+Bill+"           ");
                                            System.out.println("                                                          ");
                                            System.out.println("             Thank U For Visiting                         ");
                                            System.out.println("                                                          ");
                                            System.out.println("Our Other Branches                                        ");
                                            System.out.println("       ~Maninagar~ ~Navrangpura~ ~IIM Road~               ");
                                            System.out.println("__________________________________________________________"); 
                                        }
                                        break;
                                        case 6:
                                        {
                                            System.out.println("order done");
                                        }
                                        default :
                                        System.out.println("Please enter Valid Choice");
                                    }
                                }while(ch3!=6);
                            }
                            break;
                            case 6:
                            System.out.println("Exiting Thank You for Visiting");
                            break;
                            default :
                            System.out.println("Please enter Valid Choice");
                            break;
                        }
                        break;
                    }while(ch1!=6);
                }
                break;
                case 6:
                {
                    System.out.println("Exiting Thank You for Visiting");
                }
                break;
                default :
                {
                    System.out.println("Please enter Valid Choice");
                }
                break;
            }
        } while(ch!=6);
        sc.close();
    }   
}