import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        System.out.println("输入三个整数");
        System.out.println("num1");
        int num1 = scan.nextInt();
        System.out.println("num2");
        int num2 = scan.nextInt();
        System.out.println("num3");
        int num3 = scan.nextInt();

        int max;
        if(num1 > num2){
            max = num1;
            if(max < num3){
                max = num3;
                System.out.println(max + "," + num1 + "," + num2);    
            }else if(num2 > num3)
                System.out.println(max + "," + num2 + "," + num3);               
            else
                System.out.println(max + "," + num3 + "," + num2);
            
        }else{
            max = num2;
            if(max < num3){
                max = num3;
                System.out.println(max + "," + num2 + "," + num1);
            }else if(num3 > num1)
                System.out.println(max + "," + num3 + "," + num1);
            else
                System.out.println(max + "," + num1 + "," + num3);
             
            
        }
        System.out.println("最大值为" + max);
    }
}
