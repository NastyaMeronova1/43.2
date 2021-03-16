package kg.megacom;

import Comparators.ComparatorCountry;
import Comparators.ComparatorYearEnd;
import Comparators.ComparatorYearStart;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeMap<SovietUnionLeaders,String> treeMap = new TreeMap<>();
        treeMap.put(new SovietUnionLeaders("Joseph Stalin","Uzbekistan", 1924, 1953),"USSR");
        treeMap.put(new SovietUnionLeaders("Georgy Malenkov", "Azerbaijan",1953, 1953),"USSR");
        treeMap.put(new SovietUnionLeaders("Vladimir Lenin", "Georgia",1922, 1924),"USSR");
        treeMap.put(new SovietUnionLeaders("Yuri Andropov", "Russia",1982, 1984), "USSR");
        treeMap.put(new SovietUnionLeaders("Konstantin Chernenko","Chechnya", 1984, 1985),"USSR");
        treeMap.put(new SovietUnionLeaders("Nikita Khrushchev","Kyrgyzstan", 1953, 1964),"USSR");
        treeMap.put(new SovietUnionLeaders("Leonid Brezhnev", "Turkmenistan",1964, 1982),"USSR");
        treeMap.put(new SovietUnionLeaders("Mikhail Gorbachev", "Moldova",1985, 1991),"USSR");
        System.out.println("________________________________________________Sorted by name-----------------------------");
        treeMap.forEach((k,v)-> System.out.println(k + " " + v));
        System.out.println("_____________________________________________Sorted by start of year-----------------------");
        TreeMap<SovietUnionLeaders,String> treeMapTwo = new TreeMap<>(new ComparatorYearStart());
        treeMapTwo.put(new SovietUnionLeaders("Yuri Andropov", "Russia",1982, 1984), "USSR");
        treeMapTwo.put(new SovietUnionLeaders("Konstantin Chernenko","Chechnya", 1984, 1985),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Leonid Brezhnev", "Turkmenistan",1964, 1982),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Mikhail Gorbachev", "Moldova",1985, 1991),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Joseph Stalin","Uzbekistan", 1924, 1953),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Georgy Malenkov", "Azerbaijan",1953, 1953),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Vladimir Lenin", "Georgia",1922, 1924),"USSR");
        treeMapTwo.put(new SovietUnionLeaders("Nikita Khrushchev","Kyrgyzstan", 1953, 1964),"USSR");
        treeMapTwo.forEach((k,v)-> System.out.println(k + " " + v));
        System.out.println("_________________________________________________Sorted by end of year-------------------------");
        TreeMap<SovietUnionLeaders,String> treeMapThree = new TreeMap<>(new ComparatorYearEnd());
        treeMapThree.put(new SovietUnionLeaders("Nikita Khrushchev","Kyrgyzstan", 1953, 1964),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Leonid Brezhnev", "Turkmenistan",1964, 1982),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Mikhail Gorbachev", "Moldova",1985, 1991),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Yuri Andropov", "Russia",1982, 1984), "USSR");
        treeMapThree.put(new SovietUnionLeaders("Konstantin Chernenko","Chechnya", 1984, 1985),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Joseph Stalin","Uzbekistan", 1924, 1953),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Georgy Malenkov", "Azerbaijan",1953, 1953),"USSR");
        treeMapThree.put(new SovietUnionLeaders("Vladimir Lenin", "Georgia",1922, 1924),"USSR");
        treeMapThree.forEach((k,v)-> System.out.println(k + " " + v));
        System.out.println("_________________________________________________Sorted by country---------------------------");
        TreeMap<SovietUnionLeaders,String> treeMapFour = new TreeMap<>(new ComparatorCountry());
        treeMapFour.put(new SovietUnionLeaders("Konstantin Chernenko","Chechnya", 1984, 1985),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Joseph Stalin","Uzbekistan", 1924, 1953),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Yuri Andropov", "Russia",1982, 1984), "USSR");
        treeMapFour.put(new SovietUnionLeaders("Nikita Khrushchev","Kyrgyzstan", 1953, 1964),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Leonid Brezhnev", "Turkmenistan",1964, 1982),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Georgy Malenkov", "Azerbaijan",1953, 1953),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Vladimir Lenin", "Georgia",1922, 1924),"USSR");
        treeMapFour.put(new SovietUnionLeaders("Mikhail Gorbachev", "Moldova",1985, 1991),"USSR");
        treeMapFour.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
