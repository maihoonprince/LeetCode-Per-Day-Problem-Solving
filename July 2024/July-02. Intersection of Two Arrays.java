July-02. Intersection of Two Arrays II :
350.


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int [] ans = new int[length1 * length2];
        int i=0, j=0, k=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<length1 && j<length2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                ans[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}