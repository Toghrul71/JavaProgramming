package Day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";

        int frequency =0;

        while (str.toUpperCase().contains("JAVA")){
            str = str.replaceFirst("Java", "");
            frequency++;

        }
        System.out.println("frequency = " + frequency);

        System.out.println("----------------------------------------");

        String sentence = "cat cat cat "; // 3 cats
        int countCat=0;

        while (sentence.toUpperCase().contains("CAT")){
            sentence=sentence.replaceFirst("cat",""); // replaces cat 3 times
            countCat++;
        }
        System.out.println("is"+sentence);
        System.out.println("cat count is: " + countCat);

        System.out.println("---------------------------------------------------------------------");

        String s = "java java java python python python";

        int countJava=0;
        int countPython=0;

        while (s.contains("java")|| s.contains("python")){
            if(s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if(s.contains("python")){
                s=s.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println("countPython = " + countPython);
    }




}
