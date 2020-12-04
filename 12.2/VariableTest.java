/*

1. 变量只能作用在作用域内，指“{}”内。

2. 只能定义一次，不能再同一作用域内定义同名变量

3.变量是先声明，后使用的
*/
class VariableTest{
    public static void main(String args[]) {
       int myAge = 24;
       System.out.println(myAge);
       Long myNumber;
       myNumber = 2014301390095L;//长整形要在后面加上L或l
       System.out.println(myNumber);
       Byte b1 = -128;
       System.out.println(b1);
       char c2 ='a';
       System.out.println(c2);
       Boolean b2 = true;
       System.out.println(!b2);
       System.out.println("双引号的字符串/n/n");
    }
}