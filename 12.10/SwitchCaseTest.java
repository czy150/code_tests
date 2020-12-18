/*
switch-case
1.格式
switch(){
case 常量1：
    执行语句1；
    //break;

case 常量2：
    执行语句；
    //break2;

default:
    执行语句n;
    //break;
}

2.说明：
① 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应的case结构中，执行语句。当调用完毕后，则仍然向下执行其它case结构中的执行语句，直到遇到break关键字或此switch-case结构末尾结束为止。

② break关键字，碰到此关键字跳出语句
③ switch结构中的表达式，只能是六种类型：byte、short、char、int、枚举类型()、string类型
    case之后只能声明常量。不能用boolean类型的变量，不能做比较
④ default：相当于if-else中的else,意思是“默认”。是可选结构，都写在后面
*/
import java.util.Scanner;
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.next();
        switch (season) {
            case "Spring":
                System.out.println("春天");
                break;
            case "Summer":
                System.out.println("夏天");
            case "Autumn":
                System.out.println("秋天");
                break;
            case "Winter":
                System.out.println("冬天");
                break;
            default:
                break;
        }
    }
}
