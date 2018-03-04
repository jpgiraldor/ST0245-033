public class Array3 {

  public int maxSpan(int[] nums) {

    int maxSpan = 0;

    for (int i = 0 ; i < nums.length ; i++) {
      int currentSpan = 0;
      for (int j = i ; j < nums.length ; j++) {
        if (nums[i] == nums[j]) {
          currentSpan = j - (i + 1);
        }
        if (currentSpan > maxSpan) {
          maxSpan = currentSpan;
        }
      }
    }
    return maxSpan;
  }

  public int[] fix34(int[] nums) {

  for (int i = 0 ; i < nums.length - 1 ; i++) {
    if (nums[i] == 3) {
      for (int j = 0 ; j < nums.length ; j++ ) {
        if (nums[j] == 4) {
          if (j > 0 && nums[j - 1] == 3){
            continue;
          }
          nums[j] = nums[i + 1];
          nums[i + 1] = 4;
        }
      }
    }
  }
  return nums;
  }

  public int[] fix45(int[] nums) {

    for (int i = 0 ; i < nums.length - 1 ; i++) {
      if (nums[i] == 4) {
        for (int j = 0 ; j < nums.length ; j++ ) {
          if (nums[j] == 5) {
            if (j > 0 && nums[j - 1] == 4){
              continue;
            }
            nums[j] = nums[i + 1];
            nums[i + 1] = 5;
          }
        }
      }
    }
    return nums;
  }

  public boolean canBalance(int[] nums) {
    int sum = 0;
    for (int i = 0 ; i < nums.length ; i++) {
      sum += nums[i];
      int temp = sum;
      for (int j = i + 1 ; j < nums.length ; j++) {
        temp -= nums[j];
      }
      if (temp == 0) {
        return true;
      }
    }
    return false;
  }

  public boolean linearIn(int[] outer, int[] inner) {
    int posInner = 0;
    int recorrido = 0;
    for(int i = 0; i < inner.length; i++){
      for(int j = posInner; j < outer.length; j++){
        if(outer[j] == inner[i]){
          recorrido ++;
          posInner = j;
          break;
        }
      }
    }
    return recorrido == inner.length;
  }
}
