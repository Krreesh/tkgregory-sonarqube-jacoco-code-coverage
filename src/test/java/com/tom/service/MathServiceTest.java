package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        int result = mathService.multiply(2, 4);
        int result2 = mathService.subtract(4, 2);
        assertThat(result, equalTo(8));
    }
    @Test
    public void subtractsNumbers() {        
        int result = mathService.subtract(4, 2);
        assertThat(result, equalTo(2));
    }
}
