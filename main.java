import java.util.Scanner;

public class desen {
    static int gidis(int n){
        if(n<=0)
        return n;
        else
        System.out.print(n + "  ");
        return gidis(n-5);

    }

    static int donus(int n, int m){
        if(n>m)
        return n;
        else
        System.out.print(n+"  ");
        return donus(n+5, m);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Sayı Giriniz :");
        int ent = input.nextInt();
        donus(gidis(ent), ent);
        
    }
    
}
