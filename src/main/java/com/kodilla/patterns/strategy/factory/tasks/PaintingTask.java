package com.kodilla.patterns.strategy.factory.tasks;

public class PaintingTask implements Task {


    String taskName;
    String color;
    String whatToPaint;

    boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isExecuted=false;
    }

    @Override
    public void executeTask() {
        isExecuted=true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
