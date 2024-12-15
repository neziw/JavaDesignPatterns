package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TwoDRenderer implements Renderer {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwoDRenderer.class);

    @Override
    public void renderCircle(final double radius) {
        LOGGER.info("Rendering 2D circle with radius {}", radius);
    }

    @Override
    public void renderRectangle(final double width, final double height) {
        LOGGER.info("Rendering 2D rectangle with width {} and height {}", width, height);
    }
}