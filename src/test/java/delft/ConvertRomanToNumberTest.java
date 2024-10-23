package delft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConvertRomanToNumberTest {

    @ParameterizedTest
    @MethodSource("generator")
    void convertRomantoNumberTest(String input, int expected)
    {

        int result = ConvertRomanToNumber.convertStringToNumber(input);
        assertEquals(result,expected);

    }

    public static Stream<Arguments> generator ()
    {
        Arguments tc1 = Arguments.of("I",1);
        Arguments tc2 = Arguments.of("0",0);
        Arguments tc3 = Arguments.of("-I",1);
        Arguments tc4 = Arguments.of("III", 3);
        Arguments tc5 = Arguments.of("D", 500);
        Arguments tc6 = Arguments.of("L", 50);
        Arguments tc7 = Arguments.of("M", 1000);
        Arguments tc8 = Arguments.of("V", 5);
        Arguments tc9 = Arguments.of("IV", 4);
        Arguments tc10 = Arguments.of("VI", 6);
        Arguments tc11 = Arguments.of("IVIII", 7);
        Arguments tc12 = Arguments.of("X", 10);
        Arguments tc13 = Arguments.of("dfvwd",0);
        Arguments tc14 = Arguments.of("IIIIIIII",8);
        Arguments tc15 = Arguments.of("iiiiimviv",0);
        Arguments tc16 = Arguments.of("iiiiimviv",0);
        Arguments tc17 = Arguments.of("K",33);
        Arguments tc18 = Arguments.of("C",100);





        return Stream.of(tc1,tc2,tc3,tc4,tc5,tc6,tc7,
                tc8,tc8,tc9,tc10,tc11,tc12,
                tc13,tc14,tc15,tc16,
                tc17,tc18);
    }

    @ParameterizedTest
    @MethodSource("AddTest")
    void AddTest(String input,String input1, int expected)
    {

        int result = ConvertRomanToNumber.add(input,input1);
        assertEquals(result,expected);

    }
    public static Stream<Arguments> AddTest () {

        Arguments tc1 = Arguments.of("I","I",2);
        Arguments tc2 = Arguments.of("0","0",0);
        Arguments tc3 = Arguments.of("M","M",2000);
        Arguments tc4 = Arguments.of("X","M",1010);
        Arguments tc5 = Arguments.of("wgfhbv","M",1000);
        Arguments tc6 = Arguments.of("-X","M",1010);
        Arguments tc7 = Arguments.of("K","M",1033);
        Arguments tc8 = Arguments.of("C","M",1100);





        return Stream.of(tc1,tc2,tc3,tc4,tc5,tc6,tc7,tc8);
    }
//    @Test
//    public void testIIIII()
//    {
//        assertEquals(ConvertRomanToNumber.convertStringToNumber("IIIIIIII"),8);
//    }




}
