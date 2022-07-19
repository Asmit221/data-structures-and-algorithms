public class printNum2 {
    public static void print(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        print(i+1,n);

    }
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        print(i,n);
    }
}
