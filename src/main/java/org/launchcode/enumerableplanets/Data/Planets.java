package org.launchcode.enumerableplanets.Data;

public enum Planets {
    // list the planets here.
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    public final String planetName;
    private final String yearLength;

    Planets(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }

    Planets(int yearLength) {
        this.yearLength = yearLength;
    }

    public String getYearLength() {
        return yearLength;
    }

    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list
}
}
