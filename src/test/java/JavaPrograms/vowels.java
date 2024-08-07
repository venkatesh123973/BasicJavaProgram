package JavaPrograms;

public class vowels {


        public static void main(String[] args) {
            String input = "Hello World!";
            countVowels(input);
        }

        public static void countVowels(String input) {
            // Convert the input string to lower case
            input = input.toLowerCase();

            // Initialize counters for each vowel
            int aCount = 0;
            int eCount = 0;
            int iCount = 0;
            int oCount = 0;
            int uCount = 0;

            // Iterate through each character of the string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                switch (ch) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                    default:
                        // Do nothing for non-vowel characters
                        break;
                }
            }

            // Print the results
            System.out.println("Number of 'a': " + aCount);
            System.out.println("Number of 'e': " + eCount);
            System.out.println("Number of 'i': " + iCount);
            System.out.println("Number of 'o': " + oCount);
            System.out.println("Number of 'u': " + uCount);
        }
    }

