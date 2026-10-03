class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] nums = new int[26];
        char a;
        char b;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            b = t.charAt(i);

            nums[a-97]++;
            nums[b-97]--;
        }

        for (int n : nums) {
            if (n > 0) return false;
        }

        return true;
    }
}

// check len of s and t (diff => return false)
// new arr[26] (fills w 0)
// char a
// char b

// for (i = 0; i < s.length(); i++)
//  a = s.charAt(i)
//  b = t.charAt(i)
//  arr[a]++;
//  arr[b]++;

// for (int n : arr) 
//  if (n % 2 != 0) return false

// return true


// 122
// 97