public class stringshuffle {
    public static void main(String[] args) {
      int i, j, k, l, st, en, kk, num, num1, num2, count = 1, t = 0, idx = 0, count1 = 0, p = 0, s1, s2, count2 = 0,
          p1 = 0;
      String s="DONE";
      int a[] = new int[s.length()];
      int b[] = new int[s.length()];
      String strt = "";
      String end = "";
      for (i = 1; i <= s.length(); i++) {
        strt = strt + i;
      }
      // to print start value
      // System.out.println(strt);
      for (j = s.length(); j >= 1; j--) {
        end = end + j;
      }
      // to print end value
      // System.out.println(end);
      st = Integer.parseInt(strt);
      en = Integer.parseInt(end);
     // System.out.println(en);//4 3 2 1
      for (k = en; k >= st; k--) {
        count2 = 0;
        idx = 0;
        count1 = 0;
        kk = k;
        while (kk != 0) {
          num = kk % 10;
          if (count <= s.length()) {
            a[t] = num;
            //System.out.println(a[t]);//1 2 3 4 
            t++;
          }
          for (l = 0; l < s.length(); l++) {
            if (num == a[l]) {
              count1++;
             // System.out.println(count1);
              if (count1 == s.length()) {
                p = k;
                while (p != 0) {
                  num1 = p % 10;
                  b[idx] = num1;
                   System.out.print(num1);
                  p = p / 10;
                  idx++;
                }
                for (s1 = 0; s1 < b.length; s1++) {
                  for (s2 = s1 + 1; s2 < b.length; s2++) {
                    if (b[s1] == b[s2]) {
                      count2++;
                    }
                  }
                }
                if (count2 == 0) {
                  p1 = k;
                  while (p1 != 0) {
                    num2 = p1 % 10;
                    System.out.print(s.charAt(num2 - 1));
                    p1 = p1 / 10;
                    // System.out.println(k);
                  }
                  System.out.println("");
                }
              }
            }
          }
          // to split number System.out.print(num);
          kk = kk / 10;
  
          count++;
        }
        // System.out.println(k);
      }
    }
  }
  