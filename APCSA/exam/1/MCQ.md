> **APCSA - PRACTICE TEST 1**
> 
> **SECTION 1**
> 
> **Time - 1 hour and 30 minutes**
> 
> **Percent of total exam grade - 50%**


## Directions:

Determine the answer to each of the following questions or incomplete statements, using the available space for any necessary scratchwork. Then decide which is the best of the choices given and fill in the corresponding oval on the answer sheet. No credit will be given for anything written in the examination booklet. Do not spend too much time on any one problem.


## Notes:

- Assume that the classes listed in the Quick Reference have been imported where appropriate.
- Assume that declarations of variables and methods appear within the context of an enclosing class.
- Assume that method calls that are not prefixed with an object or class name and are not shown within a complete class definition appear ]within the context of an enclosing class.
- Unless otherwise noted in the question, assume that parameters in the method calls are not *null* and that methods are called only when their preconditions are satisfied.


## MULTIPLE CHOICE QUESTIONS

1. **Consider the following methods:**

        public void trial() {
            int a = 10;
            int b = 5;
            doublevalues(a, b);
            System.out.print(b);
            System.out.print(a);
        }

        public void doublevalues(int c, int d) {
            c = c * 2;
            d = d * 2;
            System.out.print(c);
            System.out.print(d);
        }

    What is printed as the result of the call *trial()*?
    - (A) 2010
    - (B) 2010105
    - (C) 2010510
    - (D) 20102010
    - (E) 20101020
##
2. **Consider the following method:**

        /* Precondition: a > b > 0 */
        public static int mystery(int a, int b) {
            int d = 0;
            for(int c = a; c > b; c--) {
                d = d + c;
            }
            return d;
        }
    
    What is returned by the call *mystery(x, y)*?
    - (A) The sum of all the integers greater than *y* but less than or equal to *x*
    - (B) The sum of all the integers greater than or equal to *y* but less than or equal to *x*
    - (C) The sum of all the integers greater than *y* but less than *x*
    - (D) The sum of all the integers greater than *y* but lessthan or equal to *x*
    - (E) The sum of all the integers less than *y* but greater than or equal to *x*
##
3. **Consider the following method:**

        public void mystery(int n) {
            int k;
            for(k = 0; k < n; k++) {
                mystery(k);
                System.out.print(n);
            }
        }

    What value is returned by the call *mystery(3)*?
    - (A) 0123
    - (B) 00123
    - (C) 0010012
    - (D) 00100123
    - (E) 001001200100123
##
4. **Consider an array of integers:**

        {4, 10, 1, 2, 6, 7, 3, 5}

    If selection sort is used to order the array from smallest to largest values, which of the following represents a possible state of the array at some point during the selection sort process?
    - (A) {1, 4, 10, 2, 3, 6, 7, 5}
    - (B) {1, 2, 4, 6, 10, 7, 3, 5}
    - (C) {1, 2, 3, 10, 6, 7, 4, 5}
    - (D) {4, 3, 1, 2, 6, 7, 10, 5}
    - (E) {5, 3, 7, 6, 2, 1, 10, 4}
##
5. **Consider the following code segment:**

        int k;
        int A[];
        A = new int[7];
        for(k = 0; k < A.length; k++) {
            A[k] = A.length - k;
        }
        for(k = 0; k < A.length - 1; k++) {
            A[k+1] = A[k];
        }

    What values will A contain after the code segment is executed?
    - (A) {1, 1, 2, 3, 4, 5, 6}
    - (B) {1, 2, 3, 4, 5, 6, 7}
    - (C) {6, 6, 5, 4, 3, 2, 1}
    - (D) {7, 7, 6, 5, 4, 3, 2}
    - (E) {7, 7, 7, 7, 7, 7, 7}
