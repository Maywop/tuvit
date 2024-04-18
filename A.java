public class A {
    private boolean flag = false;

    public void abc() {}

    public void foo(A a) {
        if (flag)
            return;
        a.abc();
    }
}
