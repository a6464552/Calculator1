import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String voperation = scanner.nextLine();
        System.out.println(calc(voperation));
    }
    public static String calc(String input) throws Exception {
        String[] operation = input.split(" ");
        if (operation.length < 3) {
            throw new Exception("т.к. строка не является математической операцией");
        } else if (operation.length > 3) {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+,-,*,/)");
        }

        int firstNumber = switch (operation[0]) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };

        int secondNumber = switch (operation[2]) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };

        if (firstNumber !=0 && secondNumber == 0) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        } else if (firstNumber ==0 && secondNumber != 0) {
            throw new Exception("т.к. используются одновременно разные системы счисления");
        } else if (firstNumber == 0 && secondNumber == 0){
            firstNumber = Integer.parseInt(operation[0]);
            secondNumber = Integer.parseInt(operation[2]);
            if (firstNumber < 1 | firstNumber > 10 | secondNumber < 1 | secondNumber > 10) throw new Exception("Введите число от 1 до 10");

            switch (operation[1]) {
                case "+" -> System.out.println(firstNumber + secondNumber);
                case "-" -> System.out.println(firstNumber - secondNumber);
                case "*" -> System.out.println(firstNumber * secondNumber);
                case "/" -> System.out.println(firstNumber / secondNumber);
                default -> throw new Exception("Не соответсвует ни одной из известных нам арифметических действий");
            }
        } else {
            int sumNumber;
            switch (operation[1]) {
                case "+" -> sumNumber = (firstNumber + secondNumber);
                case "-" -> sumNumber = (firstNumber - secondNumber);
                case "*" -> sumNumber = (firstNumber * secondNumber);
                case "/" -> sumNumber = (firstNumber / secondNumber);
                default -> throw new Exception("Не соответсвует ни одной из известных нам арифметических действий");
            }
            String[] romanRow = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            if(sumNumber <= 0) {
                throw new Exception("т.к. в римской системе нет отрицательных чисел");
            }
            return(romanRow[sumNumber]);
        }
        return"";
    }
}















