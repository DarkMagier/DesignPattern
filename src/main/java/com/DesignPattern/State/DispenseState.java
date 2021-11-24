package com.DesignPattern.State;

public class DispenseState extends State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("DispenseState 不能扣除積分！");
    }



    @Override
    public boolean raffle() {
        System.out.println("cannot do it!");
        return false;
    }

    @Override
    public void dispensePrize() {
        if(activity.getCount()>0){
            System.out.println("恭喜中獎了！");
        }else {
            System.out.println("很遺憾，獎品發送完了！");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
