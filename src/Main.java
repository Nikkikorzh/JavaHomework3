import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthCat = 10;

        List<String> strings = new ArrayList<>();
        Map<String,String> cats = new LinkedHashMap<>();

        Cat[] classCat = new Cat[lengthCat];

        for (int i = 0;i< classCat.length;i++) {
            System.out.println("Введите имя кота " + (i+1) + ": ");
            String catName = in.nextLine();
            System.out.println("Введите цвет кота " + (i+1) + ": ");
            String catColor = in.nextLine();
            classCat[i] = new Cat(catName,catColor);
            cats.putIfAbsent(classCat[i].GetName(),classCat[i].GetColor());
        }
        System.out.println("Список ключей");
        System.out.println(cats.keySet());
        System.out.println("Список ключ-значение");
        System.out.println(cats);
        String text = "";
        int numberOfString = 1;

        System.out.println();

        while(!(text.equals("end"))) {
            System.out.println("Введите " + numberOfString + " строку!");
            text = in.nextLine();
            strings.add(text);
            numberOfString++;
        }

        for (int i = 0 ; i < strings.size() - 1 ; i++) {
            System.out.println(strings.get(i));
        }




    }
}