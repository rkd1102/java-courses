package ru.lesson.lessons;

/**
 * класс калькулятор
 */

public class Calculator {
    /**
     * результат вычисления.
     */
    private int result;

    /**
     * суммитуем аргументы
     *
     * @param a первый аргумент.
     * @param b второй аргумент.
     */
    public void add(int a, int b) {
        this.result = a + b;
    }

    /**
     * Разность аргументов.
     */
    public void sub(int a, int b) {
        this.result = a - b;
    }

    /**
     * Произведение двух аргументов.
     */
    public void pow(int a, int b) {
        this.result = a * b;
    }

    /**
     * Выполняем деление
     *
     * @param args аргументы
     * @throws UserException если нет аргументов, выкидываем исключение.
     */
    public void div(int... args) throws Exception {
        this.result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == 0) throw new IllegalAccessException("You try to div 0. Please change args.");
            this.result /= args[i];
        }
    }

    /**
     * Возведение в степень
     */
    public void exp(int a, int b) {
        this.result = (int) Math.pow(a, b);
    }

    /**
     * Метод доступа к переменной.
     *
     * @return возращает полученый результат.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Очистка результата.
     */
    public void cleanResult() {
        this.result = 0;
    }


};