##
**Questions 6-7 refer to the following two classes:**

        public class PostOffice {
            // constructor initializes boxes to length 100
            public PostOffice() {
                /* implementation not shown */
            }

            // returns the given p.o. box
            // 0 <= theBox < getNumBoxes()
            public Box getBox(int theBox) {
                /* implementation not shown */
            }

            // returns the number of p.o. boxes
            public int getNumBoxes() {
                /* implementation not shown */
            }

            // private data members and other methods not shown
        }

        public class Box {
            // constructor
            public Box() {
                /* implementation not shown */
            }

            // returns the number of this box
            public int getBoxNumber() {
                /* implementation not shown */
            }

            // returns the number of pieces of mail in this box
            publicint getMailCount() {
                /* implementation not shown */
            }

            // returns the given piece of mail
            // 0 <= thePiece < getMailCount()
            public Mail getMail(int thePiece) {
                /* implementation not shown */
            }

            // true if the box has been assigned to a customer
            public boolean isAssigned() {
                /* implementation not shown */
            }

            // true if the box contains mail
            public boolean hasMail() {
                /* implementation not shown */
            }

            // private data members and other methods not shown
        }

        public class Mail {
            // private members, constructors, and other methods not shown
        }

6. **Consider the following code segment:**

        PostOffice p[];
        p = new PostOffice[10];

    Assuming that the box has been assigned and that it has at least four pieces of mail waiting in it, what is the correct way of getting the fourth piece of mail from the 57th box of the tenth post office of *p*?
    - (A) Mail m = p[10].getBox(57).getmail(4);
    - (B) Mail m = p[9].getBox(56).getMail(3);
    - (C) Mail m = p.getMail(57).getMail(4) [10];
    - (D) Mail m = getMail(getBox(p[9], 560, 3);
    - (E) Mail m = new Mail(10, 57, 4);

7. **Consider the incomplete function *printEmptyBoxes* given below. *printEmptyBoxes* should print the box numbers of all of the boxes that do not contain mail:**

        public void printEmptyBoxes(PostOffice p[]) {
            for(int k = 0; k < p.length - 1; k++) {
                for(int x = 0; x < p[k].getNumBoxes() - 1; x++) {
                    // missing expression
                }
            }
        }

    Which of the following could be used to replace the missing expression?
    - (A)
    > if( p[k].getBox(x).isAssigned() && !p[k].getBox(x).hasMail() ) {
    >
    >> System.out.println(P[k].getBox(x).getBoxNumber());
    >
    > }
    - (B)
    > if( p[x].getBox(k).isAssigned() && !p[x].getBox(k).hasMail() ) {
    >
    >> System.out.println(p[x].getBox(k).getBoxNumber());
    >
    > }
    - (C)
    > if( p[k].getBox(x).isAssigned() && !p[x].getBox(x).hasMail() ) {
    >
    >> System.out.println(p[k].getBoxNumber(x));
    >
    > }
    - (D)
    > if( p[x].getBox(k).isAssigned() && !p[x].getBox(k).hasMail() ) {
    >
    >> System.out.println(p[x].getBoxNumber(k));
    >
    > }
    - (E)
    > if( p[x].getBox(k).isAssigned() && p[x].getBox(k).getMail() == 0 ) {
    >
    >> System.out.println(k);
    >
    > }
##
8. **Assume that *a* and *b* are Boolean variables that have been initialized. Consider the following code segment:**

        a = a && b;
        b = a || b;

    Which of the following statements is true?
    > I. The final value of *a* is the same as the initial value of *a*.
    >
    > II. The final value of *b* is the same as the initial value of *b*.
    >
    > III. The final value of *a* is the same as the initial value of *b*.
    - (A) I only
    - (B) II only
    - (C) III only
    - (D) I and II only
    - (E) II and III only
##
9. **Consider the following code segment:**

        int x;
        x = 53;
        if (x > 10) {
            System.out.print("A");
        }
        if (x > 30) {
            System.out.print("B");
        }
        else if (x > 40) {
            System.out.print("C");
        }
        if (x > 50) {
            System.out.print("D");
        }
        if (x > 70) {
            System.out.print("E");
        }
    
    What is the output when the code is executed?
    - (A) A
    - (B) D
    - (C) ABD
    - (D) ABCD
    - (E) ABCDE
##
10. **Consider the following code segment:**

        int j;
        int k;
        for(j = -2; j <= 2; j = j + 2) {
            for(k = j; k < j + 3; k++) {
                System.out.print(k + " ");
            }
        }

    What is the output when the code is executed?
    - (A) -2  -1   0
    - (B) -2  -1   0   1   2
    - (C)  0   1   2   0   1   2   0   1   2
    - (D) -2   0   2
    - (E) -2  -1   0   0   1   2   2   3   4
##
11. **Consider the following method:**

        public void mystery(int count, String s) {
            if (count <= 0) {
                return;
            }
            if (count % 3 == 0) {
                System.out.print(s + "--" + s);
            }
            else if (count % 3 == 1) {
                System.out.print(s + "--" + s);
            }
            else {
                System.out.print(s);
            }
            mystery(count - 1, s);
        }

    What is the output by the call *mystery(5, "X");*?
    - (A) XX - XX - - XXX - X
    - (B) XX - XX - XX - XX
    - (C) XXX - - XX - X - XX - - XXX
    - (D) XX - XXX - - XXX - XX
    - (E) XXXXX
##
**Questions 12-13 refer to the following classes and method descriptions:**

> Class *Table* has a method, *getPrice*, which takes no parameters and returns the price of the table.
>
> Class *Chair* also has a method, *getPrice*, which takes no parameters and returns the price of the chair.
> 
> Class *DiningRoomSet* has a constructor which is passed a *Table* object and an *ArrayList* of *Chair* objects. It stores these parameters in its private data fields *myTable* and *myChairs*.
>
> Class *DiningRoomSet* has a method, *getPrice*, which takes no parameters and returns the price of the dining room set. The price of a dining room set is calculated as the sum of the price of its table and all of its chairs.

12. **Question:**

    What is the correct way to define the signature of the constructor for the *DiningRoomSet* class?
    - (A) public void DiningRoomSet(Table t, ArrayList, chairs)
    - (B) public DiningRoomSet(Table t, ArrayList chairs)
    - (C) public void DiningRoomSet(Table t, ArrayList Chair Chairs)
    - (D) public DiningRoomSet(Table t, ArrayList Chair Chairs)
    - (E) public DiningRoomSet(Table t, Chair Chairs)

13. **Question:**

    What is the correct way to implement the getPrice method of the *DiningRoomSet* class?
    - (A)
    > public double getPrice(Table t, ArrayList chairs) {
    >
    >> return t.getPrice() + chairs.getPrice();
    >
    > }
    - (B)
    > public double getPrice(Table t, ArrayList chairs) {
    >
    >> return myTable.getPrice() + myChairs.getPrice();
    >
    > }
    - (C)
    > public double getPrice() {
    >
    >> return myTable.getPrice() + myChairs.getPrice();
    >
    > }
    - (D)
    > public double getPrice() {
    >
    >> double result = myTable.getPrice();
    >> 
    >> for(int k = 0; k < myChairs.size() - 1; k++) {
    >>
    >>> result += ((Chair)myChairs.get(k)).getPrice();
    >>
    >> }
    >>
    >> return result;
    >
    > }
    - (E)
    > public double getPrice() {
    >
    >> double result = myTable.getPrice();
    >>
    >> for(int k = 0; k < myChairs.length - 1; k++) {
    >>
    >>> result += ((Chair)myChairs[k]).getPrice();
    >>
    >> }
    >>
    >> return result;
    >
    > }
##
14. **Consider the following output:**

        6   5   4   3   2   1
        5   4   3   2   1
        4   3   2   1
        3   2   1
        2   1
        1

    Which of the following code segments produces the above output when executed?
    - (A)
    > for(int j = 6; j < 0; j--) {
    >
    >> for(int k = j; k > 0; k--) {
    >>
    >>> System.out.print(k + " ");
    >>
    >> }
    >>
    >> System.out.println(" ");
    >
    > }
    - (B)
    > for(int j = 6; j >= 0; j--) {
    >
    >> for(int k = j; k >= 0; k--) {
    >>
    >>> System.out.print(k + " ");
    >>
    >> }
    >>
    >> System.out.println(" ");
    >
    > }
    - (C)
    > for(int j = 0; j < 6; j++) {
    >
    >> for(int k = 6 - j; k > 0; k--) {
    >>
    >>> System.out.print(k + " ");
    >>
    >> }
    >> 
    >> System.out.println(" ");
    >
    > }
    - (D)
    > for(int j = 0; j < 6; j++) {
    >
    >> for(int k = 7 - j; k > 0; k--) {
    >>
    >>> System.out.print(k + " ");
    >>
    >> }
    >>
    >> System.out.println(" ");
    >
    > }
    - (E)
    > for(int j = 0; j < 6; j++) {
    >
    >> for(int k = 6 - j; k >= 0; k--) {
    >>
    >>> System.out.print(k + " ");
    >>
    >> }
    >>
    >> System.out.println(" ");
    >
    > }
##
15. **Consider the following code segment:**

        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(7));
        list.add(new Integer(6));
        list.add(1, new Integer(5));
        list.add(1, new Integer(4));
        list.add(new Integer(3));
        list.set(2, new Integer(2));
        list.add(1, new Integer(1));
        System.out.println(list);

    What is printed as a result of executing this code segment?
    - (A) [1, 4, 2, 7, 6, 3]
    - (B) [7, 1, 4, 2, 6, 3]
    - (C) [7, 2, 5, 4, 3, 1]
    - (D) [7, 6, 2, 4, 3, 1]
    - (E) [7, 1, 2]
