> **APCSA - PRACTICE TEST 4**
> 
> **SECTION 2**
> 
> **Time - 1 hour and 30 minutes**
>
> **Number of Questions - 4**
> 
> **Percent of Total Grade - 50%**


## Directions:

SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.


## Notes:

- Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
- Unless otherwise noted in the equation, assume that the parameters in method calls are not null and that methods are ccalled only when their preconditions are satisfied.
- In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.


## FREE RESPONSE QUESTIONS

1.  A day care has a program to keep track of its employees and which children they care for during the day. An <code>Employee</code> has a minimum and maximum age they can watch. The <code>DayCare</code> also has a maximum ratio that specifies the maximum number of children a single employee can watch. Below is the full <code>DayCare</code> class:

    <code style="color : #277DFF">public class</code> DayCare {
        private ArrayList<Employee> employees;
        private ArrayList<Child> children;
        private int maxRatio;
        
        public DayCare(int maxRatio) {
            employees = new ArrayList<Employee>();
            children = new ArrayList<Child>();
            this.maxRatio = maxRatio;
        }

        public boolean findEmployeeForChild(Child c) {
            /* To be completed in part a */
        }

        public boolean runDayCare() {
            /* To be completed in part b */
        }

        public boolean addChild(Child c) {
            /* To be completed in part c */
        }
    }

    > --------------------
    >
    > Questions below
    >
    > --------------------

    (a) **An <code>Employee</code> can only teach children between the employee's minimum age (inclusive) and maximum age (inclusive). They can also only teach children up to the day care's maximum ratio (inclusive). Below is the full <code>Employee</code> class.**