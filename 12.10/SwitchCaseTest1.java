import java.util.Scanner;
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumDays = 0;
        System.out.println("�������·�");
        int month = scan.nextInt();
        System.out.println("��������");
        int days = scan.nextInt();

        switch(month){
        case 12:
            sumDays += 30;
        case 11:
            sumDays += 31;
        case 10:
            sumDays += 30;
        case 9:
            sumDays += 31;
        case 8:
            sumDays += 31;
        case 7:
            sumDays += 30;
        case 6:
            sumDays += 31;
        case 5:
            sumDays += 30;
        case 4:
            sumDays += 31;
        case 3:
            sumDays += 28;
        case 2:
            sumDays += 31;
        case 1:
            sumDays += days;
        }
        System.out.println("�ǽ���ĵ�" +sumDays  + "��");
    }
}
