//Hello world program to test Docker
public class DockerTestProgram {

    public String helloWorldTest() {
        return "Hello World";
    }

    public static void main(String[] args) {
        DockerTestProgram testObject = new DockerTestProgram();
        String print = testObject.helloWorldTest();
        System.out.print(print);
    }
} 