##
16. **Consider the following declarations:**

        public interface Animal {
            String makeSound();
            String animalType();
        }

        public static class Dog implements Animal {
            public String makeSound(Animal a) {
                // Implementation not shown
            }
        }

    Which of the following methods must be included in the declaration of the *Dog* class in order for the class to successfully compile?
    > I. public String makeSound()
    >
    > II. public String animalType()
    >
    > III. public String animalType(animal b)
    - (A) I only
    - (B) II only
    - (C) I and II only
    - (D) II and III only
    - (E) I, II, and III
##
17. **Consider the following two classes:**

        public static class Fish {
            public String endoskeleton = "bone";

            public void action() {
                System.out.println("splash splash");
            }
        }

        public static class Shark extends Fish {
            public void action() {
                System.out.println("chomp chomp");
            }

            public String endoskeleton = "cartilage";
        }

    Which of the following is the correct output after the following code segment is executed?
            Fish Bob = new Shark();
            System.out.println(Bob.endoskeleton);
            Bob.action();
    - (A)
    > bone
    >
    > chomp chomp
    - (B)
    > bone
    >
    > splash splash
    - (C)
    > cartilage
    >
    > splash splash
    - (D)
    > cartilage
    >
    > chomp chomp
    - (E)
    > cartilage
    >
    > splash splash
    >
    > chomp chomp
