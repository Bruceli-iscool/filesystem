import java.util.*;
import java.io.File;

public class filesystem {
    public static void main(String args[]) {
	if (args.lenght ==0) {
	    System.out.println("Filesystem Usage:\n filesystem [filepath] [args])");
	} else if (args.length==1){
            start(args[0]);
	} else {
	    process(args[0], args[1]);
	}
    }
    public static void process(String path, String args) {
    	// todo: handle fileystem processing
	
    } public static void start(String path) {
    	// start the engine.
	FileSystem fs = new FileSystem(path);
    }
}
class FileSystem {
    private void String fileContent;
    public FileSystem(String filePath) {
    	//todo
    }
}
