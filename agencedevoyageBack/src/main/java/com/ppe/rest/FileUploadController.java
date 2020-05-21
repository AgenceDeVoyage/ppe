package com.ppe.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

import javax.swing.text.html.HTML;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.data.util.Pair;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ppe.entites.Client;
import com.ppe.entites.pays;

import junit.framework.Test;
import springfox.documentation.spring.web.json.Json;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import java.io.FileReader;
import java.util.Iterator;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FileUploadController {

	public Optional<String> getExtensionByStringHandling(String filename) {
		return Optional.ofNullable(filename).filter(f -> f.contains("."))
				.map(f -> f.substring(filename.lastIndexOf(".") + 1));
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("image") MultipartFile file) throws IOException {
		File convertFile = new File(
				// "D:/dev/mohamed/ppe/agencedevoyageBack/src/main/resources/upload/" +
				// file.getOriginalFilename());
				"D:/dev/mohamed/ppe/agencedevoyageBack/src/main/resources/upload/" + UUID.randomUUID().toString() + "."
						+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1));
		convertFile.createNewFile();

		try (FileOutputStream fout = new FileOutputStream(convertFile)) {
			fout.write(file.getBytes());
		} catch (Exception exe) {
			exe.printStackTrace();
		}

		return convertFile.getName();
	}

	@GetMapping("/getNat")
	public Collection<String> findALL() throws IOException
	{
	    List<String> liste = new ArrayList<String>();
	    try {
			File myObj = new File("D:/dev/mohamed/ppe/agencedevoyageBack/src/main/resources/scraping/nat.json");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("data ="+data);
				liste.add(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return liste;
	}
}
