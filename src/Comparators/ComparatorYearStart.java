package Comparators;

import kg.megacom.SovietUnionLeaders;

import java.util.Comparator;

public class ComparatorYearStart implements Comparator<SovietUnionLeaders> {

    @Override
    public int compare(SovietUnionLeaders o1, SovietUnionLeaders o2) {
       return o1.getYearStart() - o2.getYearStart();
    }
}
