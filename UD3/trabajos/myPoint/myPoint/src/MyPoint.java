public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }


public double distance(){
    double dx, dy, d;

    dx = Math.pow(this.x - 0, 2);
    dy = Math.pow(this.y - 0, 2);

    d = Math.sqrt(dx + dy);

    return d;
}

public double distance(MyPoint another){
    double dx, dy, d;

    dx = Math.pow(another.x - this.x, 2);
    dy = Math.pow(another.y - this.y, 2);

    d = Math.sqrt(dx + dy);

    return d;
}

public double distance(int x, int y){
    double dx, dy, d;

    dx = Math.pow(x - 0, 2);
    dy = Math.pow(y - 0, 2);

    d = Math.sqrt(dx + dy);

    return d;
}

    public int getX(){
       return x;
    }

    public int getY(){
        return y;
     }

     public int[] getXY(){
        int[] XY = {x, y};
        return XY;
     }

     public void setX(int newX){
        newX = x;
     }

     public void setY(int newY){
        newY = y;
     }

     public void setXY(int newX, int newY){
        newX = x;
        newY = y;
     }

     public String toString(){
        return("(" + x + ", " + y + ")");
     }



}
