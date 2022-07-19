public class sumOfNnNumbers {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int  PreviousSum = sum(n-1);
        return n+PreviousSum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
