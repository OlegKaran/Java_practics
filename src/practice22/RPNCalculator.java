package practice22;

import java.util.Scanner;

public class RPNCalculator {

    public static double evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Пустое выражение");
        }

        String[] tokens = expression.trim().split("\\s+");
        Stack stack = new Stack(tokens.length);

        for (String token : tokens) {
            if (isOperator(token)) {
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperation(token, a, b);
                stack.push(result);
            } else {
                try {
                    double number = Double.parseDouble(token);
                    stack.push(number);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неизвестный символ или токен: " + token);
                }
            }
        }

        if (stack.getSize() != 1) {
            throw new IllegalStateException("Некорректное выражение: в стеке остались лишние числа");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static double applyOperation(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
    }

    public static void main(String[] args) {
        String[] testExpressions = {
                "2 3 +",
                "2 3 * 4 5 * +",
                "2 3 4 5 6 * + - /",
                "1 2 + *"
        };

        System.out.println("=== Проверка на тестовых выражениях ===");
        for (String expr : testExpressions) {
            try {
                System.out.println(expr + " = " + evaluate(expr));
            } catch (Exception e) {
                System.out.println(expr + " -> Ошибка: " + e.getMessage());
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите RPN-выражение через пробел (или 'выход' для выхода):");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) {
                break;
            }
            try {
                System.out.println("Результат: " + evaluate(input));
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
