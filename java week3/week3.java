import java.util.Scanner;

public class week3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, result;
        char f;
        
        System.out.println("입력하시오: ");
        a = input.nextDouble();
        
        System.out.println("연산자를 입력하시오 (+, -, *, /): ");
        f = input.next().charAt(0);
        
        System.out.println("입력하시오: ");
        b = input.nextDouble();
       
        if (f == '+') {
            result = a + b;
            System.out.println("계산결과 " + result);
        } else if (f == '-') {
            result = a - b;
            System.out.println("계산결과 " + result);
        } else if (f == '*') {
            result = a * b;
            System.out.println("계산결과 " + result);
        } else if (f == '/') {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                result = a / b;
                System.out.println("계산결과 " + result);
            }
        } 
        
        input.close();
    }
}