import acm.program.ConsoleProgram;
public class main extends ConsoleProgram {
    public void run() {
        for (int i = 0; i<5;i++) {
            String inputName = readLine("enter your name: ");
            if (inputName.equals("osm")) println("wel");
            else println("not!");

        }
    }
}
