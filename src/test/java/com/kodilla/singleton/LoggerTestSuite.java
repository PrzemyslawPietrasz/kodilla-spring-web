package com.kodilla.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {


    @Test
    public void getLastLogTest(){
        //Given
        String log = "1st log";
        String log2 = "2nd log";
        //When
        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);
        //Then
        Assertions.assertEquals(log2, Logger.getInstance().getLastLog());
    }
}



