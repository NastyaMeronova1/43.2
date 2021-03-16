package Comparators;

import kg.megacom.SovietUnionLeaders;

import java.util.Comparator;

public class ComparatorCountry implements Comparator<SovietUnionLeaders> {
    @Override
    public int compare(SovietUnionLeaders o1, SovietUnionLeaders o2) {
       return o1.getCountry().compareTo(o2.getCountry());
    }
}
