import java.util.Scanner;

class FamilyAccount{
    public static void main(String[] args) {
        boolean isFlag = true;
        Scanner scan = new Scanner(System.in);
        while(isFlag){
            System.out.println("----------��ͥ��֧�������----------\n");
            System.out.println("            1.��֧��ϸ            \n");
            System.out.println("            2.�Ǽ�����            \n");
            System.out.println("            3.�Ǽ�֧��            \n");
            System.out.println("            4.��    ��            \n");
            System.out.println("            ��ѡ��(1-4)��           ");
            int selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("��֧��ϸΪ");
                    break;
                case 2:
                    System.out.println("����");
                    break;
                case 3:
                    System.out.println("֧��");
                    break;
                case 4:
                    System.out.println("�Ƿ�Ҫ�˳���(1(�˳�)/2(���˳�))");
                   int isExit = scan.nextInt();
                    if(isExit == 1)
                        isFlag = false;
                        break;  
                default:
                    System.out.println("�������");
            }

        }
    }
}