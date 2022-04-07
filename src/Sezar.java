import java.util.Scanner;
// edit by aliakbar vafaei
public class Sezar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String sez = s.next();
        int[] m = new int[sez.length()];
        for(int i = 0; i < sez.length(); i++){
            if((((int)sez.charAt(i) <= 90) && (((int)sez.charAt(i) + (n % 26)) > 90)) || (((int)sez.charAt(i) >= 97) && ((int)sez.charAt(i) <= 122) && (((int)sez.charAt(i) + (n % 26)) > 122)))
                m[i] = ((int)sez.charAt(i) + (n % 26) - 26);
            else
                m[i] = ((int)sez.charAt(i) + (n % 26));
        }
        for(int i = 0; i < sez.length(); i++){
            System.out.print((char)m[i]);
        }
    }
}
