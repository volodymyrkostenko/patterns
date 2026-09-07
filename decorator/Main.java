package decorator;

public class Main {
    
    public static void main(String[] args) {
        FileData fileData = new EnctyptionDecorator(new CompressDecorator(new FileDataWriter()));
        fileData.writeData("Hello World".getBytes());
    }
}
