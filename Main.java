import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b, case1;

        System.out.print("a :");
        a = sc.nextInt();
        System.out.print("b :");
        b = sc.nextInt();
        System.out.println("ganjil / genap?");
        case1 = sc.nextInt();
        
        if (case1 == 1 || case1 ==2) {
          switch (case1) {


            case 1:
                System.out.println("bil ganjil");
                for (int i = a; i < b; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i+ " ");
                    }
                    
                }
                break;
        
            case 2:
                System.out.println("bil genap");
                for (int i = a; i < b; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i+ " ");
                    }
                    
                }
                
                break;
            default:
                break;
        }
        }
        else{
            System.out.println("input invalid");
        }
        
    }
}
