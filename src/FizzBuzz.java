public class FizzBuzz {
    public String play(int num){
        String mynum=String.valueOf(num);
        if((num%3==0 && num%5==0)||(mynum.contains("3")&&mynum.contains("5"))){
            return "FizzBuzz";
        }
        if(num%3==0||mynum.contains("3")){
            return "Fizz";
        }
        if(num%5==0||mynum.contains("5")){
            return "Buzz";
        }
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz=new FizzBuzz();
        for(int i =1;i<=100;i++){
            System.out.println(fizzBuzz.play(i));
        }
    }
}
