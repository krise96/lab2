 import java.io.BufferedReader;   import java.io.FileReader;   import java.io.FileWriter;   import java.io.IOException;   import java.io.File;  
  
 public class TextReader {    static String filename = "scannn.txt";      private static void readFile(String fileName) {       try {  
       
       FileReader reader = new FileReader(filename);  
       BufferedReader in = new BufferedReader(reader);         String string;  
       while ((string = in.readLine()) != null) {  
         System.out.println(string);  
       }         in.close();  
     } catch (IOException e) {         e.printStackTrace();  
     }  
   }        static void makeFile() {        try {  
  
      FileWriter fw =         new FileWriter(filename);        fw.close();  
      } 
 
   public static void main(String[] args) {      TextReader.makeFile();      if (args.length != 1) {  
       System.err.println("usage: java TextReader "  
         + "file location");  
       System.exit(0);  
     }  
     TextReader.readFile(filename);  
   }  
 } 
 
private static void readUsingFileReader(String fileName) throws IOException { 
        File file = new File(fileName); 
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr); 
        String line; 
        while((line = br.readLine()) != null){ 
            System.out.println(line); 
        }         br.close();         fr.close(); 
          
    } 
  
    private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {         File file = new File(fileName); 
        FileInputStream fis = new FileInputStream(file); 
        InputStreamReader isr = new InputStreamReader(fis, cs); 
        BufferedReader br = new BufferedReader(isr);         String line; 
        while((line = br.readLine()) != null){ 
            System.out.println(line); 
        }         br.close(); 
    } 
  
    private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws 
IOException { 
        Path path = Paths.get(fileName); 
        BufferedReader br = Files.newBufferedReader(path, cs);         String line; 
        while((line = br.readLine()) != null){ 
            System.out.println(line); 
        }         br.close(); 
    } 
  
    private static void readUsingBufferedReader(String fileName) throws IOException { 
        File file = new File(fileName); 
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr); 
        String line; 
        while((line = br.readLine()) != null){ 
            System.out.println(line); 
        }         br.close();         fr.close(); 
    } 
  
    private static void readUsingScanner(String fileName) throws IOException { 
        Path path = Paths.get(fileName);         Scanner scanner = new Scanner(path);         while(scanner.hasNextLine()){ 
            String line = scanner.nextLine(); 
        } 
    } 
