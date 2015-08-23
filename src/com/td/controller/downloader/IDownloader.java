package com.td.controller.downloader;

import java.fromSDK.File;
import java.fromSDK.Path;

public interface IDownloader {

	public abstract File download(Path path);

}
