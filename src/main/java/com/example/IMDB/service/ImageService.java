package com.example.IMDB.service;

import javax.annotation.Resource;

import org.apache.tomcat.util.http.fileupload.UploadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.example.IMDB.repository.ImageRepository;

@Service
public class ImageService {
   
	private static String UPLOAD_ROOT = "upload-dir";
	private final ImageRepository repository;
	private final ResourceLoader resource;
	
	@Autowired
	public ImageService(ImageRepository repository,ResourceLoader resource) {
		this.repository = repository;
		this.resource = resource;
	}
	
	public Resource findOneImage(String filename) {
		return resource.getResource("file:"+UPLOAD_ROOT+"/"+filename);
	}
	
	
}
