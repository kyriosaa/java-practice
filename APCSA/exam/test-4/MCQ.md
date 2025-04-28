> **APCSA - PRACTICE TEST 4**
> 
> **SECTION 1**
> 
> **Time - 1 hour and 30 minutes**
>
> **Number of Questions - 40**
> 
> **Percent of Total Grade - 50%**


## Directions:

Determine the answer to each of the following questions or incomplete statements, using the available space for any necessary scratchwork. Then decide which is the best of the choices given and fill in the corresponding oval on the answer sheet. No credit will be given for anything written in the examination booklet. Do not spend too much time on any one problem.


## Notes:

- Assume that the classes listed in the Quick Reference have been imported where appropriate.
- Assume that declarations of variables and methods appear within the context of an enclosing class.
- Assume that method calls that are not prefixed with an object or class name and are not shown within a complete class definition appear within the context of an enclosing class.
- Unless otherwise noted in the question, assume that parameters in the method calls are not *null* and that methods are called only when their preconditions are satisfied.


## MULTIPLE CHOICE QUESTIONS

1.  **Consider the following code segment:**

    ```java
    (int) (5 / 2)
    ```

    What will be the result of the code above?
    - (A) 2
    - (B) 2.5
    - (C) 3
    - (D) 5
    - (E) The statement would generate an error
##
2.  **Consider the following code segment:**

    ```java
    num += 1
    ```

    Which of the following statements is equivalent to the code above?
    - (A)
    ```java
    num = 1
    ```
    - (B)
    ```java
    num + 1
    ```
    - (C)
    ```java
    num++1
    ```
    - (D)
    ```java
    1 += num
    ```
    - (E)
    ```java
    num = num + 1
    ```
##
3. **Which of the following would correctly generate a random number between 5 and 25 (inclusive)?**

    - (A)
    ```java
    (int) (Math.random() * (20))
    ```
    - (B)
    ```java
    (int) (Math.random() * (21))
    ```
    - (C)
    ```java
    (int) (Math.random() * (21) + 5)
    ```
    - (D)
    ```java
    (int) (Math.random() * (25))
    ```
    - (E)
    ```java
    (int) (Math.random() * (25) + 5)
    ```
##
4. **Consider the following code segment:**

    ```java
    String city1 = "Chicago";
    String city2 = "London";
    int difference = city1.compareTo(city2);
    ```

    What would be stored in the difference variable based on the code above?
    - (A) 0
    - (B) 1
    - (C) A number less than 0
    - (D) A number greater than 0
    - (E) The code would generate an error
##
5. **Consider the following code segment:**

    ```java
    String city1 = // Get input from user
    String city2 = // Get input from user
    if(city1.compareTo(city2) > 0)
        print(city1);
    else
        print(city2);
    ```

    What would be stored in the difference variable based on the code above?
    - (A) The city that comes first alphabetically
    - (B) The city that comes second alphabetically
    - (C) Both cities
    - (D) The city that comes first alphabetically, or a <code>NullPointerException</code> if nothing was input for one of the cities
    - (E) The city that comes second alphabetically, or a <code>NullPointerException</code> if nothing was input for one of the cities
##
6. **Consider the following code segment:**

    ```java
    !(x < 5 && y > 10)
    ```

    Which of the following expressions is equivalent to the code above?
    - (A)
    ```java
    x >= 5 && y <= 10
    ```
    - (B)
    ```java
    x <= 5 && y >= 10
    ```
    - (C)
    ```java
    x >= 5 || y <= 10
    ```
    - (D)
    ```java
    x <= 5 || y >= 10
    ```
    - (E)
    ```java
    !x < 5 && !y > 10
    ```
##
7. **Consider the following code segment:**

    ```java
    int num = 0;
    boolean result = (num == 0) || (10 / num < 5);
    ```

    What is the variable result equal to after the execution of the code above?
    - (A) 0
    - (B) <code>true</code>
    - (C) <code>false</code>
    - (D) 10
    - (E) The code would generate an error
