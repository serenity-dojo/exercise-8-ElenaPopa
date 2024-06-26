package com.serenitydojo;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with ArrayLists
 */

// When working with Lists in Java
public class WhenWorkingWithLists {

    // We can create a list containing a specified list of values
    @Test
    public void creatingAListOfValues() {
        //Create a fixed size list
        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).containsExactly("red", "green", "blue");
        //To create immutable lists: List.of("red", "green", "blue") from Java 9+
    }

    // We can add a value an empty list
    @Test
    public void addingAValueToAnEmptyList() {
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "red", "green");
        //instead of adding one by one with colors.add();

        assertThat(colors).containsExactly("red", "green");
    }

    // We can add a value to the end an existing list
    @Test
    public void addingAValueToTheEndList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.add("yellow");

        assertThat(colors).containsExactly("red", "green", "blue", "yellow");
    }

    // We can add a value to the start an existing list
    @Test
    public void addingAValueToTheStartOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.add(0, "yellow");
        assertThat(colors).containsExactly("yellow", "red", "green", "blue");
    }

    // We can delete a value from an existing list
    @Test
    public void deletingAValueInAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        colors.remove("green");

        assertThat(colors).containsExactly( "red", "blue");
    }

    // We can find the number of elements in a list
    @Test
    public void findingTheLengthOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
        int numberOfElements = colors.size();

        assertThat(numberOfElements).isEqualTo(3);
    }
}
