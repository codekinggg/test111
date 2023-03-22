import java.util.Scanner;

public class week3second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, result;
        char f;
        
        System.out.println("a: ");
        a = input.nextDouble();
        
        System.out.println("연산자 입력 (+, -, *, /): ");
        f = input.next().charAt(0);
        
        System.out.println("b: ");
        b = input.nextDouble();
        
        switch(f) {
            case '+':
                result = a + b;
                System.out.println("결과 " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("결과 " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("결과 " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = a / b;
                    System.out.println("결과 " + result);
                }
                break;
            default:
                System.out.println("잘못입력되었습니다.");
                break;
        }
        
        input.close();
    }
}