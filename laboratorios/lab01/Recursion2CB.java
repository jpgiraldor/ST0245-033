
public class Recursion2CB
{
   
    public boolean groupSum6(int start, int[] nums, int target) {                       //c1
    if(start >= nums.length) {                                                          // c2
       return target == 0;                                                              // c3
    } 
    if(nums[start] == 6) {                                                              //c4
        return groupSum6(start +1, nums, target-nums[start]);                           //c5 + T(n-1)
    }  
    return groupSum6(start+1, nums, target-nums[start]) || groupSum6(start +1, nums, target);  //2T(n-1)
  }     //
  
  public boolean groupSum5(int start, int[] nums, int target) {                         //c1
    if(start==nums.length) {                                                            // c2
         return target==0;                                                              // c3
    }
    if(nums[start]%5==0 && start<nums.length-1 && nums[start+1]==1){                    //c4
        nums[start+1]=0;                                                                //c5
    } 
    return groupSum5(start+1,nums,target-nums[start]) || (nums[start]%5!=0 && groupSum5(start+1,nums,target)); //2T(n-1)
   }    //
  
  public boolean groupSumClump(int start, int[] nums, int target) {         //c1
      if(start == nums.length) {                                            //c2
          return target == 0;                                               //c3
       }       
      int suma = nums[start];                                               //c4
      int contador = 1;                                                     //c5
      for(int i = start+1; i<nums.length; i++) {                            //c6 * n
          if(nums[i] == nums[start]) {                                      //c7 * n
              suma = suma + nums[i];                                        //c8 * n
              contador++;                                                   //c9 * n
            }
        }     
      return groupSumClump(start + 1, nums, target - suma) || groupSumClump(start + 1, nums, target); //2T(n-1)
  }  // O(2^n)

  public boolean groupNoAdj(int start, int[] nums, int target) {                                            //c1
      if(start >= nums.length) {                                                                            //c2
           return target == 0;                                                                              //c3
      }  
      return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);    //2T(n-1)
  }

  public boolean splitArray(int[] nums) {                                                                   //c1
      return auxiliar(0, nums, 0, 0);                                                                       //c2
    }
  public boolean auxiliar(int start, int[] nums, int sumaizq, int sumader) {                                //c3
      if(start >= nums.length) {                                                                            //c4
          return sumaizq == sumader;                                                                        //c5
        }
      return auxiliar(start+1, nums, sumaizq, sumader+nums[start]) || auxiliar(start+1, nums, sumaizq + nums[start], sumader); //2T(n+1)
    }
}
