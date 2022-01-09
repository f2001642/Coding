public class MaxOperations {

    public static void main(String... args) {
        // --------------------------------------------
        int N = 10;
        String[] array = new String[N];
        // --------------------------------------------

        // TODO: Sort the input array by alphabetic order ASC, size DSC
        Arrays.sort(array);

        int maximumOperations = 0;
        String s = array[0];
        for (int i = 1; i < N-1; i++) {

            String prefix = array[i];
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix != "") {
                s = prefix;
                maximumOperations++;
            } else {
                s = array[i];
            }
        }
      
        System.out.println("Maximum no. of operations: " + maximumOperations);
    }
  
    
}
