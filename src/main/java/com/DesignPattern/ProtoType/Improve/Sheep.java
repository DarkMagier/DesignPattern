package com.DesignPattern.ProtoType.Improve;

import java.io.*;

public class Sheep {
    private String name;
    private int age;
    private String color;
    public Sheep(String name,int age,String color){
        super();
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep[name="+name+",age="+age+",color="+color+"]";
    }
    //克隆該實例，使用默認的科隆方法
    @Override
    protected Object clone()  {
        Sheep sheep=null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }

    public Sheep deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;

        ByteArrayInputStream bis =null;
        ObjectInputStream ois=null;

        Sheep copyObj = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//當天這個對象以對象流的方式輸出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copyObj=(Sheep) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return copyObj;
    }
}
