package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        boolean isInsideX = false;
        boolean isInsideY = false;
        if(point.getCoordinateX()>= bottomLeft.getCoordinateX()&&point.getCoordinateX()<= topRight.getCoordinateX()){
            isInsideX=true;
        }
        if(point.getCoordinateY()>= bottomLeft.getCoordinateY()&&point.getCoordinateY()<= topRight.getCoordinateY()){
            isInsideY=true;
        }
     return isInsideX&&isInsideY;
    }
}
