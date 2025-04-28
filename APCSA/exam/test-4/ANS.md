> **APCSA - PRACTICE TEST 4 ANSWER SHEET**

**THESE ANSWERS ARE VERIFIED BY THE OFFICIAL ANSWER SHEET. PLEASE CHECK IT IN THE RESOURCES FOLDER IF NEED BE**

## MCQ ANSWER SHEET

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

9.  >   **B**

10. >   **C**

11. >   **E**

12. >   **D**

13. >   **C**

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

## FRQ ANSWER SHEET

1. 

    (a)

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

    This can also be done with a typical for loop or a while loop and the .get method. A loop is necessary to look at each <code>Employee</code> in the ArrayList. You must then make sure the chosen <code>Employee</code> doesn't already have the maximum number of children allowed. You must also send the age of the <code>Child</code> using the <code>getAge</code> accessor to the <code>canTeach</code> method to see if the chosen <code>Employee</code> is eligible to teach the given <code>Child</code>.

    If an <code>Employee</code> is found for the given <code>Child</code>, you need to assign the <code>Child</code> to the <code>Employee</code> using the <code>assignChild</code> method and return true.

    You should not return false inside the loop since it is possible a different <code>Employee</code> is eligible to teach the given <code>Child</code>.

    **Rubric:**

            (+1) For loop correctly iterates through all elements of the employees list.
            (+1) If statement correctly determines if children assigned to the current employee are less than the maximum allowed.
            (+1) If statement correctly determines if current employee can teach the given child based on their age.
            (+1) The child is assigned to the employee if they meet both conditions.
            (+1) True is returned if the child is assigned to an employee, false is returned otherwise.

    > --------------------

    (b)

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

    This can also be done with a typical for loop or a while loop and the .get method. A loop is needed to look at each <code>Child</code> in the ArrayList. You must then call the <code>findEmployeeForChild</code> method from Part A to see if there is an <code>Employee</code> eligible to teach the current <code>Child</code>. If not, you need to return false. You shouldn't return true inside the loop since it is possible there is a later <code>Child</code> who can't be taught by any of the <code>Employees</code> in the ArrayList.

    **Rubric:**

            (+1) For loop correctly iterates through all elements of the children list.
            (+1) The findEmployeeForChild method is called correctly.

    > --------------------

    (c)

    ```java
    public boolean addChild(Child c) {
        if(findEmployeeForChild(c) == true) {
            children.add(c);
            return true;
        }
        return false;
    }
    ```

    You must then call the <code>findEmployeeForChild</code> method from Part A to see if there is an <code>Employee</code> eligible to teach the given <code>Child</code>. If there is, you add the <code>Child</code> to the ArrayList using the <code>add</code> method and return true. If there isn't, you return false.

    **Rubric:**

            (+1) The findEmployeeForChild method is called correctly.
            (+1) Children are added to the children list correctly if an employee is found.

    > --------------------

2.  

    (a)

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