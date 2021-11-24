package com.DesignPattern.State;
//不能抽獎的狀態
public class NoRaffleState extends State {
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50積分成功，您可以抽獎了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了積分才可以抽獎哦！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能發放獎品！");
    }
}
