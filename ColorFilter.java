import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.BufferedImage;
public class ColorFilter implements MyFilter {
    @Override
    public BufferedImage processImage(BufferedImage image) {
        float[] colorMatrix = {  1f, 0f, 0f , 0.5f, 1.0f, 0.5f, 0.2f, 0.4f, 0.6f};
        ConvolveOp op = new ConvolveOp (new Kernel (3, 3, colorMatrix), ConvolveOp.EDGE_NO_OP, null);
        return op.filter (image, null);
    }
}