package com.win.java.se.task1;

import java.io.*;

public class OperationReader {

    private String path;
    private Operation[] operations;

    public OperationReader(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists() || file.isDirectory())
            throw new FileNotFoundException();
        else
            this.path = path;
    }

    public synchronized Operation[] Read() throws IOException {

        FileInputStream FIS = new FileInputStream(this.path);
        StringBuilder SB = new StringBuilder();
        int current;
        current = FIS.read();
        while (current != -1) {
            SB.append((char) current);
            current = FIS.read();
        }
        FIS.close();

        String data = SB.toString();
        String[] split = data.split("\n");
        String[] splitbyword;
        this.operations = new Operation[split.length];

        int i = 0;
        int j = 0;
        while (i < split.length) {

            this.operations[i] = new Operation();
            splitbyword = split[i].split(" ");

            this.operations[i].setId(Integer.parseInt(splitbyword[0]));
            this.operations[i].setSender(splitbyword[1]);
            this.operations[i].setRecipient(splitbyword[2]);
            this.operations[i].setAmount(Integer.parseInt("50"));

            i++;
        }

        return this.operations;

    }
}
