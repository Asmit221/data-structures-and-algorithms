import java.util.Scanner;
public class PrintName2Parameter {

    public static String CallMyName(String name, int n){
        if(n==0){
            return name;
        }
        System.out.println(name);
        String small = CallMyName(name,n-1);
        return small;
    }
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     String name = sc.next();
     int n = sc.nextInt();
     CallMyName(name,n);
    }
}
