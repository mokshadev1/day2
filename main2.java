public class main2 {

    public static void count(int n){
        if (n==0)
            return ;

        System.out.println("Value of n :"+ n);

        count(n-1);
    }
    public static void main(String[] args){
        count(5);

    }
}