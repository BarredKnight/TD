package com.td.controller.downloader;


import java.io.File;
import java.nio.file.Path;

public interface IDownloader {

	File download(Path path);

}
