public class Single {
    public int isSingle(int[] nums){
        boolean single;
        int tam = nums.length;

        for(int i = 0; i< tam; i++){
            single = true;
            for(int j = 0; j <tam; j++){
                if(j != i && nums[i] == nums[j]){
                    single = false;
                }
            }

            if(single){
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Single s = new Single();
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(s.isSingle(nums));
    }
}
