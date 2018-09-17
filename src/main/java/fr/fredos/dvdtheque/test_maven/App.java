package fr.fredos.dvdtheque.test_maven;

import java.io.File;
import java.io.PrintStream;

import org.apache.maven.cli.MavenCli;

public class App {
	private static final String MVN_GOAL = "package";
	private static final PrintStream OUTPUT = System.out;
    private static final PrintStream ERROR_OUTPUT = System.out;
    
    public static void main( String[] args ){
    	File f = new File(".");
    	System.setProperty("maven.multiModuleProjectDirectory", f.getAbsolutePath());
    	MavenCli mavenCli = new MavenCli();
    	mavenCli.doMain(new String[]{MVN_GOAL},
    			f.getAbsolutePath(),
                OUTPUT,
                ERROR_OUTPUT);
    }
}
