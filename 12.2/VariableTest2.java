/* 
基本数据类型之间的运算规则：

前提：不包含boolean类型的；

1. 自动提升类型：
    结论：当容量小的数据类型的变量与容量大的数据类型的变量运算时，结果自动提升为容量大的数据类型。
    byte、char、short-->int-->long-->float-->double

2. 强制类型转换：


说明：此时的容量大小指的是，表示数的范围的大和小，比如float的容量要大于long的容量
     byte、short、char类型的做运算时，结果为int型。
*/

class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 120;
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);

        //******** */
        char c1 = 'c';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 20;
        //byte b2 = c1 + s2;编译不通过
        //short s3 = c1 + s2;编译不通过
        int i5 = c1 + s2;
        System.out.println(i5);

    }
}