public class PrintName2Parameter1 {

    public static void NamePrint(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Asmit");
        NamePrint(1,n-1);
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 3;
        NamePrint(i,n);
    }

    /*Time Complexity-->O(n)
     *Space Complexity-->O(n)
    */
}
