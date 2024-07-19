package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo
{
    public static void main( String[] args )
    {
        List<String> strawHats = Arrays.asList("Luffy", "Zoro", "Nami", "Usopp", "Sanji", "Chopper", "Robin");

        // First using lambda expression
        List<String> uppercasedStrawHats1 = strawHats.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercasedStrawHats1);

        // Second using method reference
        List<String> uppercasedStrawHats2 = strawHats.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercasedStrawHats2);
    }
}