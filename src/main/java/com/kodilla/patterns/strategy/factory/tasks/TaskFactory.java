package com.kodilla.patterns.strategy.factory.tasks;

import com.kodilla.patterns.strategy.factory.Circle;
import com.kodilla.patterns.strategy.factory.Rectangle;
import com.kodilla.patterns.strategy.factory.Shape;
import com.kodilla.patterns.strategy.factory.Square;

public class TaskFactory {



    public static final String SHOPINGTASK = "SHOPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTask(final String typeOfTask,
                               String taskName,
                               String colorOrWhereOrWhatToBuy,
                               String whatToPaintOrUsingOrQuantity) {
        switch (typeOfTask) {
            case SHOPINGTASK:
                return new ShoppingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        Double.parseDouble(whatToPaintOrUsingOrQuantity));
            case PAINTINGTASK:
                return new PaintingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        whatToPaintOrUsingOrQuantity);
            case DRIVINGTASK:
                return new DrivingTask(taskName,
                        colorOrWhereOrWhatToBuy,
                        whatToPaintOrUsingOrQuantity);
            default:
                return null;
        }
    }
}
