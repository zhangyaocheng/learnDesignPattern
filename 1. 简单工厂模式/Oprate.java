/**
 * Oprate类
 *
 * 操作计算的类，其中包含两个操作数和一个获取结果的方法
 *
 */
public class Oprate {

    private double numberA = 0;
    private double numberB = 0; // 操作数都是私有的，防止被外部人员改动

    public double getNumberA(){
        return numberA;
    }

    public void setNumberA(double value){
        numberA = value;
    }

    public double getNumberB(){
        return numberB;
    }

    public void setNumberB(double value){
        numberB = value;
    }

    public double getResult(){ // 这里的getResult不做任何操作，方便后方继承的类重写
        double result = 0;
        return result; //默认返回初始值
    }

}
