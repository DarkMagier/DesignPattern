package com.DesignPattern.State;

public class DispenseOutState extends State{
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("抽獎結束了！");
    }

    @Override
    public boolean raffle() {
        System.out.println("抽獎結束了！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("抽獎結束了！");
    }
}
