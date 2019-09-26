class SimpleLoop
{
   public static int sum(int low, int high)
   {
      /* TO DO:  Return the sum of the integers between
         low and high (inclusive).  Yes, this can be
         done without a loop, but the point is to
         practice the syntax for a loop.
      */

        // check that low is NOT greater than the high
        if (low > high)
        {
            return 0;
        }

        // for loo using range of (low, high)
        int sum = 0;
        for (int i = low; i < high + 1; i++)
        {
            sum += i;
        }
        return sum;      

   }
}
