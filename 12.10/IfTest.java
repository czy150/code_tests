/*
˵����
1. �����ṹ�У�else�ǿ�ѡ��
2. ������������ʽ��
  >����������ʽ֮���ǡ����⡱��ϵ��û�н��������Ǹ��жϺ�ִ����������滹�������棬����ν
  >���������ʽ֮���н�����ϵ����Ҫ����ʵ��������������Ӧ�ý��ĸ��ṹ����������
  
*/

import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("������ɼ�");
        int score = scan.nextInt();

        if (score == 100){
            System.out.println("����һ��BMW");//be my wife
        }else if(score > 80){
            System.out.println("����һ̨iPhone");
        }else{
            System.out.println("ʲô��û��");
        }

    }
}
