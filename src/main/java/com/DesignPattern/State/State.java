package com.DesignPattern.State;

public abstract class State {
    //扣除積分
    public abstract void deductMoney();

    //是否抽中獎品
    public abstract boolean raffle();

    //發放獎品
    public abstract void dispensePrize();
}
