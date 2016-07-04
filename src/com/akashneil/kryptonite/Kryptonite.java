// Copyright 2016 Akash Neil

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.akashneil.kryptonite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kryptonite {

	public Kryptonite() throws IOException {

		File originalFile = new File("file.txt");
		Scanner fileScanner = new Scanner(originalFile);
		//PrintStream stream = new PrintStream(originalFile);
	
		FileWriter fileWriter = new FileWriter(originalFile, true);
		BufferedWriter buffer = new BufferedWriter(fileWriter);
		PrintWriter printWriter = new PrintWriter(buffer);

		String store = "";

		while (fileScanner.hasNext()) {

			store = fileScanner.nextLine();
			
		}

		StringBuffer textToEncrypt = new StringBuffer(store);

		for (int i = 0; i < textToEncrypt.length(); i++) {
			int temp = 0;
			temp = (int) textToEncrypt.charAt(i);
			temp = temp + 1;
			textToEncrypt.setCharAt(i, (char) temp);

		}
		System.out.println(textToEncrypt);
		
		printWriter.print("");
		printWriter.print(textToEncrypt.toString());
		
		fileScanner.close();
		printWriter.close();
	}

	public static void main(String[] args) throws IOException {
		new Kryptonite();
	}

}
