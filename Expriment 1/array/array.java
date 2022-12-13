import java.util.*;


class array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        int arr[]= new int[t];
        int temp= t;
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            System.out.println(arr[i]);
        }
    }
}