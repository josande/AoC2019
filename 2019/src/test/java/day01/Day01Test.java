package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day01Test {

    @Test
    void testPartA_Example1() {
        //For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
        assertEquals(2, Day01.getFuelNeededForMass(12));
    }
    @Test
    void testPartA_Example2() {
        //For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
        assertEquals(2, Day01.getFuelNeededForMass(14));
    }
    @Test
    void testPartA_Example3() {
        //For a mass of 1969, the fuel required is 654.
        assertEquals(654, Day01.getFuelNeededForMass(1969));
    }
    @Test
    void testPartA_Example4() {
        //For a mass of 100756, the fuel required is 33583.
        assertEquals(33583, Day01.getFuelNeededForMass(100756));
    }

    @Test
    void testPartB_Example0() {
        //Any mass that would require negative fuel should instead be treated as if it requires zero fuel
        assertEquals(0, Day01.getFuelNeededForMass(4));
        assertEquals(0, Day01.getFuelNeededForMass(0));
        assertEquals(0, Day01.getFuelNeededForMass(-5));
    }

    @Test
    void testPartB_Example1() {
        //A module of mass 14 requires 2 fuel. This fuel requires no further fuel (2 divided by 3 and rounded down is 0, which would call for a negative fuel), so the total fuel required is still just 2.
        assertEquals(2, Day01.getFuelNeededForMassIncludingFuelWeight(14));
    }
    @Test
    void testPartB_Example2() {
        //At first, a module of mass 1969 requires 654 fuel. Then, this fuel requires 216 more fuel (654 / 3 - 2). 216 then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel, which requires no further fuel. So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.
        assertEquals(966, Day01.getFuelNeededForMassIncludingFuelWeight(1969));
    }
    @Test
    void testPartB_Example3() {
        //The fuel required by a module of mass 100756 and its fuel is: 33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.
        assertEquals(50346, Day01.getFuelNeededForMassIncludingFuelWeight(100756));
    }
}