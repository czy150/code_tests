import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber=0;
        int negativeNumber=0;
        while(true){
            int number = scan.nextInt();
            if(number>0) positiveNumber++;
            if(number<0) negativeNumber++;
            if(number==0) break;
        }
        System.out.println("��������Ϊ��" + positiveNumber);
        System.out.println("��������Ϊ��" + negativeNumber);
        
    }
}
