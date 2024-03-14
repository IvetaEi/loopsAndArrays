import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String name = "Ivetaa";
//        System.out.println(name);
//        System.out.println(name.contains("a"));//ive
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(3)); // paema simbolius nuo 0
//        System.out.println(name.length());
//        System.out.println(name.repeat(5));
//        System.out.println(name.equals("iveta")); //if("a" == "A"){}
//        System.out.println(name.trim());//panaikins tarpus priekyje ir gale
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(1, 5));
//        System.out.println(name.replace("a","i"));
//        System.out.println(name.replaceFirst("a", "i"));
//        System.out.println(name.replaceAll("a", "H"));

        System.out.println("---------------- 1 uzduotis ----------------------");

        String name = "Evan";
        String surname = "Peters";
        if (name.length() < surname.length()){
            System.out.println("Trumpesnis stringas yra vardas: " + name);
        }else{
            System.out.println("Trumpesnis stringas yra pavarde: " + surname);
        }

        System.out.println("---------------- 2 uzduotis ----------------------");

        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        System.out.println("---------------- 3 uzduotis ----------------------");

        String nameNsurname = "Inicialai";
        System.out.println(nameNsurname + ": " + name.charAt(0) + surname.charAt(0));

        System.out.println("---------------- 4 uzduotis ----------------------");

        String last3nameLetters = name.replaceAll(".*?(.?.?.?)?$", "$1");
        String last3surnameLetters = surname.replaceAll(".*?(.?.?.?)?$", "$1");//???

        System.out.println(last3nameLetters + last3surnameLetters);

        System.out.println("---------------- 5 uzduotis ----------------------");

        String american5 = "“An American in Paris”";
        System.out.println(american5.replaceAll("a", "*").replaceAll("A","*"));

        System.out.println("---------------- 6 uzduotis ----------------------");

        String american6 = "“An American in Paris”";
        System.out.println(american6.replaceAll("[aeiouAEIOU]", ""));

        String breakfast = "“Breakfast at Tiffany's”";
        System.out.println(breakfast.replaceAll("[aeiouAEIOU]", ""));

        String space = "“2001: A Space Odyssey”";
        System.out.println(space.replaceAll("[aeiouAEIOU]", ""));

        String life = "“It's a Wonderful Life”";
        System.out.println(life.replaceAll("[aeiouAEIOU]", ""));

        System.out.println("---------------- 7 uzduotis ----------------------");

        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))
                +((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(starWars);
        System.out.println("“A New Hope” is episode: " +  starWars.charAt(starWars.length()-14));

        System.out.println("---------------- 8 uzduotis ----------------------");

        String sentence = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        String[] words = sentence.split(" ");// [] = masyvas, int masyvai tik su skaiciais, string masyvai tik su zodziais

        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() <= 5){
                System.out.println(words[i]);
                count++;
            }
        }

        System.out.println("we have " +count+ " words which length is shorter than 6");


        System.out.println("---------------------------------------------------------");


//        String sentence1 = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
//        String[] words1 = sentence1.split(" "); //susiskaldom zodzius
//
//        int count1 = 0;
//        for(int z = 0; z < words1.length; z++){
//            if (words1[z].length() <= 5){        //int z
//                System.out.println(words1[z]);
//                count1++;
//            }
//        }
//
//        System.out.println("yra " + count1 + " zodziai(-iu), kurie turi maziau raidziu nei 6");

        int[] numbers = new int[]{3, 5, 2, 6, 3, 8, 2, 4, 10, 2 };



        for (int a = 0; a < numbers.length ;a+=2){
            if (numbers[a] > 5)
            {
                System.out.println(numbers[a]);
            }
        }



//        List<String> filtered = Arrays.stream(words).filter(word -> word.length() <= 5).toList();
//        filtered.forEach(s -> System.out.println(s));
//        System.out.println(filtered.stream().count());
//
//        if (countWords <= 5){
//            System.out.println("zodziai, kurie turi 5 arba maziau raidziu yra: " + countWords);
//        }









    }
}