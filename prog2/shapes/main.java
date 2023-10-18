package domain.model;

public class Circle extends Shape{

    private int radius=0;

    //get radius of the circle
    public int getRadius() {
        return radius;
    }

    //set radius of the circle
    public void setRadius(int newRadius){
        if(newRadius >= 0){
            radius=newRadius;
        }
    }


    @Override
    public int getArea(){
        return (int)(Math.PI*Math.pow(getRadius(), 2));//pi por radio al cuadrado
    }

    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI*getRadius()) ; //multiplicacion de pi por perimetro
    }

    public Circle(int newX, int newY, int newRadius){
        super(newX, newY); //El super sirve para llamar a la clase padre
        setRadius(newRadius);
    }

    public Circle(int newRadius){
        this (0,0,newRadius);
    }

    public Circle(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }

}

package domain.model;

public class Elipse extends Circle{

    private int radius2=0;

    public int getRadius2(){
        return radius2;
    }

    public void setRadius2(int newRadius2){
        if(newRadius2>=0){
            radius2=newRadius2;
        }
    }

    @Override
    public int getArea(){
        return (int)(Math.PI*getRadius() *getRadius2());
    }

    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI*Math.sqrt((Math.pow(getRadius(), 2) + Math.pow(getRadius2(), 2))/2)) ;
    }

    public Elipse(int newX, int newY, int newRadius, int newRadius2){
        super(newX, newY, newRadius); //El super sirve para llamar a la clase padre
        setRadius2(newRadius2);
    }

    public Elipse(int newRadius2){
        this (0,0,0, newRadius2);
    }

    public Elipse(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }

}

package domain.model;

public class Rect extends Square{

    private int Height=0;
    @Override
    public int getHeight(){
        return Height;
    }

    @Override
    public void setHeight(int newHeight){
        if(newHeight>=0){
            Height=newHeight;
        }
    }

   /*  @Override
    public int getArea(){
        return getwidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return (getHeight()*2)+(getwidth()*2);
    }
    */

    public Rect(int newX, int newY, int newWidth, int newHeight){
        super(newX, newY, newWidth); //El super sirve para llamar a la clase padre
        setHeight(newHeight);
    }

    public Rect(int newHeight){
        this (0,0,0, newHeight);
    }

    public Rect(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }



}

package domain.model;

public abstract class Shape {
    public int x=0;
    public int y=0;
    public Shape (int newX, int newY){//el metodo no debe tener la misma firma, cambiar el tipo de dato y orden
        x=newX;
        y=newY;

    }
    public void setX(int newX){
        if(newX>=0&&newX<=1000){
            x = newX;
        }
    }
    public int getX(){
        return x;
    }

    public void setY(int newY){
        if(newY>=0&&newY<=1000){
            y = newY;
        }
    }
    public int getY(){
        return y;
    }

    public abstract int getArea();
    public abstract int getPerimeter();

}

package domain.model;

public class Square extends Shape{
    private int width=0;

    public int getwidth(){
        return width;
    }

    public void setWidth(int newWidth){
        if(newWidth>=0){
            width=newWidth;
        }
    }

    public int getHeight(){
        return getwidth();
    }

    public void setHeight(int newHeight){
        setHeight(newHeight);
    }

    @Override
    public int getArea(){
        return getwidth()*getHeight();
    }

    @Override
    public int getPerimeter(){
        return (getHeight()*2)+(getwidth()*2);
    }

    public Square(int newX, int newY, int newWidth){
        super(newX, newY); //El super sirve para llamar a la clase padre
        setWidth(newWidth);
    }

    public Square(int newWidth){
        this (0,0,newWidth);
    }

    public Square(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }


}

package domain.model;

public class Triangle extends Shape{

    private int sideSize1=0;
    private int sideSize2=0;
    private int sideSize3=0;

    public int getSideSiza1(){
        return sideSize1;
    }

    public void setSideSiza1(int newSideSize1){
        if(newSideSize1>=0){
            sideSize1=newSideSize1;
        }
    }

    public int getSideSiza2(){
        return sideSize2;
    }

    public void setSideSiza2(int newSideSize2){
        if(newSideSize2>=0){
            sideSize2=newSideSize2;
        }
    }

    public int getSideSiza3(){
        return sideSize3;
    }

    public void setSideSiza3(int newSideSize3){
        if(newSideSize3>=0){
            sideSize3=newSideSize3;
        }
    }

    @Override
    public int getArea(){
        return (getSideSiza1()*getSideSiza2())/2;
    }

    @Override
    public int getPerimeter(){
        return getSideSiza1()+getSideSiza2()+getSideSiza3();
    }

    public Triangle(int newX, int newY, int newSideSize1, int newSideSize2, int newSideSize3){
        super(newX, newY); //El super sirve para llamar a la clase padre
        setSideSiza1(newSideSize1);
        setSideSiza2(newSideSize2);
        setSideSiza3(newSideSize3);
    }

    public Triangle(int newSideSize1, int newSideSize2, int newSideSize3){
        this(0, 0, newSideSize1, newSideSize2, newSideSize3);
    }

    public Triangle(int newX, int newY) {
        super(newX, newY);
        //TODO Auto-generated constructor stub
    }


}