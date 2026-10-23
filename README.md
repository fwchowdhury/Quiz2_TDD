# Quiz 2 - TDD Calculator and DateChecker

A small Maven project built with Test Driven Development using JUnit 5.

## How to run the tests

In IntelliJ, open the Maven tool window, expand Quiz2_TDD, open Lifecycle, and double-click test.

From the terminal (Maven must be installed):

    mvn test

All 22 tests should pass.

## Calculator

Calculator has sum, subtract, multiply, divide, and isEven.

divide throws ArithmeticException when the divisor is 0. This comes from Java integer division, and a test checks it with assertThrows.

## DateChecker

Month is a nested enum with the twelve calendar months.

has31Days returns true for January, March, May, July, August, October, and December.

February returns false. The method only models 31-day months, and a test locks this choice in.

Passing null to has31Days throws IllegalArgumentException.