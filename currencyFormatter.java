import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class currencyFormatter{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

       NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=nf.format(payment);
        
         NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=nf1.format(payment);
        
         NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
        String us=nf2.format(payment);
        
        Locale indiLocale=new Locale("en","IN");
         NumberFormat nf3=NumberFormat.getCurrencyInstance(indiLocale);
        String india=nf3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}