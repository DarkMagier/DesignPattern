package com.DesignPattern.TemplateMethold;

public class Client {
    public static void main(String[] args) {
        SoyMilk redBeanMilk = new RedBeanMilk();
        redBeanMilk.make();

        SoyMilk pinutBeanMilk = new PinutBeanMilk();
        pinutBeanMilk.make();

        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
