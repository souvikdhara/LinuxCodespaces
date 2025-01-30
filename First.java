import java.io.*;
class First{
    public static void main(String[] args) {
        System.out.println("Hi from java");
        File file =new File("./history.txt");
        try(FileInputStream stream =new FileInputStream(file)){
            byte[] byteArr= stream.readAllBytes();
            for(byte b : byteArr){
                System.out.println((char)b);
            }

        }catch(FileNotFoundException ex){
            System.out.println("File not found");

        }catch(IOException ex){
            System.out.println("Input Output exception");
        }
    }
}