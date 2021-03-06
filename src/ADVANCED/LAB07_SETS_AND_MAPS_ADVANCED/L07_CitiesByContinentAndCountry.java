package ADVANCED.LAB07_SETS_AND_MAPS_ADVANCED;

import java.util.*;
import java.util.stream.Collectors;

public class L07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> info = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            info.putIfAbsent(continent, new LinkedHashMap<>());
            info.get(continent).putIfAbsent(country, new ArrayList<>());
            info.get(continent).get(country).add(city);

        }

        info.entrySet()
                .forEach(entry -> {
                    System.out.printf("%s:%n", entry.getKey());
                    entry.getValue().forEach((k, v) -> {
                        System.out.printf("  %s -> %s%n", k,
                                v.stream().collect(Collectors.joining(", ")));
                    });
                });

    }
}