##
**Questions 18-19 refer to the following incomplete method:**

        // The following insertSort method sorts the values in an integer array, sort, in ascending order.
        Line 01:    public static void insertSort(int[] sort)
        Line 02:    {
        Line 03:        for(int index = 1; index < sort.length; index++)
        Line 04:        {
        Line 05:            int temp = sort[index];
        Line 06:            while(index > 0 && sort[index-1] > temp)
        Line 07:            {
        Line 08:                // Missing code
        Line 09:            }
        Line 10:        sort[index] = temp;
        Line 11:        }
        Line 12:    }

18. **Which of the following can be used to replace "*// Missing code*" so that the *insertSort* method will execute properly?**
    - (A)
    > sort[index] = sort[index-1];
    >
    > index++;
    - (B)
    > sort[index-1] = sort[index];
    >
    > index--;
    - (C)
    > sort[index] = sort[index+1];
    >
    > index++;
    - (D)
    > sort[index] = sort[index-1];
    >
    > index--;
    - (E)
    > sort[index] = sort[index+1];
    >
    > index--;

19. **Assuming that the "*// Missing code*" is implemented properly, what change can be made to the code in order for the array to be sorted in descending order?**
    - (A) Replace Line 06 with: *while(index < 0 && sort[index-1] < temp)*
    - (B) Replace Line 06 with: *while(index < 0 && sort[index+1] < temp)*
    - (C) Replace Line 06 with: *while(index > 0 && sort[index-1] < temp)*
    - (D) Replace Line 03 with: *for(int index = sort.length - 1; index > 0; index--)*
    - (E) Replace Line 03 with: *for(int index = 1; index > 0; index--)*
