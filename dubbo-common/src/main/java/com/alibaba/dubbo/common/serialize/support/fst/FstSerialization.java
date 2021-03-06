package com.alibaba.dubbo.common.serialize.support.fst;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.ObjectInput;
import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.serialize.OptimizedSerialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lishen
 */
public class FstSerialization implements OptimizedSerialization {

    public byte getContentTypeId() {
        return 9;
    }

    public String getContentType() {
        return "x-application/fst";
    }

    public ObjectOutput serialize(URL url, OutputStream out) throws IOException {
        return new FstObjectOutput(out);
    }

    public ObjectInput deserialize(URL url, InputStream is) throws IOException {
        return new FstObjectInput(is);
    }
}