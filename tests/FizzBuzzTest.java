import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testCommonNum() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(1);
        assertEquals("1",result);
    }
    @Test
    void test3(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(3);
        assertEquals("Fizz",result);
    }
}