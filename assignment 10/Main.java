import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

 class Main {

  public static void main(String args[]) {

    String name = "javaprogramming";
    System.out.println("String is: " + name);

    try {

      InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
      System.out.println("InputStream: " + stream);
      
      for(int i=0;i<stream.available();i++){
      System.out.println("Available bytes at the beginning: " + stream.available());

      stream.read();

      System.out.println("Available bytes at the end: " + stream.available());
      }
      stream.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}