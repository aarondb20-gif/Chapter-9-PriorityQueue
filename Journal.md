# Journal

Phase 1
Created Priority Queue to order companies from minimum size in heap. The PriorityQueue uses the Comparator class with 
it's comparing method to get the size from the company which is compared to the size of other elements. If we wanted 
the heap to go from largest to smallest we could use the reverse order Comparator method.

Phase 2
A priority Queue is more efficient than an arraylist for this instance since it automatically sorts elements from 
smallest to largest. Adding one element to a priorityqueue is O(logn), but sorting a list is O(nlogn) which is much
less efficient.

Phase 3
If you don't check the que size before calling poll() you will get an error message, because after you get to the end of 
the queue it will return null and that is an underflow exception.

Phase 4
I do get a Null Pointer Exception if I reach the end of the queue and the loop still runs. Instead of checking if the 
queue is empty, the AI review says to check if the first and second element are equal to null.
