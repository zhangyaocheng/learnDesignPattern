public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getFinish()){ // 完成工作的状态
            work.setState(new ResetState()); work.writeProgram();
        }else{
            if (work.getHour()<21){
                System.out.println("当前时间:"+work.getHour()+" 加班中，疲惫啊!");
            }else{
                //进入睡眠状态
                work.setState(new SleepState()); work.writeProgram();
            }
        }

    }
}
