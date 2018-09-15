# CS 245 (Fall, 2018) PracticeAssignment02

See assignment details on Canvas.

Devon Groff -- 14 September 2018
ANSWER TO REQUIREMENT 4:

	All Big O values supporting the below answers are documented in the comments of Practice03Test.java 
	
	The Big(O) Runtime of find_min_iterative():
		ANSWER: O(n)
		EXPLAINATION: The algorithm runs linearly (from start to finish through the array) n times depending on the length of the array. 

	The Big(O) Runtime of find_min_recursive():
		ANSWER: O(n^2)
		EXPLAINATION: I'm slightly uncertain about this answer -- since it involves an overloaded class; however, I believe that this would be
					  O(n^2) since the recursive algorithm (at most) can call itself n times depending on the length of the array, and from there 
					  at its worst will return a value n times once it reaches its base case. 