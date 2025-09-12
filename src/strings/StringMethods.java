package strings;

public class StringMethods {
    public static void main(String[] args) {
//        String name = "   pRat53  ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println("Carpet".startsWith("Car"));
//        System.out.println("Carpet".endsWith("et"));
//        System.out.println("Carpet".equals("Carpet"));
//        System.out.println("Carpet".charAt(3));
//        int age = 123;
//        String stringAge = String.valueOf(age);
//        System.out.println(age+2);//125
//        System.out.println(stringAge+2);//1232

//        String sentence = "I love Java, Java is a good language";
//        String newSentence = sentence.replace("Java", "Python");
//        System.out.println(sentence);
//        System.out.println(newSentence);
//        System.out.println(sentence.contains("Python"));
//        String sentence = "I love Java, Java is a good language";
//        String subString = sentence.substring(2, 5);
//        String subString = sentence.substring(7);
//        System.out.println(subString);
//        String words[] = sentence.split(",");
//        for(String word: words){
//            System.out.println(word);
//        }
        String color = "Brown is my fav colour!";
        char letters[] = color.toCharArray();

        for(char letter: letters){
            System.out.println(letter);
        }

        String animal = "";
        if(animal.isEmpty()) {
            System.out.println("empty");
        }
        String animal2 = " ";
        if(animal2.isBlank()) {
            System.out.println("Blank");
        }






    }
}
