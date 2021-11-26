import java.util.Scanner;

public class ConstroiFig {
    public static void main(String[] args) {
        float x1,x2,y1,y2;
        Scanner xx1=new Scanner(System.in);
        System.out.println("X1-");
        x1=xx1.nextFloat();

        Scanner xx2=new Scanner(System.in);
        System.out.println("X2-");
        x2=xx2.nextFloat();

        Scanner yy1=new Scanner(System.in);
        System.out.println("Y1-");
        y1=yy1.nextFloat();

        Scanner yy2=new Scanner(System.in);
        System.out.println("Y2-");
        y2=yy2.nextFloat();
        Retangulo Retangulo1 = new Retangulo()
        Quadrado Quadrado1 = new Quadrado(x1,x2,y1,y2);
        Quadrado Quadrado2 = new Quadrado(x1,x2,y1,y2);


    }
}
