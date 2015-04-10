import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.BufferedImage;
class BlurFilter implements MyFilter {
    @Override
    public BufferedImage processImage(BufferedImage image) {
        float[] blurMatrix = { 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f };
        ConvolveOp op = new ConvolveOp (new Kernel (3, 3, blurMatrix), ConvolveOp.EDGE_NO_OP, null);
        return op.filter(image, null);
    }
}