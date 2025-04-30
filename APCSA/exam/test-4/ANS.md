> **APCSA - PRACTICE TEST 4 ANSWER SHEET**

**THESE ANSWERS ARE VERIFIED TO BE CORRECT BUT DOUBLE CHECK IF YOU WANT**

# MCQ ANSWER SHEET

1.  >   **A**
    >
    >>  You start with the division in the second pair of parenthesis to get a result of 2.5. This is not the final answer, however, so (B) is not correct. When this number is cast to an integer by the (<code>int</code>), it removes the decimal to result in a final value of 2. Casting to an integer never rounds so (C) is incorrect.

2.  >   **E**
    >
    >>  The += operator is a shortcut to adding to a numeric variable. Answer (A) is incorrect because it changes the value of num to 1 instead of adding 1. Answer (B) successfully adds 1 to the value of num, but it does not store the new result in num so the variable remains unchanged. (C) would be correct without the 1 at the end, but as written it would result in a syntax error. (D) is incorrect because in an assignment statement, the variable being assigned a value needs to appear on the left.

3.  >   **C**
    >
    >>  The <code>Math.random()</code> method returns a number between 0 and 1 (exclusive). Since 0 is the smallest number the method can return, we need to add 5 to reach the minimum number we want. That eliminates options (A), (B), and (D). Since 1 is not included in the <code>Math.random()</code> method, we need to multiply the result of <code>Math.random()</code> times the maximum number- the minimum number plus 1. That would be <code>25 - 5 + 1</code>, which equals 21. This eliminates option (E) since it multiplies <code>Math.random()</code> by 25 instead of 21.

4.  >   **C**
    >
    >>  The <code>compareTo</code> method returns 0 if two strings are equivalent. Since "Chicago" and "London" are not equivalent, answer (A) is incorrect. The <code>compareTo</code> method returns the alphabetical difference between the Strings, starting with the first letter. Since "C" is 9 letters before "L" in the alphabet, the <code>compareTo</code> method will return -9. This rules out answers (B) and (D).

5.  >   **D**
    >
    >>  For Strings, the <code>compareTo</code> method will return a number less than 0 if the first String comes before the second String alphabetically. That eliminates answers (B) and (E). While we don't know how the input from the user is implemented, if it is possible that one of the cities remains <code>null</code>, there could be a <code>NullPointerException</code>.

6.  >   **A**
    >
    >>  While you could use a truth table to solve this problem, it will go much quicker if you use DeMorgan's Laws to simplify the expression. The expression <code>!(x < 5 && y > 10)</code> expands to <code>(x >= 5 || y <= 10)</code> and <code>!(x < 5 || y > 10)</code>. You can simplify that expression to <code>x >= 5 && y <= 10</code>.

7.  >   **B**
    >
    >>  Since result is a boolean variable, it can only store <code>true</code> or <code>false</code>. That rules out answers (A) and (D). Answer (E) might seem correct because the variable num is equal to 0 and you divide by num at the end of the expression, but there is no error because of short circuiting. Since the first part of the expression (<code>num == 0</code>) is true and the expression is combined using an or statement (<code>||</code>), the compiler does not need to check the second half of the expression since it has already determined that the expression is true.

8.  >   **B**
    >
    >>  When you have an if/else if/else series, only one of the statements in the series will run. That eliminates options (D) and (E). When two objects have the same value, the <code>==</code> operator only returns true if they are stores in the same location in memory. Since city and president have the same value but were never set equal to each other, they are not stored in the same memory location. This eliminates option (A). Using the equals method on objects checks if they have the same value so the second statement will run.

9.  >   **B**
    >
    >>  When you have an if/else if/else series, only one of the statement in the series will run. That means num will either go up by 1 (the if and else if statements) or be set equal to 10. This eliminates answers (A), (C), and (D). The if statement condition (<code>num < 10</code>) is true since num is equal to 0 at the start. That means that num will be increased by 1.

10. >   **C**
    >
    >>  This question is almost equivalent to question 8. The only difference is the else if from question 8 is an if statement in question 9. We already know that the first if statement runs so num will not remain 0, eliminating answer (A). Since num is 1 when the second if statement (<code>num == 1</code>) is evaluated, num is again increased by 1 to reach 2. The else statement does not run because exactly one statement runs in an if/else pair.

11. >   **E**
    >
    >>  We know that the first if statement runs since it is equivalent to the previous two questions, eliminating answer (A). The else if statement does not run because exactly one statement in an if/else if pair will run. Since num is equal to 1 when we get to the second if statement (<code>num == 2</code>), it will run the else statement resulting in num equaling 10 when the code is complete.

12. >   **D**
    >
    >>  The condition of the while loop is <code>num < 10</code>. That means the loop will run as long as num is less than 10. Since num starts at 0, the loop will run at least once. This eliminates answer (A). The body of the loop increases num by 1 (<code>num++</code>) and since the loop runs 10 times (0...9) num will equal 10 when the loop ends.

