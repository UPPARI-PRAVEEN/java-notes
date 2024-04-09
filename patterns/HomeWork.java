class HomeWork {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            
            // Inner loop for stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); // Print stars
            }

            // Move to the next line
            System.out.println();
        }
    }
}
