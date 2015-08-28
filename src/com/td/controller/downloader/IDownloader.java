package com.td.controller.downloader;

import com.td.java.fromSDK.File;
import com.td.java.fromSDK.Path;

public interface IDownloader {

	public abstract File download(Path path);

	public abstract Path download(Path downloadPath, Path savePath);

}