13. >   **C**
    >
    >>  The condition of the while loop is <code>num < 10</code>. That means the loop will run as long as num is less than 10. Since there is an if/else pair in the loop and num increases in the if and the else, num will eventually become 10 or greater. This eliminates answer (E). The modulus operator (%) returns the remainder of division. The <code>num % 2 == 0</code> condition is checking to see if num is divisible by 2. 
    >>
    >>  The variable num is divisible by 2 when it is 0, so num goes up to 1. 
    >>
    >>  When num is 1 it is not divisible by 2, so it is instead multiplied by 2 to go up to 2. 
    >>
    >>  2 is divisible by 2 so num becomes 3. 
    >>
    >>  3 is not divisible by 2 so num becomes 6. 
    >>
    >>  6 is divisible by 2 so num becomes 7. 
    >>
    >>  7 is not divisible by 2 so num becomes 14. 
    >>
    >>  Since 14 is not less than 10, the loop ends.

14. >   **B**

15. >   **D**

16. >   **C**

17. >   **C**

18. >   **E**

19. >   **C**

20. >   **C**

21. >   **B**

22. >   **D**

23. >   **D**

24. >   **E**

25. >   **B**

26. >   **D**

27. >   **A**

28. >   **C**

29. >   **E**

30. >   **B**

31. >   **D**

32. >   **D**

33. >   **C**

34. >   **B**

35. >   **A**

36. >   **E**

37. >   **D**

38. >   **C**

39. >   **E**

40. >   **E**

# FRQ ANSWER SHEET

1.  (a) This can also be done with a typical for loop or a while loop and the .get method. A loop is necessary to look at each <code>Employee</code> in the ArrayList. You must then make sure the chosen <code>Employee</code> doesn't already have the maximum number of children allowed. You must also send the age of the <code>Child</code> using the <code>getAge</code> accessor to the <code>canTeach</code> method to see if the chosen <code>Employee</code> is eligible to teach the given <code>Child</code>.

    If an <code>Employee</code> is found for the given <code>Child</code>, you need to assign the <code>Child</code> to the <code>Employee</code> using the <code>assignChild</code> method and return true.

    You should not return false inside the loop since it is possible a different <code>Employee</code> is eligible to teach the given <code>Child</code>.

    ```java
    public boolean findEmployeeForChild(Child c) {
        for(Employee e: employees) {
            if(e.childrenAssigned() < maxRatio && e.canTeach(c.getAge())) {
                e.assignChild(c);
                return true;
            }
        }
        return false;
    }
    ```

    **Rubric:**
    > (+1) For loop correctly iterates through all elements of the employees list.
    >
    > (+1) If statement correctly determines if children assigned to the current employee are less than the maximum allowed.
    >
    > (+1) If statement correctly determines if current employee can teach the given child based on their age.
    >
    > (+1) The child is assigned to the employee if they meet both conditions.
    >
    > (+1) True is returned if the child is assigned to an employee, false is returned otherwise.

    ##

    (b) This can also be done with a typical for loop or a while loop and the .get method. A loop is needed to look at each <code>Child</code> in the ArrayList. You must then call the <code>findEmployeeForChild</code> method from Part A to see if there is an <code>Employee</code> eligible to teach the current <code>Child</code>. If not, you need to return false. You shouldn't return true inside the loop since it is possible there is a later <code>Child</code> who can't be taught by any of the <code>Employees</code> in the ArrayList.

    ```java
    public boolean runDayCare() {
        for(Child c: children) {
            if(findEmployeeForChild(c) == false) {
                return false;
            }
        }
        return true;
    }
    ```

    **Rubric:**
    > (+1) For loop correctly iterates through all elements of the children list.
    > 
    > (+1) The findEmployeeForChild method is called correctly.

    ##

    (c) You must then call the <code>findEmployeeForChild</code> method from Part A to see if there is an <code>Employee</code> eligible to teach the given <code>Child</code>. If there is, you add the <code>Child</code> to the ArrayList using the <code>add</code> method and return true. If there isn't, you return false.

    ```java
    public boolean addChild(Child c) {
        if(findEmployeeForChild(c) == true) {
            children.add(c);
            return true;
        }
        return false;
    }
    ```

    **Rubric:**
    > (+1) The findEmployeeForChild method is called correctly.
    >
    > (+1) Children are added to the children list correctly if an employee is found.

------------------------------------------------------------

2.  (a) The class header must look exactly the same as the header below. The public class Player part would be necessary for any class you are writing called <code>Player</code>. The extends Person part is necessary because a <code>Player</code> is a <code>Person</code>.

    The position variable **must** be declared as private and it must be a String.

    The constructor (public Player), must take three parameters in the order shown below since the example shows the name, age, and position in that order. They can be called whatever you want, however. The name and age variables must be sent to the <code>Person</code> class using the super() call and they must be in the given order. The position variable should be set after the super() call.

    The <code>changePosition</code> method should be void and should take a String parameter. The only thing it needs to do is set the class-level position variable.

    ```java
    public class Player extends Person {
        private String position;

        public Player(String name, int age, String pos) {
            super(name, age);
            position = pos;
        }

        public void changePosition(String p) {
            position = p;
        }
    }
    ```

    **Rubric:**
    > (+1) <code>public class Player</code>
    >
    > (+1) <code>extends Person</code>
    >
    > (+1) A String variable is declared as private.
    >
    > (+1) The constructor header is correct (<code>public Player</code>)
    >
    > (+1) The constructor takes a String paremeter, an integer parameter, and a String parameter in that order.
    >
    > (+1) The constructor calls uses super to initialize the name and age.
    >
    > (+1) The constructor initializes the class-level String variable.
    >
    > (+1) The header for <code>changePosition</code> is correct.
    >
    > (+1) The <code>changePosition</code> method correctly modifies the class-level String variable.

