package com.jiespace.guava;


import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GuavaTest {
    @Test
    public void collection() {
        List<Integer> integers = Ints.asList(1, 2, 3);
        List<Integer> integers1 = Ints.asList(4, 5, 6);
        Iterable<Integer> concatenated = Iterables.concat(integers, integers1); // concatenated包括元素 1, 2, 3, 4, 5, 6
        Lists.newArrayList(concatenated);
        System.out.println(concatenated);
        Iterables.elementsEqual(integers1,integers);
        System.out.println(Iterables.elementsEqual(integers1,integers));
        int lastAdded = Iterables.getLast(concatenated);//返回iterable的第一个元素，若iterable为空则返回默认值
        System.out.println(lastAdded);
        System.out.println(concatenated);
        int theElement = Iterables.getOnlyElement(concatenated);
        System.out.println(theElement);
    }

    @Test
    public void tttt(){
        List countUp = Ints.asList(1, 2, 3, 4, 5);
        List countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        System.out.println(countDown);
        List<List> parts = Lists.partition(countUp, 2);//{{1,2}, {3,4}, {5}}
        System.out.println(parts);
    }

    @Test
    public void ttttt(){
        Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
        Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
        System.out.println(Sets.union(wordsWithPrimeLength,primes));
        System.out.println(Sets.intersection(wordsWithPrimeLength,primes));
        System.out.println(Sets.difference(primes,wordsWithPrimeLength));
        System.out.println(Sets.symmetricDifference(wordsWithPrimeLength,primes));
    }

    @Test
    public void ttt11(){
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");

        Set<List<String>> product = Sets.cartesianProduct(animals, fruits);
        System.out.println(product);
        Set<Set<String>> animalSets = Sets.powerSet(animals);
        System.out.println(animalSets);
    }

    @Test
    public void ttwew(){
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("rty");
        stringList.add("wvs22");
        stringList.add("ns3");
        stringList.add("fsd");
        stringList.add("shsdfhs");

        System.out.println(String.join(";",stringList));
    }
}
