/**
 * 手机品牌抽象类
 *
 * 包含一个设定其功能的方法
 * 包含一个现实功能方法
 */
public class PhoneBrand {

    private PhoneFunc phoneFunc;//手机功能对象，表示该手机品牌有几个功能，这里简化处理

    public void setPhoneFunc(PhoneFunc func){
        phoneFunc = func;
    }

    public void operate(){
        phoneFunc.operation();
    }

}
