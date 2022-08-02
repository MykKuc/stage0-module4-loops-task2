package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String aWord = "";
        int counter = 1;
        while(counter <= chars.length ){
            aWord = aWord + chars.toString();
            counter++;
        }
        for (char c : chars) {
            aWord = aWord + c;
        }
        System.out.println(aWord);
    }




    }

