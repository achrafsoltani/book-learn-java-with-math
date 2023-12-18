package Lib;

public class Rectangle {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rectangle (int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.h = height;
        this.w = width;
    }

    public int getHeight(){
        return this.h;
    }

    public int getWidth(){
        return this.w;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        return "Rectangle[x="+this.x+",y="+this.y+",width="+this.w+",height="+this.h+"]";
    }

    public boolean contains(int x, int y){

    }

    public boolean contains(Point p){

    }
}