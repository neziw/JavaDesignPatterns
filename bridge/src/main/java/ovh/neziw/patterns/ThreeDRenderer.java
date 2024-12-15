package ovh.neziw.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ThreeDRenderer implements Renderer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreeDRenderer.class);

    @Override
    public void renderCircle(final double radius) {
        LOGGER.info("Rendering 3D circle with radius {}", radius);
    }

    @Override
    public void renderRectangle(final double width, final double height) {
        LOGGER.info("Rendering 3D rectangle with width {} and height {}", width, height);
    }
}