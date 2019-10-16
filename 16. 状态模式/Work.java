/**
 * work类
 * 实现工作和写程序方法
 */
public class Work {

    private double Hour;
    private boolean finish = false;
    private State state;

    public Work(){
        this.state = new AfternoonState();
    }

    public void writeProgram(){
        state.writeProgram(this); // 设置新的状态
    }

    public void setState(State state){this.state = state;}
    public State getState(){return state;}

    public void setHour(double hour){
        this.Hour = hour;
    }

    public void setFinish(boolean finish){
        this.finish = finish;
    }

    public double getHour(){return Hour;}
    public boolean getFinish(){return finish;}

}
