/*
switch-case
1.��ʽ
switch(){
case ����1��
    ִ�����1��
    //break;

case ����2��
    ִ����䣻
    //break2;

default:
    ִ�����n;
    //break;
}

2.˵����
�� ����switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧ��case�ṹ�У�ִ����䡣��������Ϻ�����Ȼ����ִ������case�ṹ�е�ִ����䣬ֱ������break�ؼ��ֻ��switch-case�ṹĩβ����Ϊֹ��

�� break�ؼ��֣������˹ؼ����������
�� switch�ṹ�еı��ʽ��ֻ�����������ͣ�byte��short��char��int��ö������()��string����
    case֮��ֻ������������������boolean���͵ı������������Ƚ�
�� default���൱��if-else�е�else,��˼�ǡ�Ĭ�ϡ����ǿ�ѡ�ṹ����д�ں���
*/
import java.util.Scanner;
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.next();
        switch (season) {
            case "Spring":
                System.out.println("����");
                break;
            case "Summer":
                System.out.println("����");
            case "Autumn":
                System.out.println("����");
                break;
            case "Winter":
                System.out.println("����");
                break;
            default:
                break;
        }
    }
}
