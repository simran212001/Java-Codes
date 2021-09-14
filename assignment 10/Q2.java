import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Q2 {

    public static void main(String args[]) {

        try {

            // create an input stream
            byte[] input = {1, 2, 3};
            InputStream stream = new ByteArrayInputStream(input);
            System.out.println("Input Stream: " + stream);

            // convert the input stream to byte array
            byte[] array = stream.readAllBytes();
            System.out.println("Byte Array: " + Arrays.toString(array));
            String s = new String(array, StandardCharsets.UTF_8);
            System.out.println("Output : " + s);

            stream.close();

        }

        catch (Exception e) {
            e.getStackTrace();
        }


    }
}