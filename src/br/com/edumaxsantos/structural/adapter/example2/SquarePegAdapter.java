package br.com.edumaxsantos.structural.adapter.example2;

// Design a "wrapper" class that can "impedance match" the old to the new
public class SquarePegAdapter {
    // The adapter/wrapper class "has a" instance of the legacy class
    private final SquarePeg squarePeg;

    public SquarePegAdapter(double w) {
        squarePeg = new SquarePeg(w);
    }

    // Identify the desired interface
    public void makeFit(RoundHole roundHole) {
        // The adapter/wrapper class delegates to the legacy object
        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        System.out.println("reducing SquarePeg " + squarePeg.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount");
        if (amount > 0) {
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            System.out.println("\t\twidth is now " + squarePeg.getWidth());
        }
    }
}
