public class main{
    public static int add(int a , int b ){
        return(a+b);
    }
    public static int add(int a, int b , int c){
        return(a+b+c);
    }
    public static int  add(int a, int b , int c,int d){
        return (a+b+c+d);
    }
    public static void main(String[] args){
        System.out.println(add(4,5,7));
    }
}