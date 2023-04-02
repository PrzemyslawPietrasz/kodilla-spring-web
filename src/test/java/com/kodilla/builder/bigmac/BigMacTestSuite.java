package com.kodilla.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.BigMac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .ingredient("Onion")
                .bun("Regular")
                .sauce("BBQ")
                .ingredient("Becon")
                .ingredient("Mushrooms")
                .burgers(3)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(3,howManyBurgers);
        assertEquals("Regular",whatBun);
        assertEquals("BBQ",whatSauce);
    }


}
