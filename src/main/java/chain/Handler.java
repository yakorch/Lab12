package chain;

import lombok.Setter;

public class Handler {
    @Setter
    private Handler next;
    private final int quan;

    public Handler(int quan) {
        this.quan = quan;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % quan);
        } else if (amount % quan > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(amount / quan + " * " + quan);
    }
}
