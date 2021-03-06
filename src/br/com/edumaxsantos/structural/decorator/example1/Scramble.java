package br.com.edumaxsantos.structural.decorator.example1;

public class Scramble extends Decorator {

    public Scramble(LCD inner) {
        super(inner);
    }

    @Override
    public void write(String[] s) {
        super.write(s);
        System.out.println("encrypt:");
        StringBuilder sb = new StringBuilder(s[0]);
        for(int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char) (sb.charAt(i) - 5));
        }
        s[0] = sb.toString();
    }

    @Override
    public void read(String[] s) {
        StringBuilder sb = new StringBuilder(s[0]);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i , (char) (sb.charAt(i) + 5));
        }
        s[0] = sb.toString();
        System.out.println("decrypt:");
        super.read(s);
    }
}
