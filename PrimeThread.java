


class PrimeThread extends Thread {
    long minPrime;
    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        PrimeThread p = new PrimeThread(143);
        p.start();

    }
}