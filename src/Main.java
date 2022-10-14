public class CircleRunner {
    public static void main(String[] args){
        Circle cir1 = new Circle(5.0);
        System.out.println(cir1.getInfo());
        cir1.setRadius(9.2);
        System.out.println(cir1.getInfo());

        Circle cir2 = new Circle(2.6);
        System.out.println(cir2.getInfo());
        cir2.setRadius(1.2);
        System.out.println(cir2.getInfo());
    }
}
