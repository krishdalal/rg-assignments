package org.example;

import java.util.Optional;

public class OptionalExample
{
    public static void main( String[] args )
    {
        String email = "luffy@gamil.com";
        String fun = "gum gum luffy";
        Optional<String> emailOptional = Optional.of(email);
        Optional<String> funOptional = Optional.of(fun);

        emailOptional.filter(res -> res.contains("luffy")).ifPresent(System.out::println);
        funOptional.filter(res -> res.contains("luffy")).ifPresent(System.out::println);
    }
}