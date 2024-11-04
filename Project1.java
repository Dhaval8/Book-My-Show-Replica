import java.util.*;
// import javaone.*;
// import javaone.Main;

//import javax.lang.model.util.ElementScanner14;

//import com.google.zxing.NotFoundException;
//import com.google.zxing.WriterException;

//import javax.lang.model.util.ElementScanner14;

//import java.Console_Application.*;
import java.io.*;

class Main
{
    public static Double w_gst_tick_total_d;
    public static Double w_gst_food_total_d;

    static boolean checkCaptcha(String captcha, String user_captcha)
    {
        return captcha.equals(user_captcha);
    }
     
    // Generates a CAPTCHA of given length
    static String generateCaptcha(int n)
    {
        //to generate random integers in the range [0-61]
        Random rand = new Random(62);
         
        // Characters to be included
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      
        // Generate n characters from above set and
        // add these characters to captcha.
        String captcha = "";
        while (n-->0){
            int index = (int)(Math.random()*62);
            captcha+=chrs.charAt(index);
        }
           
        return captcha;
    }

    //Function to show the selected movie...
    public static void movie_seat(int ch1)
    {
        if(ch1==1)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Pathaan");
        }
        else if(ch1==2)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Bholaa");
        }
        else if(ch1==3)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("John Wick Chapter: 4");
        }
        else if(ch1==4)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Tu Juthi main Makkar");
        }
        else if(ch1==5)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Fast X");
        }
        else if(ch1==6)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Plane");
        }
        else if(ch1==7)
        {
            System.out.print("\nMovie selected: ");
            System.out.print("Chor Nikal Ke Bhaga");
        }
        else
        {
            System.out.print("Wrong number entered...! Please redo the process...!");
        }
    }

    public static void tick()
    {
        Scanner src =new Scanner (System.in);
        float w_gst_tick_total=0;
        int tick_total=0;
        int nums,ch;
        System.out.print("\nEnter the total number of tickets you want??: ");
        nums=src.nextInt();
        if(nums>10)
        {
            System.out.print("\nYou cannot take more than 10 tickets...!");
        }
        else
        {
            System.out.print("\nOK...");
            System.out.print("\nWhich class of seats you want?:");
            System.out.print("\n1.Silver - Rs.180+GST");
            System.out.print("\n2.Gold - Rs.240+GST");
            System.out.print("\n3.Platinum - Rs.320+GST");
            System.out.print("\n4.Platinum Recliner - Rs.440+GST");
            System.out.print("\nEnter your choice: ");
            ch=src.nextInt();
            if(ch==1)
            {
                System.out.print("You selected silver class seats...!");
                tick_total=nums*180;
            }
            else if(ch==2)
            {
                System.out.print("You selected gold class seats...!");
                tick_total=nums*240;
            }
            else if(ch==3)
            {
                System.out.print("You selected platinum class seats...!");
                tick_total=nums*320;
            }
            else if(ch==4)
            {
                System.out.print("You selected platinum recliner class seats...!");
                tick_total=nums*440;
            }
            else
            {
                System.out.print("\nWrong number selected...!");
            }
            System.out.print("\nYour total for the tickets is equal to (Without GST): Rs."+tick_total);
            w_gst_tick_total=tick_total;
            w_gst_tick_total_d=w_gst_tick_total+(w_gst_tick_total*0.18);
            System.out.print("\nYour total for the tickets is equal to (With GST): Rs."+w_gst_tick_total_d);
        }
    }

    public static void food_drink()
    {
        Scanner src =new Scanner (System.in);
        int ch2,ch3,food_total=0,quantity,offer,pay, payment=0;
	    float w_gst_food_total=0;
        String cvv;
        do{
            System.out.print("\n\nWhat type of food and beverages you want??:");
            System.out.print("\n1.Coca Cola - Rs.140+GST");
            System.out.print("\n2.Pop Corn - Rs.200+GST");
            System.out.print("\n3.Nachos - Rs.240+GST");
            System.out.print("\n4.Pizza - Rs.300+GST");
            System.out.print("\n5.Nothing");
            System.out.print("\nEnter your choice: ");

            ch2=src.nextInt();
            if(ch2==1)
            {
                System.out.print("\nYou selected Coca Cola");
                System.out.print("How much quantity do yu want? (number of units): ");
                quantity=src.nextInt();
                food_total=food_total+(quantity*140);
            }
            else if(ch2==2)
            {
                System.out.print("\nYou selected Pop Corn");
                System.out.print("How much quantity do yu want? (number of units): ");
                quantity=src.nextInt();
                food_total=food_total+(quantity*200);
            }
            else if(ch2==3)
            {
                System.out.print("\nYou selected Nachos");
                System.out.print("How much quantity do yu want? (number of units): ");
                quantity=src.nextInt();
                food_total=food_total+(quantity*240);
            }
            else if(ch2==4)
            {
                System.out.print("\nYou selected Pizza");
                System.out.print("How much quantity do yu want? (number of units): ");
                quantity=src.nextInt();
                food_total=food_total+(quantity*300);
            }
            else if(ch2==5)
            {
                System.out.print("\nYou selected Nothing");
            }
            else
            {
                System.out.print("\nWrong number entered!!");
            }
        }while(ch2!=5);
        System.out.print("\nYour total for the food is equal to (Without GST): Rs."+food_total);
        if(food_total>=600)
        {
            System.out.print("\n\nAs you have purchased food and beverages that is over Rs.600, so we are giving you a combo offer: -");
            System.out.print("\nThe offer is : If you add more RS.100 in your bill amount so you will be able to take any one food item you want from the menue!!");
            System.out.print("\nDo you want this offer??\nEnter 1 for yes and 0 for no:");
            offer=src.nextInt();
            if(offer==1)
            {
                food_total=food_total+100;
                System.out.print("\n\nWhat type of food and beverages you want??:");
                System.out.print("\n1.Coca Cola - Rs.140+GST");
                System.out.print("\n2.Pop Corn - Rs.200+GST");
                System.out.print("\n3.Nachos - Rs.240+GST");
                System.out.print("\n4.Pizza - Rs.300+GST");
                System.out.print("\nEnter your choice: ");
                ch3=src.nextInt();
                switch(ch3)
                {
                    case 1:
                    {
                        System.out.print("\nOK!! You chose Coca Cola");
                        System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
                        w_gst_food_total=food_total;
                        w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
                        System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
                        System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
                        System.out.print("\nThank you so much please visit again!!!!\n");
                        //Add Payments;
                        System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            cvv=src.nextLine();
                            int a=cvv.length();
                            
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }

                        break;
                    }
                    case 2:
                    {
                        System.out.print("\nOK!! You chose Pop Corn");
                        System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
                        w_gst_food_total=food_total;
                        w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
                        System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
                        System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
                        System.out.print("\nThank you so much please visit again!!!!\n");
                        System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            int a=cvv.length();
                            cvv=src.nextLine();
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.print("\nOK!! You chose Nachos");
                        System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
                        w_gst_food_total=food_total;
                        w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
                        System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
                        System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
                        System.out.print("\nThank you so much please visit again!!!!\n");
                        System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            int a=cvv.length();
                            cvv=src.nextLine();
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.print("\nOK!! You chose Pizza");
                        System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
                        w_gst_food_total=food_total;
                        w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
                        System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
                        System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
                        System.out.print("\nThank you so much please visit again!!!!\n");
                        System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            cvv=src.nextLine();
                            int a=cvv.length();
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }
                        break;
                    }
                    default:
                    {
                        System.out.print("You wntered a wrong number...!");
                        break;
                    }
                }
            }
            else
            {
                System.out.print("\nNo problem!! Here is your final bill:-");
                System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
                w_gst_food_total=food_total;
                w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
                System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
                System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
                System.out.print("\nThank you so much please visit again!!!!\n");
                System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            cvv=src.nextLine();
                            int a=cvv.length();
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }
            }
        }
        else
        {
            System.out.print("Here is your final bill:-");
            System.out.print("\n\nYour total for the food is equal to (Without GST): Rs."+food_total);
            w_gst_food_total=food_total;
            w_gst_food_total_d=w_gst_food_total+(w_gst_food_total*0.05);
            System.out.print("\nYour total for the food is equal to (With GST): Rs."+w_gst_food_total_d);
            System.out.print("\nSo in total you need to pay (Food + Tickets): Rs."+(w_gst_food_total_d+w_gst_tick_total_d));
            System.out.print("\n\nPayments: Enter 1 for Card and 2 for Digital Wallet");
            pay=src.nextInt();

            System.out.println("Select payment method");


                        System.out.println();
                        System.out.println("1. Credit Card");
                        System.out.println("2. QR Code");
                        System.out.println("Enter Choice");
                        
                        payment=src.nextInt();

                        switch(payment){

                            case 1:

                            System.err.println("Enter CVV");
                            cvv=src.nextLine();
                            cvv=src.nextLine();
                            int a=cvv.length();
                            if(a>3){
                                System.out.println("invalid number entered");
                            }else{
                                System.err.println("Payemtn confirmed, ur tickets will be processed and send to you");
                            }
                            break;

                            case 2:

                            System.out.println("QR Code is being generated");
                            break;

                            default:

                            System.out.println("Inalid Input");
                            break;
                        }

            //Add payments;
            System.out.print("\nThank you so much please visit again!!!!\n");
            
        }
    }

    public static void main(String args[])
    {
        Scanner src =new Scanner (System.in);
        int i,j,ch,ch1,k;
        String captcha = generateCaptcha(7);
        System.out.println("Captcha: "+captcha);
        System.out.print("Enter the captcha: ");
        String user_captcha=src.nextLine();
        if(checkCaptcha(captcha, user_captcha))
        {
            System.out.print("\nUser Verified...!");
            System.out.print("\nChoose your city: -");
            System.out.print("\n1.Mumbai");
            System.out.print("\n2.Indore");
            System.out.print("\n3.Surat");
            System.out.print("\n4.Pune");
            System.out.print("\n5.Banglore");
            System.out.print("\n6.Agra");
            System.out.print("\n7.Ahemdabad");
            System.out.print("\nEnter your choice: ");
            ch=src.nextInt();
            switch(ch)
            {
                case 1:
                {
                System.out.print("You chose Mumbai...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 2:
                {
                System.out.print("You chose Indore...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 3:
                {
                System.out.print("You chose Surat...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 4:
                {
                System.out.print("You chose Pune...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 5:
                {
                System.out.print("You chose Banglore...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 6:
                {
                System.out.print("You chose Agra...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                case 7:
                {
                System.out.print("You chose Ahemdabad...!");
                System.out.print("\n\nSelect Movie\t\t\tDuration\tRating\t\tGenre\t\t\tCast");
                System.out.print("\n1.Pathaan\t\t\t146 mins\t(IMDb):6.1/10\tAction/Thriller\t\tShah Rukh Khan, Dipika Padukone, John Abraham, Salman Khan");
                System.out.print("\n2.Bholaa\t\t\t143 mins\t(Koimoi):3/5\tAction/Adventure\tAjay Devgn, Raai Laxmi, Tabu, Amala Paul");
                System.out.print("\n3.John Wick Chapter: 4\t\t169 mins\t(IMDb):8.3/10\tAction/Neo-noir\t\tKeanu Reeves, Scott Adkins, Donnie Yen, Lance Reddick");
                System.out.print("\n4.Tu Jhuthi Main Makkar\t\t150 mins\t(IMDB):6.8/10\tRomance/Comedy\t\tRanbir Kapoor, Shraddha Kapoor, Anubhav Singh Bassi, Hasleen Kaur");
                System.out.print("\n5.Fast X\t\t\t130 mins\t(IMDB):??/??\tAction/Adventure\tVin Diesel, Jason Momoa, Alan Ritchson, Rita Moreno");
                System.out.print("\n6.Plane\t\t\t\t107 mins\t(IMDB):6.5/10\tAction/Thriller\t\tGerard Butler, Mike Colter, Lilly Krug, Daniella Pineda");
                System.out.print("\n7.Chor Nikal Ke Bhaga\t\t110 mins\t(IMDB):7.9/10\tCrime/Drama/Thriller\tYami Gautam, Sunny Kaushal, Indraneil Sengupta, Sharad Kelkar");
                System.out.print("\nEnter your choice: ");
                ch1=src.nextInt();
                movie_seat(ch1);
                tick();
                food_drink();
                break;
                }
                default:
                {
                System.out.print("Wrong number entered...! Redo the process...!");
                break;
                }
            }
        }
        else
        {
            System.out.print("\nInvalid captcha please try again...!");
        }
    }
}
