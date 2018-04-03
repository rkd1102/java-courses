package ru.lesson.lessons;
public class ArgRunner {
    static int oldResult;

    public void inputArg(int result) {
           this.oldResult=result;
    }

    public int getArg() {
        return  this.oldResult;
    }

    public void cleanArg() {
        this.oldResult=0;
    }
}
