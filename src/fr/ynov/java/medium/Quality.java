package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    private final int id;
    private final String name;

    //Quality constructor
    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Quality obj2) {
            return id == obj2.id && Objects.equals(name, obj2.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    public static void main(String[] args) {
        Quality quality1 = new Quality(1,  "John Doe");
        Quality quality2 = new Quality(1,   "John Doe");

        final boolean twoEquals = quality1 == quality2;
        System.out.println(twoEquals);
        final boolean equalsMethod = quality1.equals(quality2);
        System.out.println(equalsMethod);
    }
}
