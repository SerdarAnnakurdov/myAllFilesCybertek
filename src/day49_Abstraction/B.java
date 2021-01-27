package day49_Abstraction;

interface X {
    void x();
}

interface Y {
    void y();
}

interface Z {
    void z();
}

public interface B extends X, Y, Z {
    void qO();

}

class Practice implements B  {
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void z() {

    }

    @Override
    public void qO() {

    }
}