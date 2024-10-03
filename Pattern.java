<<<<<<< HEAD
import java.util.Scanner;
public class Pattern {


    //circumfernce and area of circle using method
    
    public static void circleData(double radius){
        double circumference = 2* Math.PI *radius;
        double area = Math.PI*radius*radius;
        System.out.println("cir si:" + circumference);
        System.out.println("cir si:" + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius:");

        double radius = sc.nextDouble();

        circleData(radius);




       

        

        


         



    
        





    }
    
}
=======
import java.util.Scanner;
public class Pattern {

    public static void circleData(double radius){
        double circumference = 2* Math.PI *radius;
        double area = Math.PI*radius*radius;
        System.out.println("cir si:" + circumference);
        System.out.println("cir si:" + area);



    
       
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius:");

        double radius = sc.nextDouble();

        circleData(radius);




       

        

        


         



    
        





    }
    
}
>>>>>>> a870549ed40eb589e178c0e0bb7957ec04c0ce50
