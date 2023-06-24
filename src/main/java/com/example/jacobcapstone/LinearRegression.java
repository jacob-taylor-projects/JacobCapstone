package com.example.jacobcapstone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class LinearRegression {
    private static final List<Double> yearsofexperience = asList(1.1, 1.3, 1.5, 2.0, 2.2, 2.9, 3.0,
            3.2,3.2,3.7,3.9,4.0,4.0,4.1,4.5,4.9,5.1,5.3, 5.9,
            6.0,6.8,7.1,7.9,8.2,8.7,9.0,9.5,9.6,10.3,10.5);



    private static final List<Integer> salary = asList(39343,46205,37731,43525,39891,56642,60150,
            54445,64445,57189,63218,55794,56957,57081,61111,67938,66029,83088,81363,93940,91738,
            98273,101302,113812,109431,105582,116969,112635,122391,121872);

    static double predictForSalary(Double predictForDependentVariable) {
                Integer numberOfDataValues = yearsofexperience.size();

        List<Double> xSquared = yearsofexperience
                .stream()
                .map(position -> Math.pow(position, 2))
                .collect(Collectors.toList());

        List<Double> xMultipliedByY = IntStream.range(0, numberOfDataValues)
                .mapToDouble(i -> yearsofexperience.get(i) * salary.get(i))
                .boxed()
                .collect(Collectors.toList());

        Double xSummed = yearsofexperience
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Integer salarySummed = salary
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Double sumOfyearsSquared = xSquared
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        Double sumOfXMultipliedByY = xMultipliedByY
                .stream()
                .reduce((prev, next) -> prev + next)
                .get();

        double slopeNominator = (numberOfDataValues * sumOfXMultipliedByY - salarySummed * xSummed);
        Double slopeDenominator = numberOfDataValues * sumOfyearsSquared - Math.pow(xSummed, 2);
        Double slope = slopeNominator / slopeDenominator;

        double interceptNominator = salarySummed - slope * xSummed;
        double interceptDenominator = numberOfDataValues;
        Double intercept = interceptNominator / interceptDenominator;

        return (slope * predictForDependentVariable) + intercept;
    }
}