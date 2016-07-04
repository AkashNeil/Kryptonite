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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kryptonite {

	public Kryptonite() throws FileNotFoundException {

		File original = new File("original.txt");
		Scanner fileScanner = new Scanner(original);

		String store = "";

		while (fileScanner.hasNext()) {

			store = fileScanner.nextLine();
			// System.out.println(store);
		}

		StringBuffer password = new StringBuffer(store);

		for (int i = 0; i < password.length(); i++) {
			int temp = 0;
			temp = (int) password.charAt(i);
			temp = temp * 2;
			password.setCharAt(i, (char) temp);

		}
		System.out.println(password);
		fileScanner.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Kryptonite();
	}

}
