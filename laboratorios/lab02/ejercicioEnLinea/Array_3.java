public class Array3 {

  public int maxSpan(int[] nums) {

    int maxSpan = 0;                            // C1

    for (int i = 0 ; i < nums.length ; i++) {   // n
      int currentSpan = 0;                      // C3*n
      for (int j = i ; j < nums.length ; j++) { // n*n
        if (nums[i] == nums[j]) {               // C4*n*n
          currentSpan = j - (i + 1);            // C5*n*n
        }
        if (currentSpan > maxSpan) {            // C6*n*n
          maxSpan = currentSpan;                // C7*n*n
        }
      }
    }
    return maxSpan;                             // C8
  }


  public int[] fix34(int[] nums) {

  for (int i = 0 ; i < nums.length - 1 ; i++) {   // n
    if (nums[i] == 3) {                           // C1*n
      for (int j = 0 ; j < nums.length ; j++ ) {  // n*n
        if (nums[j] == 4) {                       // C2*n^2
          if (j > 0 && nums[j - 1] == 3){         // C3*n^2
            continue;                             // C4*n^2
          }
          nums[j] = nums[i + 1];                  // C5*n^2
          nums[i + 1] = 4;                        // C6*n^2
        }
      }
    }
  }
  return nums;                                    //C7*n
  }

  public int[] fix45(int[] nums) {

    for (int i = 0 ; i < nums.length - 1 ; i++) {   //n
      if (nums[i] == 4) {                           // C1*n
        for (int j = 0 ; j < nums.length ; j++ ) {  // n*n
          if (nums[j] == 5) {                       // C2*n^2
            if (j > 0 && nums[j - 1] == 4){         // C3*n^2
              continue;                             // C4*n^2
            }
            nums[j] = nums[i + 1];                  // C5*n^2
            nums[i + 1] = 5;                        // C6*n^2
          }
        }
      }
    }
    return nums;                                    //C7*n
  }

  public boolean canBalance(int[] nums) {
    int sum = 0;                                    //C1
    for (int i = 0 ; i < nums.length ; i++) {       //n
      sum += nums[i];                               //C2*n
      int temp = sum;                               //C3*n
      for (int j = i + 1 ; j < nums.length ; j++) { //n*n
        temp -= nums[j];                            //C4*n^2
      }
      if (temp == 0) {                              //C5*n
        return true;                                //C6
      }
    }
    return false;                                   //C6
  }

  public boolean linearIn(int[] outer, int[] inner) {
    int posOuter = 0;                                 //C1
    int recorrido = 0;                                //C2
    for(int i = 0; i < inner.length; i++){            //n
      for(int j = posOuter; j < outer.length; j++){   //n*m
        if(outer[j] == inner[i]){                     //C2*n*m
          recorrido ++;                               //C2*n*m
          posOuter = j;                               //C2*n*m
          break;                                      //C2*n*m
        }
      }
    }
    return recorrido == inner.length;                 //C2*n*m
  }
}
