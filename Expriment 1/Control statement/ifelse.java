import java.util.*;

class ifelse {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>=0){
            int a = sc.nextInt();
            if (a>=100) {
                System.out.println("Your Number is Greater than and equal to 100");;
            }else if(a>=1000){
                System.out.println("Your number is greater thanand equal to 1000.");
            }else{
                System.out.println("Your Number is Less than 100");
            }
            n--;
        }
    }
}
