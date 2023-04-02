package com.kodilla.factory.tasks;

import com.kodilla.patterns.strategy.factory.tasks.ShoppingTask;
import com.kodilla.patterns.strategy.factory.tasks.Task;
import com.kodilla.patterns.strategy.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testMakeShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPINGTASK,
                "My shopping list",
                "MILK",
                "5");
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
        //Then
        Assertions.assertEquals("My shopping list", shopping.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK,
                "My painting task", "black", "my house");
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //Then
        Assertions.assertEquals("My painting task", painting.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK,
                "My driving task", "to new york", "my car");
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assertions.assertEquals("My driving task", driving.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testNullTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task nullTask = taskFactory.makeTask("Null",
                "My null task", "", "");
        //Then
        Assertions.assertNull(nullTask);
    }
}