------------------------------------------------------------

3.  (a) You need to use the <code>indexOf</code> method to find the location of the space. Once you know where the space is located, you can use the <code>substring</code> method to extract from the beginning of the name (index 0) up to the space. Since the second parameter of the <code>substring</code> method is excluded, the space will not be included when the first name is returned.

    ```java
    public static String getFirstName(String name) {
        int space = name.indexOf(" ");
        String first = name.substring(0, space);
        return first;
    }
    ```

    **Rubric:**
    > (+1) The <code>indexOf</code> method is used correctly to find the first space.
    >
    > (+1) The <code>substring</code> method is used correctly to extract the first name.
    >
    > (+1) The first name is returned correctly.

    ##

    (b) The solution to part b is similar to part a. You still need to find the location of the space, but the substring starts at the location of the space plus 1, which will be the first letter of the last name. You could add a second parameter of <code>name.length()</code>, but it isn't required.

    ```java
    public static String getLastName(String name) {
        int space = name.indexOf(" ");
        String last = name.substring(space + 1);
        return last;
    }
    ```

    **Rubric:**
    > (+1) The <code>indexOf</code> method is used correctly to find the first space.
    >
    > (+1) The <code>substring</code> method is used correctly to extract the last name.
    >
    > (+1) The last name is returned correctly.

    ##

    (c) You need to create a loop to go through the entire name. You could use a for-each loop to extract characters, but characters are not part of the AP subset. If you use them, make sure you use them correctly. With a traditional for loop, you need to extract the letter using the <code>substring</code> method and see if it equals one of the vowels. A count variable is increased by 1 each time a vowel is found.

    ```java
    public static int countVowels(String name) {
        int count = 0;
        for(int i = 0; i < name.length(); i++) {
            String letter = name.substring(i, i+1);
            if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
                count++;
        }
        return count;
    }
    ```

    **Rubric:**
    > (+1) A loop is used to look at each letter in the name.
    >
    > (+1) An if statement is used to determine if the current letter is a vowel.
    >
    > (+1) The correct vowel count is returned.

------------------------------------------------------------

4.  (a) You need to use nested for loops to iterate through the lot 2D array. You can also use <code>lot[0].length</code> in the second for loop that iterates through the columns instead of <code>lot[r].length</code>. If you find a spot that is not equal to <code>null</code> (meaning there is already a car parked there), then you should increase a counter variable by 1. That variable should be subtracted from the size of the 2D array to get the final result.

    ```java
    public int openSpaces() {
        int taken = 0;
        for(int r = 0; r < lot.length; r++) {
            for(int c = 0; c < lot[r].length; c++) {
                if(lot[r][c] != null)
                    taken++;
            }
        }
        return (lot.length * lot[0].length) - taken;
    }
    ```

    **Rubric:**
    > (+1) A variable is declared to keep track of the taken parking spaces.
    >
    > (+1) Nested for loops are used correctly to iterate through the lot 2D array.
    >
    > (+1) An if statement checks if the current spot in the array is not <code>null</code>.
    >
    > (+1) The correct number of open spaces is returned.

    ##

    (b) You need to use nested for loops to iterate through the lot 2D array. You can also use <code>lot[0].length</code> in the second for loop that iterates through the columns instead of <code>lot[r].length</code>. If you find a spot that is <code>null</code>, you need to set that spot to <code>newCar</code> and return <code>true</code>, in that order. There should be a <code>return false</code> at the end of the method, or in an else statement. On the real AP exam, if a question says to use a method (such as <code>openSpaces</code>) and you don't use it, you can lose points.

    ```java
    public boolean parkCar(Car newCar) {
        if(openSpaces() > 0) {
            for(int r = 0; r < lot.length; r++) {
                for(int c = 0; c < lot[r].length; c++) {
                    if(lot[r][c] == null) {
                        lot[r][c] = newCar;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    ```

    **Rubric:**
    > (+1) The <code>openSpaces</code> method is called correctly to determine if there are spaces available.
    >
    > (+1) Nested for loops are used correctly to iterate through the lot 2D array.
    >
    > (+1) An if statement checks if the current spot in the array is <code>null</code>.
    >
    > (+1) The <code>newCar</code> is assigned correctly to a <code>null</code> element in the 2D array.
    >
    > (+1) The method returns <code>true</code> if a spot was found, <code>false</code> otherwise.