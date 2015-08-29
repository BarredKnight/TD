package com.td.controller.downloader;

import java.io.File;
import java.nio.file.Path;

public interface IDownloader {

	public String DEFAULT_PATH_TEXT = "";

	public String DEFAULT_PATH_WORDS = "";

	public abstract File download(Path path) throws Exception;

	public abstract File download(Path downloadPath, Path savePath) throws Exception;

}
