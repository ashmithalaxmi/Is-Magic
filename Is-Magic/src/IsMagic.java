import java.util.Scanner;

public class IsMagic {
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }
    static int isMagic(int n){
        if(n<10){
            return (n ==1)?1:0;
        }
        else{
            return isMagic(sum(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isMagic(n));

    }
}
