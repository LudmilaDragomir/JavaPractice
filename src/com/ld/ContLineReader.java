package com.ld;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

public abstract class ContLineReader extends LineNumberReader {

    protected int firstLineNumber = 0;
    protected boolean doContinue = true;

    public void setDoContinue(boolean doContinue) {
        this.doContinue = doContinue;
    }

    public boolean getDoContinue() {
        return doContinue;
    }
    public abstract String readLine() throws IOException;

    public String readPhysicalLine() throws IOException{
        return super.readLine();
    }

    public ContLineReader(Reader in) {
        super(in);
    }

    public ContLineReader(Reader in, int sz) {
        super(in, sz);
    }

    public int read() throws IOException{
        return super.read();
    }
    public int read(char[] cBuff, int off,int len) throws IOException {
        return super.read(cBuff, off, len);
    }

    public boolean markSupported(){
        return false;
    }
}
