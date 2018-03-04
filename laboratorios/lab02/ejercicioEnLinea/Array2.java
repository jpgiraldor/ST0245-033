
/**
 * Write a description of class CodingBat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2
{
    public int countEvens(int[] nums) {
        int x=0;                                //c1
            for(int i=0; i<nums.length;i++){    //n
            if (nums[i]%2==0)x++;               //c2*n

        }
        return x;                               //c3
    }

    public int bigDiff(int[] nums) {
        int x=nums[0];                          //c1
        int y=nums[0];                          //c2
        for(int i=0;i<nums.length;i++){         //n
            if(nums[i]>=x)x=nums[i];            //c3*n
            if(nums[i]<=y)y=nums[i];            //c4*n
        }
        return x-y;                             //c5

    }

    public boolean lucky13(int[] nums) {
        for(int i=0;i<nums.length;i++){         //n
            if(nums[i]==1||nums[i]==3)return false; //c*n

        }
        return true;                            //c2
    }

    public boolean sum28(int[] nums) {
        int x=0;                                //c1
        for(int i=0;i<nums.length;i++){         //n
            if(nums[i]==2)x++;                  //c2*n

        }
        x=x*2;                                  //c3
        if(x==8)return true;                    //c4
        else return false;                      //c5
    }

    public boolean more14(int[] nums) {
        int x=0;                                //c1
        int y=0;                                //c2
        for(int i=0;i<nums.length;i++){         //n
            if(nums[i]==1)x++;                  //c3*n
            if(nums[i]==4)y++;                  //c4*n

        }
        if (x>y)return true;                    //c5
        else return false;                      //c6
    }
}
