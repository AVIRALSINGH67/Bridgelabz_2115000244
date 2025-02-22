import java.io.*;
public class BufferedFileCopy {
	public static void main(String[] args) {
    	String sourceFile = "largeFile.txt";
    	String destinationFile = "copiedFile.txt";
 
    	try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
         	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
 
        	byte[] buffer = new byte[4096]; // 4 KB buffer
        	int bytesRead;
        	long startTime = System.nanoTime();
 
        	while ((bytesRead = bis.read(buffer)) != -1) {
            	bos.write(buffer, 0, bytesRead);
        	}
 
        	long endTime = System.nanoTime();
        	System.out.println("Buffered Copy completed in " + (endTime - startTime) / 1_000_000 + " ms");
 
    	} catch (IOException e) {
        	System.out.println("File copy failed" + e.getMessage());
    	}
	}
}
