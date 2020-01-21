package src;

class MainJava {

    /**
    * This LongestWord() method will find out the longest word
    * and its length
    */

    static String LongestWord(String str)
    {
        String[] words = str.split(" "); //Spliting each word of the sentence in to an array
        int length = 0;

        String s1 = "";
    /**
    * This for loop will traverse for every word and save its length till it finds the largest word and save it in s1
    */
        for(String word:words){
            if(length < word.length()){
                length = word.length();
                s1=word;
            }
        }
        return s1;
    }

    public static void main(String args[])
    {
        String str = "The cow jumped over the moon";

        String answer = LongestWord(str);

        System.out.println(answer.length());
        System.out.println(answer);

    }
}

