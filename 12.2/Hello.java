/*
对第一个java程序进行总结
1. java程序编写-编译-运行的过程
编写: 我们将编写的java代码保存在以".java"结尾的源文件中
编译： 使用javac.exe命令编译我们的java源文件。格式：javac 原文件名.java
运行： 使用java.exe命令解释运行我们的字节码文件。格式：java 类名

2.在一个java源文件中可以声明多个class。但是，最多只能有一个类声明为public。
而且要求声明为public的类名必须与原文件名相同

3. 程序的入口时main（）方法。格式是固定的。

4. System.out.println():先输出后换行
   System.out.print():先输出不换行
*/
class Hello{
    public static void main(String[] args) {//public static void main(String a[]){//argurments:参数
        System.out.println("Hello World!"); 
        System.out.println();//仅表示换行
        System.out.print("HEllO WORLD");   
        System.out.println("Hello World!");
    }
}

class  Person{

}

class Animal{
}