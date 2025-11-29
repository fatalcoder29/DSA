class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char i : address.toCharArray()) {   // loop through each character
            if (i == '.') {                      // check if character is '.'
                sb.append("[.]");                // replace with [.]
            } else {
                sb.append(i);                    // otherwise keep the character
            }
        }
        return sb.toString();                    // convert builder to string
    }
}