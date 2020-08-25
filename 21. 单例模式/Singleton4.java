public enum  Singleton4 {
    INSTANCE;

    private String objname;

    public String getObjname(){
        return objname;
    }

    public void setObjname(String objname){
        this.objname = objname;
    }

    public static void main(String[] args){

        // 单例测试
        Singleton4 firstsingleton4 = Singleton4.INSTANCE;
        System.out.println(firstsingleton4+":"+Singleton4.INSTANCE);
        firstsingleton4.setObjname("test1");
        System.out.println(firstsingleton4.getObjname());
        Singleton4 secsigleton = Singleton4.INSTANCE;
        secsigleton.setObjname("test2");
        System.out.println(firstsingleton4.getObjname());
        System.out.println(secsigleton.getObjname());

    }
}
