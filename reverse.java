import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int rev = 0;
        //updating oridginal no to reverse

        for (int i = 1; 0<n; i++) {
            int last = n%10 ; 
            rev= (rev*10)+last;
            n = n/10 ; 
            
        }
        System.out.println(rev);
    }
}
