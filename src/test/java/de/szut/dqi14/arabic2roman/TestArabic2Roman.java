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
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {6, "VI"},
                {7, "VII"},
                {8, "VIII"},
                {9, "IX"},
                {10, "X"},
                {11, "XI"},
                {12, "XII"},
                {13, "XIII"},
                {14, "XIV"},
                {15, "XV"},
                {16, "XVI"},
                {17, "XVII"},
                {18, "XVIII"},
                {19, "XIX"},
                {20, "XX"},
                {21, "XXI"},
                {22, "XXII"},
                {23, "XXIII"},
                {24, "XXIV"},
                {25, "XXV"},
                {20, "XX"},
                {25, "XXV"},
                {30, "XXX"},
                {35, "XXXV"},
                {40, "XL"},
                {45, "XLV"},
                {50, "L"},
                {55, "LV"},
                {60, "LX"},
                {65, "LXV"},
                {70, "LXX"},
                {75, "LXXV"},
                {80, "LXXX"},
                {85, "LXXXV"},
                {90, "XC"},
                {95, "XCV"},
                {100, "C"},
                {105, "CV"},
                {110, "CX"},
                {115, "CXV"},
                {120, "CXX"},
                {125, "CXXV"},
                {130, "CXXX"},
                {135, "CXXXV"},
                {140, "CXL"},
                {100, "C"},
                {125, "CXXV"},
                {150, "CL"},
                {175, "CLXXV"},
                {200, "CC"},
                {225, "CCXXV"},
                {250, "CCL"},
                {275, "CCLXXV"},
                {300, "CCC"},
                {325, "CCCXXV"},
                {350, "CCCL"},
                {375, "CCCLXXV"},
                {400, "CD"},
                {425, "CDXXV"},
                {450, "CDL"},
                {475, "CDLXXV"},
                {500, "D"},
                {525, "DXXV"},
                {550, "DL"},
                {575, "DLXXV"},
                {600, "DC"},
                {625, "DCXXV"},
                {650, "DCL"},
                {675, "DCLXXV"},
                {700, "DCC"},
                {750, "DCCL"},
                {825, "DCCCXXV"},
                {900, "CM"},
                {975, "CMLXXV"},
                {1050, "ML"},
                {1125, "MCXXV"},
                {1200, "MCC"},
                {1275, "MCCLXXV"},
                {1350, "MCCCL"},
                {1425, "MCDXXV"},
                {1500, "MD"},
                {1575, "MDLXXV"},
                {1650, "MDCL"},
                {1725, "MDCCXXV"},
                {1800, "MDCCC"},
                {1875, "MDCCCLXXV"},
                {1950, "MCML"},
                {2018, "MMXVIII"},
                {2025, "MMXXV"},
                {2100, "MMC"},
                {2175, "MMCLXXV"},
                {2250, "MMCCL"},
                {2325, "MMCCCXXV"},
                {2400, "MMCD"},
                {2475, "MMCDLXXV"},
                {2550, "MMDL"},
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
