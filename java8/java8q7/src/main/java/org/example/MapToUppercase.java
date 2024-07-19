package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToUppercase
{
    public static void main( String[] args )
    {
        List<String> strawHats = Arrays.asList("Luffy", "Zoro", "Nami", "Usopp", "Sanji", "Chopper", "Robin");
        List<String> uppercasedStrawHats = strawHats.stream().map(String::toUpperCase).collect(Collectors.toList());

        uppercasedStrawHats.forEach(System.out::println);
    }
}