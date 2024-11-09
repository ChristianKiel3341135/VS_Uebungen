public class MyCountDownLatch {
    private int count;

    public void countDown() {
        //Decrements the count of the latch, releasing all waiting threads if the count reaches zero.
        if(count > 0){
            count--;
        }
    }

    public void await() throws InterruptedException {
        //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.
    }
}
