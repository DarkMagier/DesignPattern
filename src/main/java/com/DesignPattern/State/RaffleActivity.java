package com.DesignPattern.State;

public class RaffleActivity {
    private State state;
    private int count ;

    public RaffleActivity(int i) {
        count = i;
        state=canRaffleState;
    }

    public int getCount() {

        return count--;
    }
    State noRaffleState= new NoRaffleState(this);
    State canRaffleState= new CanRaffleState(this);
    State dispenseState=new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }


    public RaffleActivity(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void deductMoney(){
        state.deductMoney();
    }
    public void raffle(){
        if(state.raffle()){
            state.dispensePrize();
        }
    }
}
