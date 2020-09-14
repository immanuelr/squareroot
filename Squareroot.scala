package com.testing


class SquareRoot {
    //creating method to get the square root for perfect numbers
    def findSquareRoot(n:Int): Unit= {
      var res: Float = 0					//result
      var found:Boolean = false
      var i=1								//iterations
      
      //Initially assumed perfect square not found
      while(found==false) {
        // Checking if it has perfect square root
        if(i*i == n){
          found = true
          //prints absolute result if its true
          print("square root of "+ n +" is "+i)
        }
        else if(i*i>n){
          // square is between "i-1" and "i"
          // resultants and given number are passed to method square   
          res = square(n, i-1, i)
          found = true
          //printing actual result
          print("square root of "+ n +" is "+res)
        }
        i=i+1
		}
    }
    //Square root for non square root numbers
    def square(n: Int, i: Float, j: Float): Float = {
      val mid = (i + j) / 2 			//Middle value of upper and lower numbers
      val mul = mid * mid   			//multiplying middle value * middle value
      var difference: Float = 0
 
	if ((mul - n) < 0) {
	difference = -(mul - n)
	}
	else {
	difference = mul - n
	}
		// check if square of mid value or less than decimal
		if ((mul == n) || (difference< 0.01)) {
		return mid;
		}
		// check if square of mid value is less than n, do iteration with n and resultant values
		else if (mul < n) {
		     return square(n, mid, j)
			}
		    //else recur first half
		     else{
			return square(n, i, mid)
		}
	    }
	}
object SquareRoot{
	def main(args:Array[String]){
	//creating object SquareRoot
	val number = new SquareRoot
	//passing argument
	number.findSquareRoot(args(0).toInt)
	}
   }
