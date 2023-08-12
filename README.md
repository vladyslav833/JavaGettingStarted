# JavaGettingStarted
## Accompanying exercises for Intro to Java for New Engineers learning path

### Prerequisites for this Learning Path
* To follow this learning path, first make sure you have a PluralSight subscription
* Make sure you have set up a GitHub account using your Principal ID under the [Principal USIS Organization](https://github.com/principalusis)
* Install either IntelliJ IDEA Ultimate, IntelliJ IDEA Community Edition, or Visual Studio Code on your local system
* Install Gradle on your local system using [Chocolatey](https://chocolatey.org/), [PowerShell](https://chocolatey.org/install), or from the [Gradle Website](https://gradle.org/install/)
* Create a link in your browser to our [IntelliJ Cheat Sheet]()
  * **Talk about common IntelliJ functions and how to do them**

### Exercise Instructions
* Implement each of the tests one at a time, top down
* Each of the tests in the exercise files will have a @Disabled attribute that must be deleted before that test will run.
* Remove these only as you as you begin working on a new test...do NOT remove all of them at once
* Think about what the tests are in this order and be prepared to discuss it during Office Hours.  There will also be places in the code where you will be asked to answer a question or explain why you did something
* Make sure you commit each change you make as soon as the test you are working on passes so we can look at your progression through the exercise and discuss why you made those choices 

### PluralSight Curriculum
  * Week One
    * Preliminary step
      * Navigate to your [PluralSight Home Page](https://app.pluralsight.com/library/) and select "Role IQ"
        * Find the "Java Fundamentals" under your Skills measurements
          * Take the placement quiz, answering "I don't know yet" if you don't know the answer
          * Please do not guess...you'll be taking this quiz again at the end of the program
          * Capture the results at the end of the quiz and save it so that you can compare to the same quiz at the end of the program
    * Self-study:
      * PluralSight Subscribers
        * Begin course [Getting Started with Programming in Java](https://app.pluralsight.com/library/courses/getting-started-programming-java/table-of-contents)
          * Go through lessons 1 - 3 on PluralSight (1 hr 20 mins)
            * Course Overview
            * Creating your First Java App
            * Variables, Data Types, and Math Operators
      * LinkedIn Learning Subscribers
        * Begin LinkedIn Learning course [Java 8 Essential Learning](https://www.linkedin.com/learning/java-8-essential-training/welcome?u=0)
          * Go through lessons 1 - 4 on LinkdedIn (1 hr 20 mins)
              * Course Overview
              * Creating your First Java App
              * Variables, Data Types, and Math Operators
    * Fork the [JavaGettingStarted](https://github.com/gartee-john-PFG/JavaGettingStarted) repository into your Principal GitHub account
      * Clone your fork repository to your local machine
        * **Note** when you work on the following exercises, be sure to commit after modifying each test
          * push your changes back up to your fork (git push origin HEAD), so your coach can see each individual commit
          * use good comments on your commits, so we can easily follow your progress
          * we can discuss any issues you encounter during Office Hours
    * Work through the coding lesson under the src/test/java directory 
      * WeekOneExercisesPartOne.java
    * Self-study
      * PluralSight Subscribers
        * Go through lesson 4 on PluralSight (40 mins)
          * Conditional Logic and Block Statements
      * Work through the coding lesson WeekOneExercisesPartTwo.java
        * Make sure you push your changes back to your fork on GitHub, so they are visible to the coach during office hours
  * Week Two
    * Go to the PluralSight course [Getting Started with Programming in Java](https://app.pluralsight.com/library/courses/getting-started-programming-java/table-of-contents)
      * Go through lessons 5 (30 min)
        * Looping and Arrays
     * Go through the WeekTwoExercisePartOne.java file in src/test/java and implement each test in the /src/main/java/BowlingGame.java class
        * Make a Git commit after implementing each test with the minimum amount of code required to make the test pass
          * this may including just putting in a literal value...do not add any additional code
          * Hint:  If you complete implementing a test and the next test passes w/o any changes to BowlingGame.java, you did too much and should start over from the previous test.
     * Go through lessons 6 - 7 (1 hrs)
       * Understanding Methods
       * Working with Strings   
     * Go through the WeekTwoExercisePartTwo.java file in src/test/java and implement each test in the /src/main/java/FizzBuzz.java class
       * Make a Git commit after implementing each test with the minimum amount of code required to make the test pass
         * this may including just putting in a literal value...do not add any additional code
         * Hint:  If you complete implementing a test and the next test passes w/o any changes to FizzBuzz.java, you did too much and should start over from the previous test.
     * Go back to the PluralSight course [Getting Started with Programming in Java](https://app.pluralsight.com/library/courses/getting-started-programming-java/table-of-contents)
     * Go through lessions 8 - 9 (1 hrs)
       * String Formatting
       * More About Data Types
     * Go through the WeekTwoExercisePartThree.java file in src/test/java and implement each test
       * Make a Git commit after implementing each test with the minimum amount of code required to make the test pass
           * this may including just putting in a literal value...do not add any additional code
           * Hint:  If you complete implementing a test and the next test passes w/o any changes, you did too much and should remove your changes and try something simpler.
  * Week Three
    * Complete PluralSight [Working with Classes and Interfaces in Java](https://app.pluralsight.com/library/courses/working-classes-interfaces-java/table-of-contents) sections:
       * Course Overview
       * Understanding Java Classes and Objects
       * Implementing Class Constructors and Initializers
       * Using Static Members
       * A Closer Look at Members
    * Exercises
      * Create a small set of class structures in the JavaGettingStarted/src folder
          * Authors and Books
              * Authors have
                  * Name
                  * One or more books
              * Books have
                  * Title
                  * ISBN number
                  * Date published
                  * One or more authors
          * Songs and Songwriters
              * Songs have
                  * One or more songwriters
                  * Title
                  * Release date
              * Songwriters have
                  * A name
                  * One or more songs
          * What would be appropriate methods on each of these classes?
          * Would there be different constructors for these classes?  Why?
          * How would you implement encapsulation on these classes?  Why?
          * build a small command line program that populates and logs the contents of your objects to the console.  
  * Week Four
    * Complete PluralSight [Java Fundamentals: Collections](https://app.pluralsight.com/library/courses/java-collections-fundamentals/table-of-contents) sections:
      * Course Overview
      * What are Collections and Why Use Them?
      * Collections with Iteration Order: Lists
    * Exercises
      * Complete the exercises found in WeekFourExercises.java in the src/test/java folder'
  * Week Five    
    * Complete PluralSight [Working with Classes and Interfaces in Java](https://app.pluralsight.com/library/courses/working-classes-interfaces-java/table-of-contents) sections:
        * Working with Enums
    * Exercises
    * Complete PluralSight [Handling Exceptions in Java](https://app.pluralsight.com/library/courses/handling-exceptions-java/table-of-contents) sections:
      * Course Overview
      * Handling Exceptions
      * Understanding Exception Types
    * Exercise(s)
  * Week six
    * Collections of Pairs: Maps
        * Review and exercises
    * Create a class structure in this project's src directory with the following characteristics of a small ordering system:
        * Create a set of well-named classes that meet the following requirements
            * An order has
                * An order id
                * A Customer
                * A SalesPerson
                * An order number, order date, and order time
                * A collection of Order items
                * A total order amount
                * A sales tax amount
                * A Shipping address
                * A ship date
                * A shipping tracking number
            * A Customer has
                * A customer id
                * First, middle, and last name
                * an address
                * an email address
                * a phone number
            * A SalesPerson has
                * a sales person id
                * First, middle, and last name
                * an email address
                * a phone number
                * a department number
            * An Order Item has
                * An ordered quantity
                * An Inventory item
                * A backorder quantity
                * A shipped quantity
                * An item cost
                * A total cost
            * An Inventory item has
                * An Inventory item id
                * A part number
                * An item cost
                * A description
                * An isTaxable flag
            * An Address has
                * An address id
                * A street 1 address
                * A street 2 address
                * A city
                * A state
                * A postal code
                * An address type (home, work, shipping)
      * At the end of the program, repeat the Skill IQ you took at the beginning      
        * Navigate to your [PluralSight Home Page](https://app.pluralsight.com/library/) and select "Role IQ"
          * Find the "Java Fundamentals" under your Skills measurements
          * Take the placement quiz, answering "I don't know yet" if you don't know the answer
          * Please do not guess...you'll be taking this quiz again at the end of the program
          * Compare the results at the end of the quiz with the same quiz from the beginning of the program
          * Send the before and after results of your Skills IQ to your cohort Coach  
