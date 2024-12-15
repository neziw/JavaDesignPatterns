package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class BridgeExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(BridgeExample.class);

    public static void main(final String[] args) {
        final Renderer twoDRenderer = new TwoDRenderer();
        final Renderer threeDRenderer = new ThreeDRenderer();

        final Shape circle2D = new Circle(twoDRenderer, 5.0);
        final Shape rectangle2D = new Rectangle(twoDRenderer, 4.0, 3.0);

        final Shape circle3D = new Circle(threeDRenderer, 5.0);
        final Shape rectangle3D = new Rectangle(threeDRenderer, 4.0, 3.0);

        LOGGER.info("2D Shapes:");
        circle2D.draw();
        rectangle2D.draw();

        LOGGER.info("\n3D Shapes:");
        circle3D.draw();
        rectangle3D.draw();
    }
}