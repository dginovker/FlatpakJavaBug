import java.net.InetAddress;

public final class Main {
  public static void main(String[] args) {
    try {
      InetAddress.getLocalHost();
      System.out.println("Completed without issue!");
      System.exit(0);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}

