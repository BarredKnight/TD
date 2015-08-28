package com.td.controller.downloader;

import java.io.File;
import java.nio.file.Path;

public interface IDownloader {

	public abstract File download(Path path);

	public abstract Path download(Path downloadPath, Path savePath);

}
