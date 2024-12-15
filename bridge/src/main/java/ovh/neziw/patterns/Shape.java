package ovh.neziw.patterns;

abstract class Shape {

    protected Renderer renderer;

    protected Shape(final Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}