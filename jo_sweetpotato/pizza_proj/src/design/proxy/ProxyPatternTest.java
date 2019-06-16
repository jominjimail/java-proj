package design.proxy;

public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("user1", "is_not_pw");
        try {
            executor.runCommand("ls -al");
            executor.runCommand("rm -rf *"); // proxy 클래스에 의해 에러가 날 것이다.
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
