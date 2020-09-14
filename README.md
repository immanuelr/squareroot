# squareroot
Square root scala code
For square root(n); 

Perfect Square numbers:

initially it will  iterate through all the values from i=1 till (i*i)>n  condition by incrementing i by 1. In each iteration it will check whether i*i = n then it will i (which is perfect square).

Non square root numbers:

If i*i >n then result must lie in i-1 and i. Here I have used binary search algorithm instead of linear traverse approach and find square root of n b/w i-1 and i. Below are the steps how I calculate the result 
 1. Read n,i and j
2. Find m= middle element b/w i and j
3. Check m*m equals to n or m*m ~ n(negligible difference). If yes print m. 
4. Check m*m greater than n. If yes, then find square root b/w i and m by repeating from step1
5. Check m*m less than n.if yes,  then find square root b/w m and j by repeating from step1

Attached documents will give you instructions on how to execute on windows command prompt, Linux Environment, IntelliJ
