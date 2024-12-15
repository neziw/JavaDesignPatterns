package ovh.neziw.patterns;

class Rectangle extends Shape {

    private final double width;
    private final double height;

    protected Rectangle(final Renderer renderer, final double width, final double height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        this.renderer.renderRectangle(this.width, this.height);
    }
}