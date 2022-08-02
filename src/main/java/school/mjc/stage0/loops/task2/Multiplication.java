package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 0;
        int counter = 0;


        if(multiplyByAndToInclusive == 0){
            System.out.println("");
        }
         if(multiplyByAndToInclusive < 0){
            while(counter >= multiplyByAndToInclusive){
                result = counter*multiplyByAndToInclusive;
                System.out.println(result);
                counter--;
            }
        }else if(multiplyByAndToInclusive > 0){
            while(counter <= multiplyByAndToInclusive){
                result = counter*multiplyByAndToInclusive;
                System.out.println(result);
                counter++;
            }
        }

    }
}
