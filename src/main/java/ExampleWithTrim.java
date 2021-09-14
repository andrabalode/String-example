public class ExampleWithTrim {
    public static void main(String[] args) {
        String savedUserName = "andrabalode";
        String testUserName = "andrabalode ";

        // if we check these usernames without .trim() at the end, then we get "not equal" because of extra space
        if (savedUserName.equals(testUserName.trim())) {
            System.out.println("They are equal");
        } else {
            System.out.println(testUserName + "is not correct");
        }
    }
}
