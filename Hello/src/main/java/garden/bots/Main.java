package garden.bots;


import java.io.File;

import com.dylibso.chicory.runtime.Module;
import com.dylibso.chicory.runtime.Instance;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        Module module = Module.build(new File("/workspace/arhuaco/factorial.wasm"));
        
        Instance instance = module.instantiate();

    }
}

// mvn package
// java -jar target/Hello-1.0-SNAPSHOT.jar 
