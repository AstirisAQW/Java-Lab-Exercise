/*
The user will input a Philippine amount, then the said amount will be converted to different
currencies namely: US Dollar, Euro, Yuan, Koruna, Krone, Sheqel and Dinar
Sample run:

Enter Philippine peso: 43.33089

The amount's equivalent to:
                            USD     : 1.000
                            Euro    : 0.734719
                            Yuan    : 6.346934
                            Koruna  : 18.77263
                            Krone   : 5.449007
                            Sheqel  : 3.726334
                            Dinar   : 0.274588

Suppose, 1.000 US Dollar is equivalent to Php. 43.33089, 0.734719Euro, 6.346934 Yuan, 18.77263 Koruna, 5.449007 Krone, 3.726334 Sheqel, and 0.274588 Dinar.
 */


import java.util.Scanner;

class ConvertCurrencies {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Philippine Peso: ");
        double php_ammount = scan.nextDouble();
        
        final double php_rate = 43.33809;
        final double usd_rate = 1.00 / php_rate;
        final double euro_rate = 0.734719 / php_rate;
        final double yuan_rate = 6.346934 / php_rate;
        final double koruna_rate = 18.77263 / php_rate;
        final double krone_rate = 5.449007 / php_rate;
        final double sheqel_rate = 3.726334 / php_rate;
        final double dinar_rate = 0.274588 / php_rate;
        
        double usd = php_ammount * usd_rate;
        double euro = php_ammount * euro_rate;
        double yuan = php_ammount * yuan_rate;
        double koruna = php_ammount * koruna_rate;
        double krone = php_ammount * krone_rate;
        double sheqel = php_ammount * sheqel_rate;
        double dinar = php_ammount * dinar_rate;
        
        System.out.println("\n\nThe ammount's equivalent to:");
        System.out.println("US Dollar is :\t" + String.format("%.6f", usd));
        System.out.println("Euro :\t" + String.format("%.6f", euro));
        System.out.println("Yuan :\t" + String.format("%.6f", yuan));
        System.out.println("Koruna :\t" + String.format("%.6f", koruna));
        System.out.println("Krone :\t" + String.format("%.6f", krone));
        System.out.println("Sheqel :\t" + String.format("%.6f", sheqel));
        System.out.println("Dinar :\t" + String.format("%.6f", dinar));
        
        scan.close();
    }
}