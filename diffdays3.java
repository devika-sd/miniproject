import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class diffdays3 {
    public static void main(String[] args) throws IOException {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Date date = new Date();
        String str = String.format("%tD", date );
        System.out.println(str);
        char[] cur=str.toCharArray();
       char[] sec= new char[10];
       sec[0]=cur[3];
       sec[1]=cur[4];
       sec[2]=' ';
       sec[3]=cur[0];
       sec[4]=cur[1];
       sec[5]=' ';
       sec[6]='2';
       sec[7]='0';
       sec[8]=cur[6];
       sec[9]=cur[7];
        String str2=new String(sec);
       // System.out.println(str2);
        final String firstInput = reader.readLine();
        final String secondInput =str2;
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days between: " + days);
    }
}