/**
 * 早上状态
 */
public class FrontnoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<12){
            System.out.println("当前时间{0}, 上午工作，精神百倍");
        }else{
            work.setState(new NoonState());work.writeProgram();
        }
    }
}
