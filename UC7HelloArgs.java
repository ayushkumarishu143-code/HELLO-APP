public class UC7HelloArgs {
    public static void main(String[] args) {

        // If no arguments, print default message
        if (args.length == 0) {
            System.out.println("Hello");
            return;
        }

        String result = "Hello ";

        // Loop through arguments
        for (int i = 0; i < args.length; i++) {
            result += args[i];

            // Add delimiter only if it's not the last element
            if (i != args.length - 1) {
                result += ", ";
            }
        }

        // Print final output
        System.out.println(result);
    }
}