package br.com.edumaxsantos.structural.decorator.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Core implements LCD {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void write(String[] s) {
        System.out.print("INPUT:\t\t");
        try {
            s[0] = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(String[] s) {
        System.out.println("Output:\t\t" + s[0]);
    }
}
