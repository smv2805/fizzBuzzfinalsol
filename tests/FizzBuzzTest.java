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
    @Test
    void Testdivi3(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(6);
        assertEquals("Fizz",result);

    }
    @Test
    void test5(){FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(5);
        assertEquals("Buzz",result);

    }
    @Test
    void testDivi5(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(10);
        assertEquals("Buzz",result);
    }
    @Test
    void testDivisible3and5(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.play(15);
        assertEquals("FizzBuzz",result);

    }

}