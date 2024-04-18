public class A {
    // Declare and initialize the flag variable
    private boolean flag = false;

    public void abc() {}

    public void foo(A a) {
        // Correctly check the value of the flag
        if (flag)
            return;
        a.abc();
    }
}
