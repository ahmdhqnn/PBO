package pbo.tuprak.AbstractInterface;

class ResizableRectangle extends Rectangle implements Resizable {
    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(int percent) {
        width *= (1 + percent / 100.0);
        length *= (1 + percent / 100.0);
    }
}
