import java.util.Scanner;

class FamilyAccount{
    public static void main(String[] args) {
        boolean isFlag = true;
        Scanner scan = new Scanner(System.in);
        while(isFlag){
            System.out.println("----------家庭收支记账软件----------\n");
            System.out.println("            1.收支明细            \n");
            System.out.println("            2.登记收入            \n");
            System.out.println("            3.登记支出            \n");
            System.out.println("            4.退    出            \n");
            System.out.println("            请选择(1-4)：           ");
            int selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("收支明细为");
                    break;
                case 2:
                    System.out.println("收入");
                    break;
                case 3:
                    System.out.println("支出");
                    break;
                case 4:
                    System.out.println("是否要退出？(1(退出)/2(不退出))");
                   int isExit = scan.nextInt();
                    if(isExit == 1)
                        isFlag = false;
                        break;  
                default:
                    System.out.println("输入错误");
            }

        }
    }
}