# Coding Kata
 
 This is an adapted version of Dave Thomas' 'Munging Data' coding kata, as published on http://codekata.com/kata/kata04-data-munging/.
 Credit goes to Dave for the inspiration.

## The Challenge

You have exported some forecast data collected from a weather station in Manchester out of a legacy system, and been asked to write a program that analyses the data.
 
In [data/forecast.dat](data/forecast.dat), you will find the data exported.
  
The program should do the following (in priority order):
   
1. output the day number (column one) with the smallest temperature spread (the maximum temperature is the second column, the minimum the third column so the difference between the two is the spread)

2. output all day numbers where the average temperature (column 3) was greater than 25 degrees celsius (temperature data is in fahrenheit)

3. output all day numbers and the corresponding average temperature for all days where we know the probability of precipitation (PoP) for the whole of Manchester will be greater than 30%

Using the forecast data we have, we can calculate the minimum known PoP for the whole of Manchester using a couple steps:
   * first multiply the percent of the forecast area that will receive measurable precipitation (AoP) by the confidence that precipitation will occur somewhere in the forecast area (CoP) 
   * then multiply the result of the above by 80%, which accounts for the fact the area covered by the forecast data makes up 80% of the area of Manchester


## Some Rules

Your aim throughout this exercise is to apply Bob Martin's three rules of TDD. The rules are:

1. You are not allowed to write any production code unless it is to make a failing unit test pass.
2. You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
3. You are not allowed to write any more production code than is sufficient to pass the one failing unit test. 

For more details see:
[the 97 Things Every Programmer Should Know website](http://programmer.97things.oreilly.com/wiki/index.php/The_Three_Laws_of_Test-Driven_Development) and 
 [Bob Martin's website](http://butunclebob.com/ArticleS.UncleBob.TheThreeRulesOfTdd)
 
 

## Getting Started

### Prerequisites

You will need a JDK installed, Java 8 ideally, but you can change the targetCompatibility and sourceCompatibility in the build.gradle file if using a lower version.

For speed, a skeleton structure has been included in this repository already. This includes: 

* a runnable java application, bootstrapped in src/main/java/uk/gov/metoffice/kata/ForecastAnalyzer.java
* a dummy unit test in src/main/java/uk/gov/metoffice/kata/...
* a dummy cucumber test with the scenario written in src/main/resources/features/kata.feature and the initial step definitions in src/main/java/uk/gov/metoffice/kata/features/KataSteps.java
* a gradle build file - gradle was used instead of maven to avoid the need for developer's to have any build tool pre-installed (you can run gradle using the wrapper script in this repo.)
* the build.gradle file includes some useful dependencies such as cucumber, junit, mockito and powermockito
* a comment in the build.gradle file explains how to add further non-test specific dependencies

to run the application:

* Mac: ./gradlew run
* Windows: gradlew.bat run

To run the tests (JUnit and Cucumber):

* Mac: ./gradlew test cucumber
* Windows: gradlew.bat test cucumber

To run just the cucumber tests (cucumber) or just the junit tests (test), remove the relevant argument passed to the gradlew script.