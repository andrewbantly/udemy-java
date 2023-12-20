import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        // Array of type String
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};
        
        for (int i = 0; i < kingdoms.length ; i++) {
            System.out.println("The kingdom at index " + i + " is " + kingdoms[i]);
        }

        // For each loop
        for (String kingdom : kingdoms) {
            System.out.println(kingdom);
        }
        String[] menu = {"Espresso", "Cortado", "Black Coffee"};
        System.out.println(menu); // [Ljava.lang.String;@c387f44
        System.out.println(Arrays.toString(menu)); // [Espresso, Cortado, Black Coffee]
        
        // once you create an array you can't resize it
        String[] newMenu = new String[5]; // [null, null, null, null, null]
        for (int i = 0; i < menu.length; i++) {
            // System.out.println(i + ". " + menu[i]);
            newMenu[i] = menu[i];
        }
        newMenu[3] = "Latte";
        newMenu[4] = "Tea";

        System.out.println(Arrays.toString(newMenu));

        // AVOID THE REFERENCE TRAP
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = numbers;
        numbers2[0] = 9;
        // both numbers AND numbers2 arrays change index value to 9 because they both have the same reference to the same array
        System.out.println(Arrays.toString(numbers)); // [9, 2, 3, 4, 5]
        System.out.println(Arrays.toString(numbers2)); // [9, 2, 3, 4, 5]

        // SOLUTION TO REFERENCE TRAP. MAKE A NEW ARRAY AND COPY EACH VALUE INDIVIDUALLY

        String[] dogNames = { "Lacey", "Buster"};
        String[] dogNamesNew = new String[2];
        for (int i = 0; i < dogNames.length; i++) {
            dogNamesNew[i] = dogNames[i];
        }
        dogNamesNew[0] = "Murphy";

        // OR USE Arrays.copyOf()

        String[] doggyNames = Arrays.copyOf(dogNames, dogNames.length);
        doggyNames[0] = "Murphy";
        System.out.println(Arrays.toString(doggyNames));
    }   
}