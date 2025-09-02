# Day29 :longest substring
Given a string s, find the longest substring without repeating characters. A substring is a contiguous sequence of characters within the string.

**Test Cases**
1. Input: abbcabcd     Output:bcad
2. Input:  pwwkew     Output:wke

**Intuition**
1. Maintain a temporary string (res) that always contains the current substring without duplicates.
2. Iterate over the given string character by character.
3. If the new character is not present in res, add it.
4. If the new character is already present, then:
5. Compare current substring length with the maximum length found so far.
6.Remove characters from the start of res up to the first occurrence of the duplicate.
7. Append the new character to continue building the substring.
8.At the end, perform one last check because the longest substring may end at the final character.

**Algorithm Flow**
1. Start with res = "", maxstr = "", max = 0.
2. Read 'a': not in res, so res = "a".
3. Read 'b': not in res, so res = "ab".
4. Read 'b': duplicate found at index 1 in res.
5. Update max = 2 ("ab").
6. Remove "a", keep "b", then append 'b' → res = "b".
7. Read 'c': not in res, so res = "bc".
8.Read 'a': not in res, so res = "bca".
9. Read 'b': duplicate found at index 0 in res.
10. Update max = 3 ("bca").
11. Remove "b", keep "ca", then append 'b' → res = "cab".
12. Read 'c': duplicate found at index 0 in res.
13. Update max = 3 ("bca" still max).
14.Remove "c", keep "ab", then append 'c' → res = "abc".
15.Read 'd': not in res, so res = "abcd".
16.Final check: "abcd" length = 4 > max, so maxstr = "abcd".

**Complexity Analysis**
Time Complexity:O(n)
Space Complexity:O(n).
