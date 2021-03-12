import java.io.Console;
import java.util.*;

/**
 * This program demonstrates console input.
 *
 * @author Cay Horstmann
 * @version 1.10 2004-02-10
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? \n");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? \n");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
/*有错误 因为console只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。
        Console console = System.console();
        String username = console.readLine("User name:");
        char[] passwd = console.readPassword("Password:");
        System.out.println(passwd);
*/
        String dir =System.getProperty("user.dir");
        System.out.println(dir);//调用相对文件路径时的前提路径 如调用"myname.txt"
    }
}
