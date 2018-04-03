package ru.lesson.lessons;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class InteractRunner extends ArgRunner {
    // Переменная перехода для работы с предыдущим результатом.
    private String secondInput = "no";
    //Переменная выхода.
    private String exit = "no";
    // Массив операндов калькулятора.
    private String[] command = new String[]{"+", "-", "*", "/", "^"};
    // Размер массива входящих аргументов.
    public static final int NUMBER_OPERANDS = 3;
    // Массив входных аргументов.
    private static String[] inputParam = new String[NUMBER_OPERANDS];
    // Переменная перехода по циклам.
    public boolean next = false;
    // Подключаем калькулятор.
    Calculator calc = new Calculator();
    //Подключаем ввод-вывод консоли.
    Scanner reader = new Scanner(System.in);
    InputStreamReader in = new InputStreamReader(System.in);

    /**
     * Запуск программы.
     *
     * @throws Exception обрабатывает исключения.
     */
    public static void main(String[] args) throws Exception {
        try {
            InteractRunner initObj = new InteractRunner();
            while (!initObj.exit.equals("yes")) {
                do {
                    initObj.firstInput();
                    try {
                        initObj.checkInput(inputParam);
                        initObj.choiceOperand(inputParam);
                    } catch (UserException e) {
                        System.out.println(e.getMessage());
                    } catch (IllegalAccessException ex) {
                        initObj.next = false;
                        System.out.println(ex.getMessage());
                    }
                } while (!initObj.next);
                initObj.outputResult();
                initObj.secondInput();
            }
        } catch (PatternSyntaxException exc) {
            System.out.println(exc.getMessage());
        }
    }

    /**
     * Метод получения и обработки данных.
     *
     * @throws UserException исключения при вводе данных.
     */
    public void firstInput() throws UserException {
        System.out.println("Enter what you want to calculate(use:+-/*^): ");
        String text = reader.next();
        if (secondInput.equals("yes")) {
            text = Integer.toString(this.getArg()) + text;
        } else this.cleanArg();
        final Pattern p = Pattern.compile("\\/|\\^|\\+|\\-|\\*");
        for (String param : command) {
            if (text.contains(param)) {
                //9if (param.equals("^"))param="exp";
                String[] temp = p.split(text, 2);
                inputParam = new String[]{temp[0], temp[1], param};
                break;
            }
            inputParam[0] = text;
        }
    }

    /**
     * Проверка корректности данных.
     *
     * @param arg Входные данные.
     * @throws UserException Исключения.
     */
    public void checkInput(String[] arg) throws UserException {
        boolean result = false;
        for (int i = 0; i < arg.length - 1; i++) {
            if (!arg[i].matches("^-?\\d+$") || arg[i].equals("")) {
                result = false;
                throw new UserException("incorrect data");
            } else {
                result = true;
            }
        }
        this.next = result;
    }

    /**
     * Вывод результата.
     */
    public void outputResult() {
        System.out.println("Result : " + calc.getResult());
        this.inputArg(calc.getResult());
    }

    /**
     * Опрос пользователя, валидация.
     */
    public void secondInput() {
        System.out.println("Exit : yes/no ");
        exit = reader.next();
        if (exit.equals("no")) {
            System.out.println("Do you want continue older result? : yes/no ");
            secondInput = reader.next();
        }
    }

    /**
     * Обработчик выбора вычисления.
     *
     * @param arg Входные парамметры.
     * @throws Exception Исключения вычисления
     */
    public void choiceOperand(String... arg) throws Exception {
        switch (arg[arg.length-1]) {
            case "^":
                calc.exp(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                break;
            case "+":
                calc.add(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                break;
            case "-":
                calc.sub(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                break;
            case "*":
                calc.pow(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                break;
            case "/":
                calc.div(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                break;
        }
    }
}