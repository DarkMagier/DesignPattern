package com.DesignPattern.State;

import java.util.Random;

public class CanRaffleState extends State{
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已經扣取過了積分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽獎，請稍等！");
        Random r = new Random();
        int num = r.nextInt(10);

        if(num==0){
            System.out.println("******************抽中了！");
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("沒有抽中！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("沒有抽中！不能發放獎品");
    }
}
