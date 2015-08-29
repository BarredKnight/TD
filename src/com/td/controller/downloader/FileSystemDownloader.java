package com.td.controller.downloader;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;

public class FileSystemDownloader implements IDownloader{

    @Override
    public File download(Path path) throws Exception { /////////////////////////////////
        URL website = new URL(path.toString());

        final File file = new File(DEFAULT_PATH_TEXT+"/"+website.hashCode());

        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(DEFAULT_PATH_TEXT+"/"+website.hashCode());
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        return file;
    }

    @Override
    public File download(Path downloadPath, Path savePath) throws Exception {
        return null;
    }
}
