public class ResetState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:"+work.getHour()+", 下班回家");
    }
}
