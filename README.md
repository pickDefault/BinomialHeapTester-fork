# BinomialHeapTester
A statistical tester for the binomial heap exercise of the course "Data Structures".

## Setup
- Copy your code file (`BinomialHeap.java`) to the directory `yourcode`.
  - This directory has the skeleton file inside it (to make git include
    this directory) - replace it with your code.
- Paste the following declaration at the top of the code file:
  - ```java
    package binomialheaptester.yourcode;
    ```
  - **REMEMBER TO REMOVE THIS LINE BEFORE SUBMITTING YOUR CODE**


- For each iteration of the test, a random test-case (sequence of operations) is generated and performed.
    - If a test fails, the tester will quit and print an error message, and the test case that produced the error.
    - The next time the tester runs after a failure it will pick the same test case.
      - For that feature the tester will save temporary results in a file on your machine. By default, the file
        is saved in your working directory (probably the project directory).
- I recommend placing a breakpoint at line 104 of `Runner.java`. When re-running a previously failed test case,
this line will be reached right before the last step performed (which probably caused the failure).
  - Advance the debugger a few steps until you reach the call to your method - then step into it.
- To run the tester execute `main` of the class `Runner`.

## Configuration

There are a few configurations you can edit for the tester, they appear as static fields of the class `Runner`.

Feel free to play with them - I chose values that seem good to me, but my reasoning for them is
somewhat hand-wavy ¯\_(ツ)_/¯