package com.vorono4ka.sctx;

import java.io.IOException;
import java.io.InputStream;

public interface SctxTextureLoader {
    SctxTexture load(InputStream inputStream) throws IOException;
}
