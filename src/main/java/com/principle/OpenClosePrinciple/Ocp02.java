package com.principle.OpenClosePrinciple;

public class Ocp02 {
    public static void main(String[] args) {
        GraphicEditor1 graphicEditor1 = new GraphicEditor1();
        graphicEditor1.drawShape(new Rectangle1());
        graphicEditor1.drawShape(new Circle1());
        graphicEditor1.drawShape(new Triangle1());
        graphicEditor1.drawShape(new OtherGraphic());
    }
}
class GraphicEditor1{
    public void drawShape(Shape1 s){
        s.draw();
    }
}
 abstract class Shape1{
    int my_type;

    public abstract void draw();//抽象方法
 }
class Rectangle1 extends Shape1{
    Rectangle1(){
        this.my_type=1;
    }

    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }
}
class Circle1 extends Shape1{
    Circle1(){
        this.my_type=2;
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}

// add new class triangle
class Triangle1 extends Shape1{
    Triangle1(){
        this.my_type=3;
    }

    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }
}
class OtherGraphic extends Shape1{
    OtherGraphic(){
        this.my_type=4;
    }
    @Override
    public void draw(){
        System.out.println("draw OtherGraphic");
    }
}