##
20. **Which of the following arrays would be sorted the slowest using insertion sort?**
    - (A) [3  4  6  2  7  3  9]
    - (B) [3  2  5  4  6  7  9]
    - (C) [9  7  6  5  4  3  2]
    - (D) [2  3  4  5  6  7  9]
    - (E) [9  3  2  4  5  7  6]
##
**Questions 21-23 refer to the following incomplete class declaration used to represent fractions with integral numerators and denominators:**

        public class Fraction {
            private int numerator;
            private int denominator;

            public Fraction() {
                numerator = 0;
                denominator = 1;
            }

            public Fraction(int n, int d) {
                numerator = n;
                denominator = d;
            }

            // postcondition: returns the numerator
            public int getNumerator() {
                /* implementation not shown */
            }

            // postcondition: returns the denominator
            public int getDenominator() {
                /* implementation not shown */
            }

            // postcondition: returns the greatest common divisor of x and y
            public int gcd(int x, int y) {
                /* implementation not shown */
            }

            // postcondition: returns the Fraction that is the result of multiplying this Fraction and f
            public Fraction multiply(Fraction f) {
                /* implementation not shown */
            }

            // ... other methods not shown
        }

21. **Consider the method multiply of the Fraction class:**

        // postcondition: returns the Fraction that is the result of multiplying this Fraction and f
        public Fraction multiply(Fraction f) {
            // missing code
        }

    Which of the following statements can be used to replace *// missing code* so that the multiply method is correctly implemented?
    > I. *return Fraction(numerator * f.getNumerator(), denominator * f.getDenominator());*
    >
    > II. *return new Fraction(numerator * f.numerator, denominator * f.denominator());*
    >
    > III. *return new Fraction(numerator * f.getNumerator(), denominator * f.getDenominator());*
    - (A) I only
    - (B) II only
    - (C) III only
    - (D) I and III
    - (E) II and III

22. **Consider the use of the Fraction class to multiply the fractions (3/4) and (7/19). Consider the following code:**

        Fraction fractionOne;
        Fraction fractionTwo;
        Fraction answer;
        fractionOne = new Fraction(3, 4);
        fractionTwo = new Fraction(7, 19);
        // missing code

    Which of the following could be used to replace *// missing code* so that the answer contains the result of multiplying fractionOne by fractionTwo?
    - (A) answer = fractionOne * fractionTwo
    - (B) answer = multiply(fractionOne, fractionTwo);
    - (C) answer = fractionOne.multiply(fractionTwo);
    - (D) answer = new Fraction(fractionOne, fractionTwo);
    - (E) answer = (fractionOne.getNumerator() * fractionTwo.getNumerator()) / (fractionOne.getDenominator() * fractionTwo.getDenominator());

23. **The following incomplete class declaration is intended to extend the *Fraction* class so that fractions can be manipulated in reduced form (lowest terms):**

    Note that a fraction can be reduced to lowest terms by dividing both the numerator and denominator by the greatest common divisor (gcd) of the numerator and denominator.
        public class ReducedFraction extends Fraction {
            private int reducedNumerator;
            private int reducedDenominator;
            // ... constructors and other methods not shown
        }

    Consider the following proposed constructors for the *ReducedFraction* class:
    > I.
    >
    >> public ReducedFraction() {
    >>
    >>> reducedNumerator = 0;
    >>>
    >>> reducedDenominator = 1;
    >>
    >> }
    >
    > II.
    >
    >> public reducedFraction(int n, int d) {
    >>
    >>> numerator = n;
    >>>
    >>> denominator = d;
    >>>
    >>> reducedNumerator = n / gcd(n, d);
    >>>
    >>> reducedDenominator = d / gcd(n, d);
    >>
    >> }
    >
    > III.
    >
    >> public ReducedFraction(int n, int d) {
    >>
    >>> super(n, d);
    >>>
    >>> reducedNumerator = n / gcd(n, d);
    >>>
    >>> reducedDenominator = d / gcd(n, d);
    >>
    >> }

    Which of these constructor(s) would be legal for the *ReducedFraction* class?
    - (A) I only
    - (B) II only
    - (C) III only
    - (D) I and III
    - (E) II and III
##
24. **Consider *s1* and *s2* defined as follows:**