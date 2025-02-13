package Array;

/*
| Operasi Array        | Keterangan              |
|----------------------|-------------------------|
| array[index]         | Mengambil data di array |
| array[index] = value | Mengubah data di array  |
| array.length         | Mengambil panjang array |
*/

public class Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4};
        int target = 5;

        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                nums[i] = nums[i + 1];
            }
            System.out.println(nums[i]);
        }
    }
}
