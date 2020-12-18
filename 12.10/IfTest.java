/*
说明：
1. 条件结构中，else是可选的
2. 针对于条件表达式：
  >多个条件表达式之间是“互斥”关系（没有交集），那个判断和执行语句在上面还是在下面，无所谓
  >如果多个表达式之间有交集关系，需要根据实际情况，考虑清楚应该将哪个结构声明在上面
  
*/

import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入成绩");
        int score = scan.nextInt();

        if (score == 100){
            System.out.println("奖励一辆BMW");//be my wife
        }else if(score > 80){
            System.out.println("奖励一台iPhone");
        }else{
            System.out.println("什么都没有");
        }

    }
}
