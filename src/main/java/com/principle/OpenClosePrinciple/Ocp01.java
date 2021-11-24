package com.principle.OpenClosePrinciple;

public class Ocp01 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}
//這是一個用於繪圖的類
class GraphicEditor{ //使用方
    //接受一個對象，然後根據type來繪製不同的圖形
    public void drawShape(Shape s){
        if(s.my_type==1){
            drawRectangle(s);
        }else if(s.my_type==2){
            drawCircle(s);
        }else if(s.my_type==3){
            drawTriangle(s);
        }

    }
    public void drawRectangle(Shape r){
        System.out.println("Rectangle!");
    }
    public void drawCircle(Shape c){
        System.out.println("Circle!");
    }
    // need to add new method here
    public void drawTriangle(Shape c){
        System.out.println("Triangle!");
    }
}
class Shape{
    int my_type;
}
class Rectangle extends Shape{
    Rectangle(){
        this.my_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        this.my_type=2;
    }
}

// add new class triangle
class Triangle extends Shape{
    Triangle(){
        this.my_type=3;
    }
}