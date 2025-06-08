import java.util.Scanner;
public class CP_Conflict_AC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String T = sc.next();
        String A = sc.next();
        int flag = 0;
        for(int i = 0; i<N; i++){
            if(T.charAt(i)=='o'&& T.charAt(i)==A.charAt(i)){
                System.out.println("Yes");
                flag = 1;
                break;
            }
        }
        if(flag==0) System.out.println("No");
    }
}
