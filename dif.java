import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class dif {
    public static void main(String[] args) throws IOException {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();
        String str = String.format("%tD", date );
        //System.out.println(str);
        char[] cur=str.toCharArray();
        char[] sec={cur[3],cur[4],' ',cur[0],cur[1],' ','2','0',cur[6],cur[7]};
        String str2=new String(sec);
       // System.out.println(str2);
         System.out.println("*********************************************************");
         System.out.println("  we are here to help you                                ");
         System.out.println("                         &keep ur baby away from diseases");
         System.out.println("*********************************************************");
         System.out.println();
        System.out.println("enter your baby's date of birth");
         String firstInput = reader.readLine();
        final String secondInput =str2;
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        //System.out.println("Days between: " + days);
        long d=days;
      String str1[]={"bby","6week","10week","14week","6months","9months","9-12","12months","15months","16-18","2years","4-6","10-12"};
      int t=0;
      int j[]={0,7,42,182,198,274,365,565,453,456,486,574,765};
      for(int i=0;i<str1.length;i++)
      {
        d=d-j[i];
        if(d<=0)
        { 
          t++;
          break;
        }
       else
      {   
         t++;
        }
       
      }
      if(t==13)
        {
          System.out.println("the person doesn't need any baby vaccination");
        
        }
        if(t<13)
        {
      System.out.println("baby needs "+str1[t-1]+" vaccination in "+LocalDate.parse(firstInput, formatter).plusDays(j[t-1]));
      System.out.println();
    }
     System.out.println("do you want to know the vaccines which are given before");
      String init=reader.readLine();
      if(init.equalsIgnoreCase("yes"))
      {
        for(int k=0;k<t;k++)
        {
          System.out.print(LocalDate.parse(firstInput, formatter).plusDays(j[k]));
          System.out.println(" "+str1[k]);
        }
        System.out.println();
        System.out.println("******************* thank you ***************************");
      }
    }
}