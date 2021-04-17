package ADVANCED.EX08_SETS_AND_MAPS_ADVANCED;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

//        for (String name : names) {
//            System.out.println(name);
//        }

        names.forEach(System.out::println);

    }
}
