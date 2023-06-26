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

### For Eclipse users
To make sure the progress bar is printed correctly, go to
```
Window -> Preferences -> Run/Debug -> Console
```
And make sure the following 2 checkboxes are checked:
```
Interpret ASCII control characters
```
```
Interpret Carriage Return (\r) as control character
```
Alternatively, change the value of `dontUseProgressBar` (in the class `Runner`) to true - 
so simple prints are used instead of the progress bar.


## Usage
To run the tester execute `main` of the class `Runner`. 

For each iteration of the test, a random test-case (sequence of operations) is generated and performed.
- If a test fails, the tester will quit and print an error message, and the last steps of the test case that produced the error.
- The next time the tester runs after a failure it will pick the same test case.
  - For that feature the tester will save temporary results in a file on your machine. By default, the file
    is saved in your working directory (probably the project directory).

### Last step breakpoint
To make debugging easier, place a breakpoint at line 112 of `Runner.java`.

When re-running a previously failed test case,
this breakpoint will be hit right before the last step performed (which probably caused the failure).

After the breakpoint is hit, step-into twice, then step-over until you reach the call to your
tested method (marked with a comment), and step-into it.

## Configuration

There are a few configurations you can edit for the tester, they appear as static fields of the class `Runner`.

Feel free to play with them - I chose values that seem good to me, but my reasoning for them is
somewhat hand-wavy ¯\\_(ツ)_/¯

## Steps performed
The tester uses the info field as a unique identifier - since keys are not unique.
The info values used are random 8 character strings.

- `Initialize <num_of_heaps>` - only used once at the start of the test case - to initialize all the heaps.
- `Insert <heap_index> <key> <info>`
- `DeleteMin <heap_index>`
- `DecreaseKey <heap_index> <info> <diff>`
- `Delete <heap_index> <info>`
- `Meld <heap1_index> <heap2_index>` - heap2 is melded into heap1.
