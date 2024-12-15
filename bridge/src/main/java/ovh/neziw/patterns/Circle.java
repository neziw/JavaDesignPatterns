package ovh.neziw.patterns;

class Circle extends Shape {

    private final double radius;

    protected Circle(final Renderer renderer, final double radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.renderer.renderCircle(this.radius);
    }
}