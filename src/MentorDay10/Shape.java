package MentorDay10;

public class Shape{
    static String color="Red";
    static double width=2.3;
    static double length=5.6;

    public static double calculateArea(){
        return length*width;
    }

    public static void printShape(){
        if (length==width){//for square
            System.out.println(color+" square is "+length*length+" sq.metres");
        }
        System.out.println(color+" rectangle is "+width*length+" sq.metres");
    }
}
