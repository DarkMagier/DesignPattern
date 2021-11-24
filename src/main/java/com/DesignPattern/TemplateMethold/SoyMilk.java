package com.DesignPattern.TemplateMethold;

public abstract class SoyMilk {
    //模板方法，make, 設置成final，防止子類覆蓋
    final void make(){
        select();
        if(this.customCondiments()){
            addCondiments();
        }

        soak();
        beat();
    }
    void select(){
        System.out.println("1。選擇好的新鮮黃豆");
    }
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("3。黃豆和配料浸泡3個小時");
    }
    void beat(){
        System.out.println("4。黃豆和配料放到豆漿機去打碎");
    }

    //鉤子方法，決定是否添加配料
    boolean customCondiments(){
        return true;
    }
}
