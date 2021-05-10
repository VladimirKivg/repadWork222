package repadWork_interf;

public class Test22<T> {
    private Test2 test2;
    private T gen;

    public Test22(Test2 test2, T gen) {
        this.test2 = test2;
        this.gen = gen;
    }

    public Test2 getTest2() {
        return test2;
    }

    public T getGen() {
        return gen;
    }
}
