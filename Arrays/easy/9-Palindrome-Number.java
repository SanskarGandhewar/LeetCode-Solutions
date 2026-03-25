# 9. Palindrome Number

## 🧠 Problem

Given an integer `x`, return `true` if it is a palindrome, otherwise return `false`.

---

## 💡 Approach (Optimized)

* Negative numbers → always false
* Reverse only half of the number
* Compare first half and reversed half

---

## ⚡ Code (Java)

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
```

---

## ⏱ Complexity

* Time: `O(log10 n)`
* Space: `O(1)`

---

## 📌 Example

Input:

```
121
```

Output:

```
true
```

---

## 🚀 Key Insight

Instead of reversing the whole number, reverse only half to avoid overflow and improve efficiency.
