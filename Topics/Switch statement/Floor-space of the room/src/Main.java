import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.next();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double r = scanner.nextDouble();
        //
        switch (shape) {
            case "triangle":
                double triP = a + b + c;
                double triS = triP / 2;
                double triA = Math.sqrt(triS * ((triS-a)*(triS-b)*(triS-c)));
                System.out.println(triA);
            case "rectangle":
                double recA = a * b;
                System.out.println(recA);
            case "circle":
                double phi = 3.14;
                double cirA = phi * r * r;
                System.out.println(cirA);
            default:
                System.out.println("This is the border");
        }
    }
}