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
        if(x >= this.x && x <= this.x+this.w &&
            y >= this.y && y <= this.y+this.h){
            return true;
        }
        return false;
    }

    public boolean contains(Point p){
        /*
        if(p.getX() >= this.x && p.getX() <= this.x+this.w &&
                p.getY() >= this.y && p.getY() <= this.y+this.h){
            return true
        }
        return false;
         */
        return this.contains(p.getX(), p.getY());
    }
}