
/**
 * Write a description of class CodingBat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2
{
    public int countEvens(int[] nums) {
        int x=0;
        for(int i=0; i<nums.length;i++){
            if (nums[i]%2==0)x++;

        }
        return x;
    }

    public int bigDiff(int[] nums) {
        int x=nums[0];
        int y=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=x)x=nums[i]; 
            if(nums[i]<=y)y=nums[i];
        }
        return x-y;

    }

    public boolean lucky13(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1||nums[i]==3)return false;

        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2)x++;

        }
        x=x*2;
        if(x==8)return true;
        else return false;
    }

    public boolean more14(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)x++;
            if(nums[i]==4)y++;

        }
        if (x>y)return true;
        else return false;
    }
}
