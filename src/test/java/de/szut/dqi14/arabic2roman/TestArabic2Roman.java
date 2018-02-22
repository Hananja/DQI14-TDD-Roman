package de.szut.dqi14.arabic2roman;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestArabic2Roman {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, "I" }, { 2, "II" }, { 3, "III" },
                { 4, "IV"}, { 5, "V"}, { 6, "VI"},
                { 7, "VII"}, { 8, "VIII"}, {9, "IX"},
                {10, "X"}, {11, "XI"}, {12, "XII"},
                { 13, "XIII"}, { 14, "XIV"}, {15, "XV"},
                { 16, "XVI"}, { 17, "XVII"}, {18, "XVIII"},
                { 19, "XIX"}, {20, "XX"}, { 29, "XXIX"},
                { 30, "XXX"},{ 31, "XXXI"}, {40, "XL"}
        });
    }

    private int inputParameter;
    private String expectedResult;
    private Converter sutConverter;

    public TestArabic2Roman(int inputParameter, String expectedResult) {
        this.inputParameter = inputParameter;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        sutConverter = new Converter();
    }

    @Test
    public void test() {
        assertEquals(
                String.format("Test % 3d",inputParameter),
                expectedResult, sutConverter.convert(inputParameter));
    }
}
