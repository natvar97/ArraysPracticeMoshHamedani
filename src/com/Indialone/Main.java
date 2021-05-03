package com.Indialone;

import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Set<Character> sets = new HashSet<>();
        String string = "green apple";

        CharFinder finder = new CharFinder();
        var result = finder.findFirstRepeatingCharacter("green apple");
        System.out.println(result);
    }
}
