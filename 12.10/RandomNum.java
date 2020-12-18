/* 
如何获取一个随机数
double value = Math.radom();
radom获取的是[0.0,1.0)范围内的数

公式[a,b]: (int)(Math.random()*(b-a+1)+a)
获取a到b的范围内的整数
*/
class RamdomNum{
    public static void main(String[] args) {
        int ramNum = (int)(Math.random()*4+4);
        System.out.println(ramNum);
    }
}