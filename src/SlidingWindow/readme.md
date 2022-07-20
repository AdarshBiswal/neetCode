# SLIDING WINDOW TECHNIQUE

---

#### FLOW:


* Origin of Sliding Window
* Brute Force Approch
* Identify where to put Sliding Window
* Types of Sliding window

#### 1. WHY WE NEED SLIDING WINDOW :

Suppose we have an array arr= [2,3,5,2,9,7,1], and we need to find the maximum sum
of subarray of size let say 3.

So in the brute force approach we will have two loops as below


````
for(int i=0;i<arr.length-1;i+=3)
{
   for(int j=i;j<i+3;j++)
   {
        calculate the max sum
   }
   compare the max Sum with max sum till now and you have the result.
}
````
In the above code we saw that the there are two loop and the time complexity is pow(n,2).
We need to reduce the same. So, for that case we use sliding window problem.

In sliding window
let say out window size is 3(as given above)

```
arr= [2,3,5,6,9,7,1]

1st window= [2,3,5]  
2nd window= [3,5,6] -> Here we see that when we have calculated the value of [3,5] above , We should not be calulating the same now.
                       So we end up to say that [2,3,5] -[2]+[6]  
3rd window= [5,6,9]  
4th window= [6,9,7]   
5th window= [9,7,1]

By Using the above approach the solution using O(n) times.
```

#### 2. Identify where to put Sliding Window :-

* We are given an array or String
* We are given to find substring or subarray
* We will be also given to find largest, longest ,max or min
* We would be give window size.


#### 3. Types of Sliding window Techniques

* Fix Size window -> In fix size the window size should be defined. Ex above problem
* Variable Size Window -> Need to find the window size.

