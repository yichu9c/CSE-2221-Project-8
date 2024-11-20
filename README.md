Project: Cryptographic Utilities
Objectives
Competence with using NaturalNumber objects and methods.
Exposure to using JUnit to test methods.
Exposure to the kinds of computations involved in modern cryptography.
The Problem
Secure communication is a critical feature of the internet. For example, e-commerce would be impractical if financial transactions were not done using encrypted messages, e.g., between a customer and a vendor or between financial institutions. A key (so to speak) to modern secure communication is a beautiful invention called public-key cryptography. In most approaches to public-key cryptography, certain number-theoretic computations are involved in constructing both the "public" and"private" keys that are used to encrypt and decrypt messages for secure communication. (Number theory is the branch of mathematics dealing with mathematical integers, and in this context we are interested only in non-negative integers, so henceforth when we say "number" we mean "non-negative mathematical integer", which is the mathematical model for our NaturalNumbers.) Cryptographic computations typically work with large natural numbers of perhaps 50-100 digits — sound familiar? — and number-theoretic calculations involving greatest common divisors, modular arithmetic (i.e., clock arithmetic), prime numbers, etc.

One popular public-key cryptographic scheme, RSA, is provably secure under the assumption that factoring of such large numbers is so expensive in terms of execution time as to be computationally infeasible in practice. This is no problem for small numbers. For example, it is easy to write a program to determine that the factors of the number 84 (in addition to the trivial factors 1 and 84, of course) are 2, 3, 6, 7, 14, 21, and 42. However, for very large numbers, no one knows how to find even one non-trivial factor efficiently; this is an open problem in number theory and computer science. At the same time, however, RSA relies on the ability to decide efficiently whether such a large number is prime, i.e., whether it has any non-trivial factors at all. You might know only one way to decide whether a given number n is prime: try to factor it, and if there are no factors other than 1 and n then it is prime. This is based directly on the definition: what it means to be a prime number. Perhaps you can see the futility of this approach for use with RSA. For if it is computationally infeasible to factor a large number, then how can you decide efficiently whether a number is prime? That is the question you will explore a bit in this project.

It turns out number theorists know quite a bit about prime numbers — though far less than they would like to know. Here are a few interesting facts about primes that figure into this project, all related in some way to the number-theoretic result known as Fermat's "little" theorem (as distinct from his more famous "last" theorem):

If n is prime and 1 < w < n – 1, then w2 mod n ≠ 1.
If n is prime and 0 < w < n, then wn – 1 mod n = 1.
If n is composite (i.e., not prime) and 1 < w < n, then it is "likely" that wn – 1 mod n ≠ 1.
The first fact above implies that, if you can find a number w in the interval [2, n – 2] for which w2 mod n = 1, then you know n is not prime; i.e., w is a "witness" that n is composite.

The second fact above implies that, if you can find a number w in the interval [1, n – 1] for which wn – 1 mod n ≠ 1, then you know n is not prime; i.e., w is a witness that n is composite.

The third fact above implies that, if you cannot find in the interval [2, n – 1] a witness that n is composite, then you should guess (with high likelihood but not certainty) that n is prime.

Your job for this project is to implement a few utility methods that could be used in cryptographic computations of this sort, including one that can generate a huge number that is very likely a prime number.

Setup
Create a new Eclipse project by copying ProjectTemplate or a previous project you have created, naming the new project CryptoUtilities.
Open the src folder of this project and then open (default package). As a starting point you can use any of the Java files. Rename the class CryptoUtilities and delete the other files from the project.
Follow the link to CryptoUtilities.java, select all the code on that page and copy it to the clipboard; then open the CryptoUtilities.java file in Eclipse and paste the code to replace the file contents. Save the file.
In the test folder of this project create a new JUnit test fixture as practiced in a recent lab. Name it CryptoUtilitiesTest.
Follow the link to CryptoUtilitiesTest.java, select all the code on that page and copy it to the clipboard; then open the CryptoUtilitiesTest.java file in Eclipse and paste the code to replace the file contents. Save the file.
Method
Edit CryptoUtilities.java to implement the methods not yet implemented, following the instructions and advice in the comments. You might find it helpful to examine the code for the other methods whose bodies are provided already, as well as the main program.
Edit CryptoUtilitiesTest.java to create additional (useful) test cases similar to the few already provided, and add test cases for all other methods you have implemented in CryptoUtilities.java. Use the test fixture to test the code in CryptoUtilities.java, debugging it as necessary.
Select your Eclipse project CryptoUtilities (not just some of the files, but the whole project), create a zip archive of it, and submit the zip archive to the Carmen dropbox for this project, as described in Submitting a Project.
Additional Activities
Here are some possible additional activities related to this project. Any extra work is strictly optional, for your own benefit, and will not directly affect your grade.

The algorithm you have implemented (we hope) in isPrime2 is very similar to the Miller-Rabin primality testing algorithm that is crucial to the RSA cryptosystem. Add a new method isPrime3 and implement the full Miller-Rabin test as its method body, using as a guide the pseudo-code for that algorithm at the link above. Also rewrite the contract for isPrime3 so it is specific about what is meant by "very likely" and "small probability of error".
