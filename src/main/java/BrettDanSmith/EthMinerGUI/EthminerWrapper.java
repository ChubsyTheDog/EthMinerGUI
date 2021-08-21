package BrettDanSmith.EthMinerGUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EthminerWrapper {

	public void run(String[] args) throws IOException {
		Process process = new ProcessBuilder("./bin/ethminer.exe", args).start();
		InputStream processInputStream = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(processInputStream));
	}

}
