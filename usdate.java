import java.util.Date;
public class usdate {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date
      String str = String.format("%tD", date );

      System.out.printf(str);
   }
}