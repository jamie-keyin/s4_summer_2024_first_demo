package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testIsActiveByDefault() {
        Assertions.assertTrue(new Car().isActive());
    }
}
