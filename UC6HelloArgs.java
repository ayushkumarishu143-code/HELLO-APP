public class UC6HelloArgs {
    public static void main(String[] args) {
        
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello");
            return;
        }

        String result = "Hello ";

        // Append each argument with delimiter
        for (String arg : args) {
            result += arg + ", ";
        }

        // Remove trailing ", " using substring
        result = result.substring(0, result.length() - 2);

        // Display result
        System.out.println(result);
    }
}