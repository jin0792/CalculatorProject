package com.example.calculator.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number1, number2;
        char operation;
        String input;

        while (true) {
            // 피연산자1 or 명령어 입력
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            input = scanner.next();
            if (input.equals("exit")) return;  // exit 입력시 프로그램 종료

            try {
                number1 = Long.parseLong(input);
                break; // 정상 입력이면 루프 종료
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }

        // 기호 입력
        System.out.print("기호를 입력해주세요: ");
        input = scanner.next();
        while (input.isBlank() || !(input.charAt(0) == '+' || input.charAt(0) == '-' || input.charAt(0) == '/' || input.charAt(0) == '*')) {
            System.out.print("잘못된 기호입니다. 다시 입력해주세요: ");
            input = scanner.next();
        }
        operation = input.charAt(0);

        // 피연산자2 입력
        while (true) {
            System.out.print("두 번째 숫자를 입력해주세요: ");
            input = scanner.next();
            if (input.equals("exit")) return;

            try {
                number2 = Long.parseLong(input);
                break; // 정상 입력이면 루프 종료
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }

        // 계산
        switch (operation) {

            case '+':
                System.out.println("결과: " + (number1 + number2));
                break;
            case '-':
                System.out.println("결과: " + (number1 - number2));
                break;
            case '*':
                System.out.println("결과: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("나누기의 분모는 0이 될 수 없습니다.");
                    break;
                }
                System.out.println("결과: " + (number1 / number2));
        }
    }
}