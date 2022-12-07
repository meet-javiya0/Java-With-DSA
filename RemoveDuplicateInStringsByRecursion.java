public class RemoveDuplicateInStringsByRecursion {
    public static void removeDup(String str, int ind, StringBuilder newstr, boolean map[]) {
        if (ind == str.length()) {
            System.out.println(newstr);
            return;
        }

        char curChar = str.charAt(ind);
        if (map[curChar - 'a'] == true) {
            removeDup(str, ind + 1, newstr, map);
        } else {
            map[curChar - 'a'] = true;
            removeDup(str, ind + 1, newstr.append(curChar), map);
        }
    }

    public static void main(String args[]) {
        removeDup("meetjaviya", 0, new StringBuilder(""), new boolean[26]);
    }
}