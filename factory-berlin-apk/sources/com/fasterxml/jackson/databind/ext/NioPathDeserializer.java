package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    private static final boolean areWindowsFilePathsSupported;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String path = listRoots[i2].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i2++;
        }
        areWindowsFilePathsSupported = z;
    }

    public NioPathDeserializer() {
        super((Class<?>) Path.class);
    }

    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return (Path) deserializationContext.handleUnexpectedToken(Path.class, jsonParser);
        }
        String text = jsonParser.getText();
        if (text.indexOf(58) < 0) {
            return Paths.get(text, new String[0]);
        }
        if (areWindowsFilePathsSupported && text.length() >= 2 && Character.isLetter(text.charAt(0)) && text.charAt(1) == ':') {
            return Paths.get(text, new String[0]);
        }
        try {
            URI uri = new URI(text);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e2) {
                String scheme = uri.getScheme();
                Iterator<S> it = ServiceLoader.load(FileSystemProvider.class).iterator();
                while (it.hasNext()) {
                    FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                    if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                        return fileSystemProvider.getPath(uri);
                    }
                }
                return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, e2);
            } catch (Throwable th) {
                th.addSuppressed(e2);
                return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, th);
            }
        } catch (URISyntaxException e3) {
            return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, e3);
        }
    }
}
