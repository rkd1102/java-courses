package ru.lesson.lessons;

/**
 * ����� �����������
 */

public class Calculator {
    /**
     * ��������� ����������.
     */
    private int result;

    /**
     * ��������� ���������
     *
     * @param a ������ ��������.
     * @param b ������ ��������.
     */
    public void add(int a, int b) {
        this.result = a + b;
    }

    /**
     * �������� ����������.
     */
    public void sub(int a, int b) {
        this.result = a - b;
    }

    /**
     * ������������ ���� ����������.
     */
    public void pow(int a, int b) {
        this.result = a * b;
    }

    /**
     * ��������� �������
     *
     * @param args ���������
     * @throws UserException ���� ��� ����������, ���������� ����������.
     */
    public void div(int... args) throws Exception {
        this.result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == 0) throw new IllegalAccessException("You try to div 0. Please change args.");
            this.result /= args[i];
        }
    }

    /**
     * ���������� � �������
     */
    public void exp(int a, int b) {
        this.result = (int) Math.pow(a, b);
    }

    /**
     * ����� ������� � ����������.
     *
     * @return ��������� ��������� ���������.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * ������� ����������.
     */
    public void cleanResult() {
        this.result = 0;
    }


};