##
8. **Consider the following code segment:**

    ```java
    String president = "Lincoln";
    String city = "Lincoln";

    if(city == president)
        // Statement 1
    else if(city.equals(president))
        // Statement 2
    else
        // Statement 3
    ```

    Which of the following if statement will run?
    - (A) Statement 1
    - (B) Statement 2
    - (C) Statement 3
    - (D) Statement 1 and Statement 2
    - (E) Statement 1, Statement 2, and Statement 3
##
9. **Consider the following code segment:**

    ```java
    int num = 0;
    if(num < 10)
        num++;
    else if(num == 1)
        num++;
    else
        num = 10;
    ```

    What will num equal after the execution of the code above?
    - (A) 0
    - (B) 1
    - (C) 2
    - (D) 3
    - (E) 10
##
10. **Consider the following code segment:**

    ```java
    int num = 0;
    if(num < 10)
        num++;
    if(num == 1)
        num++;
    else
        num = 10;
    ```

    What will num equal after the execution of the code above?
    - (A) 0
    - (B) 1
    - (C) 2
    - (D) 3
    - (E) 10
##
11. **Consider the following code segment:**

    ```java
    int num = 0;
    if(num < 10)
        num++;
    else if(num == 1)
        num++;
    if(num == 2)
        num++;
    else
        num = 10;
    ```

    What will num equal after the execution of the code above?
    - (A) 0
    - (B) 1
    - (C) 2
    - (D) 3
    - (E) 10
##
12. **Consider the following code segment:**

    ```java
    int num = 0;
    while(num < 10)
        num++;
    ```

    What will num equal after the execution of the code above?
    - (A) 0
    - (B) 1
    - (C) 9
    - (D) 10
    - (E) 11
##
13. **Consider the following code segment:**

    ```java
    int num = 0;
    while(num < 10)
        if(num % 2 == 0)
            num++;
        else
            num *= 2;
    ```

    What will num equal after the execution of the code above?
    - (A) 9
    - (B) 10
    - (C) 14
    - (D) 20
    - (E) An infinite loop occurs
##
14. **Consider the following code segment:**

    ```java
    int num = 1;
    while(/* Condition Here */)
        num *= 2;
    ```

    What condition could replace <code>/* Condition Here */</code> to ensure num equals 4 after the execution of the code above?
    - (A)
    ```java
    num == 4
    ```
    - (B)
    ```java
    num < 4
    ```
    - (C)
    ```java
    num <= 4
    ```
    - (D)
    ```java
    num > 4
    ```
    - (E)
    ```java
    num >= 4
    ```
##
15. **Consider the following code segment:**

    ```java
    int num = 0;
    for(int i = 0; /* Condition Here */; i++)
        num += 2;
    ```

    What condition could replace <code>/* Condition Here */</code> to ensure num equals 10 after the execution of the code above?
    - (A)
    ```java
    i < 10
    ```
    - (B)
    ```java
    i <= 10
    ```
    - (C)
    ```java
    num < 10
    ```
    - (D)
    ```java
    num <= 10
    ```
    - (E)
    ```java
    i == num
    ```
##
16. **Consider the following code segment:**

    ```java
    for(int i = 0; i <= 10; i += 2)
        // for Loop Body
    ```

    How many times will the for loop body execute in the code above
    - (A) 0
    - (B) 5
    - (C) 6
    - (D) 10
    - (E) 11
##
17. **Consider the following code segment:**

    ```java
    for(int i = 1000; i > 0; i--)
        // for Loop Body
    ```

    How many times will the for loop body execute in the code above?
    - (A) 0
    - (B) 999
    - (C) 1000
    - (D) 1001
    - (E) An infinite loop will occur
##
18. **Consider the following code segment:**

    ```java
    int num = 0;
    for(int i = 0; i < 5; i++)
        for(int k = 0; k < 2; k++)
            num++;
    ```

    What will the variable num equal after the execution of the code above?
    - (A) 0
    - (B) 2
    - (C) 5
    - (D) 7
    - (E) 10
##
19. **Consider the following code segment:**

    ```java
    String firstString = "mississippi";
    String secondString = "";
    for(int i = 0; i < 5; i++)
        secondString += firstString.substring(i, i+1);
    ```

    What will <code>secondString</code> be equal to after the execution of the code above?
    - (A) ""
    - (B) "miss"
    - (C) "missi"
    - (D) "msisipi"
    - (E) "mississippi"
##